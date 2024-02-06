package com.database;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Form  extends JFrame implements ActionListener {
    JTextField text1,text2;
    JPasswordField passwordField;
    JLabel label1,label2,label3;
    JButton submit,cancel;
    JFrame informationFrame;

    Form(){

        JPanel innerPanel = new JPanel();
        JPanel innerPanel1 = new JPanel();


        label1 = new JLabel("Username:");
        label1.setPreferredSize(new Dimension(40,30));
        label2 = new JLabel("Email:");
        label2.setPreferredSize(new Dimension(40,30));
        label3= new JLabel("Password:");
        label3.setPreferredSize(new Dimension(40,30));

        text1 = new JTextField();
        text1.setBounds(120,30,60,40);
        text2 =new JTextField();
        text2.setBounds(120,90,60,40);

        passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(60,40));
        passwordField.setBounds(120,150,60,40);

        submit = new JButton("Submit");
        cancel = new JButton("Cancel");
        submit.addActionListener(this);
        cancel.addActionListener(this);


        add(innerPanel);
        add(innerPanel1);
        innerPanel.add(label1); innerPanel.add(text1);
        innerPanel.add(label2); innerPanel.add(text2);
        innerPanel.add(label3); innerPanel.add(passwordField);
        innerPanel.add(submit); innerPanel.add(cancel);



        innerPanel1.setLayout(new GridLayout(3,0));
        innerPanel1.setSize(200,200);
        innerPanel.setLayout(new GridLayout(5,2));
        innerPanel.setSize(400,400);




    }

    public static void main(String[] args) {

    Form form = new Form();


    form.setLayout(new FlowLayout(FlowLayout.CENTER));
    form.setVisible(true);
    form.setSize(800,800);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == submit) {
                String username = text1.getText();
                String email = text2.getText();
                String password = new String(passwordField.getPassword());

                 if(informationFrame== null){
                     informationFrame = new JFrame("User Information");
                     informationFrame.setLayout(new GridLayout(3, 0));
                     informationFrame.setSize(400, 400);


                 }

                JLabel usernameLabel = new JLabel("Username: " + username);
                JLabel emailLabel = new JLabel("Email: " + email);
                JLabel passwordLabel = new JLabel("Password: " + password);

                informationFrame.add(usernameLabel);
                informationFrame.add(emailLabel);
                informationFrame.add(passwordLabel);

                informationFrame.setLayout(new GridLayout(3,0));
                informationFrame.setVisible(true);
                informationFrame.pack();

        } else if (e.getSource() == cancel) {
               text1.setText("");
              text2.setText("");
            passwordField.setText("");
        }
    }
}
