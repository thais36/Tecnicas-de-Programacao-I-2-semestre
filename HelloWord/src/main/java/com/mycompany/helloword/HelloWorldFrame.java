package com.mycompany.helloword;

import javax.swing.*;

public class HelloWorldFrame extends JFrame{
    public HelloWorldFrame(){
        super("HelloWorldSwing");
        final JLabel label = new JLabel("Hello World");
        getContentPane().add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
     public static void main(String[] args) {
         HelloWorldFrame frame = new HelloWorldFrame();
     }
}