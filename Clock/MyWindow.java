package com.company.Clock;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.Timer;
import javax.swing.*;
import javax.swing.JLabel;

public class MyWindow extends JFrame {

	
	private JLabel heading;
	private JLabel clockLabel;
	private Font font=new Font("",Font.BOLD,35);
	
	
	public MyWindow() {
		super.setTitle("My Clock");
		super.setSize(400,400);
		super.setLocation(500,50);
		this.createGui();
		this.startClock();
		super.setVisible(true);
		
	}
	
	public void createGui() {
		heading =new JLabel("My Clock");
		clockLabel=new JLabel("Clock");
		heading.setFont(font);
	    clockLabel.setFont(font);
	    
	    this.setLayout(new GridLayout(2,1));
	    this.add(heading);
	    this.add(clockLabel);
	    
	}
	
	public void startClock() {
		Timer timer =new Timer(1000, new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				Date date=new Date();
				SimpleDateFormat sdFormat=new SimpleDateFormat("hh:mm:ss");
				String dateTime=sdFormat.format(date);
				clockLabel.setText(dateTime);
			}
		});
		timer.start();
	}
}
