package ConsoleGame;

import java.util.Scanner;



public class RockPaperScissor {
    public static void paperRockScissor(String first,String second){
        if (
               first.equals(second)
        ){
            System.out.println("It is tie");
        }else if (
                        (first.equals("paper")&& second.equals("rock")) ||
                        (first.equals("rock") && second.equals("scissor")) ||
                        (first.equals("scissor") && second.equals("paper"))
        ){
            System.out.println("The winner is FirstPerson");
        }else {
            System.out.println("The winner is SecondPerson");
        }

    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while(true) {
            System.out.println("Enter your Choice(FirstPerson): ");
            String firstPerson = scanner.next().toLowerCase();
            System.out.println("Enter your Choice(SecondPerson): ");
            String secondPerson = scanner.next().toLowerCase();
            paperRockScissor(firstPerson, secondPerson);

        }

    }
}
