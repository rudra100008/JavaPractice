package com.database;

import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class DatabaseForm  extends JFrame {
     JPanel panel;
     JLabel username,password;
     JTextField text1;
     JPasswordField passwordField;
     JButton submit;
    DatabaseForm(){
        panel = new JPanel();
        panel.setSize(400,400);
        panel.setLayout(new GridLayout(3,3));
        add(panel);

        //GridLayout Object
        GridLayout gridLayout = (GridLayout)panel.getLayout();
        gridLayout.setVgap(30);

        username = new JLabel("Username: ");
        panel.add(username);

        text1 = new JTextField(10);

        panel.add(text1);

        password = new JLabel("Password:");
        panel.add(password);

        passwordField = new JPasswordField(10);

        panel.add(passwordField);

        submit = new JButton("Submit");
        panel.add(submit);

        submit.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String username =text1.getText().replaceAll("","");
                String password= new String(passwordField.getPassword());
                try{
                    String url ="jdbc:mysql://localhost:3306/form";
                    String dbusername ="root";
                    String dbpassword ="";
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection(url,dbusername,dbpassword);
                    Statement statement = connection.createStatement();
                    ResultSet resultSet= statement.executeQuery("SELECT * FROM login");
                    while(resultSet.next()){
                        System.out.println("Username: "+ resultSet.getString(1)
                                +"\n"+"Password: "+ resultSet.getString(2)
                        );
                    }
                    String sql = "INSERT INTO login(username,password) VALUES (?,?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1,username);
                    preparedStatement.setString(2,password);
                    int rowsInsert = preparedStatement.executeUpdate();
                    if (rowsInsert>0){
                        System.out.println("Data is inserted...");
                    }else {
                        System.out.println("Data is not inserted...");
                    }

                }catch(Exception exception){
                    exception.printStackTrace();
                }

            }
        });



    }

    public static void main(String[] args) {

        DatabaseForm databaseForm = new DatabaseForm();

        databaseForm.setTitle("Registration Form");
        databaseForm.setSize(700,700);

        databaseForm.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        databaseForm.setVisible(true);



    }
}
