package com.Basic.JavaPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array elements (ensure valid input for 6 elements)
        int[] data = getArrayElements(scanner, 6);

        // User input loop
        while (true) {
            try {
                int valueToFind = getNumberToSearch(scanner);

                // Perform linear search for efficiency
                int foundIndex = linearSearch(data, valueToFind);

                // Handle search result and print output
                if (foundIndex != -1) {
                    System.out.println("The data " + valueToFind + " is found at index " + foundIndex);
                } else {
                    System.out.println("The data " + valueToFind + " is not found in the array.");
                }

                // Optionally ask if the user wants to search again
                if (!askToSearchAgain(scanner)) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // Clear scanner buffer
            }
        }

        scanner.close();
    }

    // Get array elements (ensure valid input)
    private static int[] getArrayElements(Scanner scanner, int numElements) {
        int[] data = new int[numElements];
        System.out.println("Enter " + numElements + " values for the array:");

        for (int i = 0; i < numElements; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // Clear scanner buffer
            }
            data[i] = scanner.nextInt();
        }

        return data;
    }

    // Get value to search (ensure valid input)
    private static int getNumberToSearch(Scanner scanner) {
        System.out.println("Enter the data you want to locate:");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.nextLine(); // Clear scanner buffer
        }
        return scanner.nextInt();
    }

    // Perform linear search (assuming array is not sorted)
    private static int linearSearch(int[] data, int value) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1; // Value not found
    }

    // Ask if the user wants to search again
    private static boolean askToSearchAgain(Scanner scanner) {
        System.out.print("Do you want to search again? (y/n): ");
        String answer = scanner.nextLine();
        return answer.toLowerCase().startsWith("y");
    }
}

