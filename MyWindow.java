package com.practice;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class MyWindow extends JFrame {

    private JLabel heading;

    private JLabel clockLabel;

    private Font font = new Font("",Font.BOLD,35);

    MyWindow()
    {
        super.setTitle("my clock");
        super.setSize(400,400);
        super.setLocation(300,50);
        this.createGUI();
        this.startClock();
        super.setVisible(true);
    }


    public  void createGUI() 
    {
        
        heading = new JLabel("My clock");
        
        clockLabel = new JLabel("clock");

        heading.setFont(font);
        clockLabel.setFont(font);

        this.setLayout(new GridLayout(2,1));

        this.add(heading);
        
        this.add(clockLabel);
    }

    public void startClock()
    {
        Timer timer = new Timer(1000,new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // String dateTime = new Date().toString();  // formating first method 

                // String dateTime = new Date().toLocaleString(); //formating second method
                
                Date d = new Date();

                SimpleDateFormat sfd = new SimpleDateFormat("hh : mm : ss " + "Y");

                String dateTime = sfd.format(d);

                clockLabel.setText(dateTime);
            }
        });

        timer.start();
    }

    
}  
    
