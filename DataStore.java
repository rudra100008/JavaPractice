package com.database;
//Write a program that stores student names in a list and performs operations like
//adding, removing, and searching.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class DataStore extends JFrame {
    private final JLabel name, rollNo, marks;
    private final JTextField nameField, rollNoField, marksField;
    private final JButton add, remove, search;

    DataStore() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(5, 5, 5, 5);

        name = new JLabel("Name: ");
        panel.add(name, gbc);

        gbc.gridx = 1;
        nameField = new JTextField("", 10);
        panel.add(nameField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;

        rollNo = new JLabel("RollNo: ");
        panel.add(rollNo, gbc);

        gbc.gridx = 1;
        rollNoField = new JTextField("", 10);
        panel.add(rollNoField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        marks = new JLabel("Marks: ");
        panel.add(marks, gbc);

        gbc.gridx = 1;
        marksField = new JTextField("", 10);
        panel.add(marksField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 4;
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        add = new JButton("ADD");
        buttonPanel.add(add);
        remove = new JButton("Remove");
        buttonPanel.add(remove);
        search = new JButton("Search");
        buttonPanel.add(search);
        panel.add(buttonPanel, gbc);

        add(panel);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getName = nameField.getText().replaceAll(" ", " ");
                int getRollNo = Integer.parseInt(rollNoField.getText().replaceAll(" ", " "));
                String getmarks = marksField.getText().replaceAll(" ", " ");
                try {
                    String url = "jdbc:mysql://localhost:3306/StudentForm";
                    String username = "root";
                    String password = "";
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection(url, username, password);

                    String sql = "INSERT INTO student(rollno,name,marks) VALUES(?,?,?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setInt(1, getRollNo);
                    preparedStatement.setString(2, getName);
                    preparedStatement.setString(3, getmarks);
                    int insert = preparedStatement.executeUpdate();
                    if (insert > 0) {
                        System.out.println("Data Inserted.....");
                        nameField.setText("");
                        rollNoField.setText("");
                        marksField.setText("");
                    } else {
                        System.out.println("Data not Inserted.....");
                    }
                    preparedStatement.close();
                    connection.close();
                } catch (Exception exception) {
                    System.out.println(exception);
                }
            }
        });
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchButton();
            }
        });

        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Data Store");
        setVisible(true);
    }

    public void searchButton() {
        JFrame dataFrame = new JFrame("Data From Database");
        dataFrame.setSize(400, 300);
        dataFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel dataPanel = new JPanel(new GridLayout(0, 1));
        try {
            String url = "jdbc:mysql://localhost:3306/StudentForm";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, "root", "");
            String sql = "SELECT * FROM student";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String rollNo = resultSet.getString("rollno");
                String name = resultSet.getString("name");
                String marks = resultSet.getString("marks");

                JLabel dataLabel = new JLabel("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
                dataPanel.add(dataLabel);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException sqlException) {
            sqlException.printStackTrace();
        }
        dataFrame.add(new JScrollPane(dataPanel));
        dataFrame.setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(DataStore::new);
    }
}

