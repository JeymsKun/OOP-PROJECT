package com.showDesignOnly2;


import javax.swing.JFrame;



public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        keep button = new keep();
        button.setBounds(50, 50, 100, 30);
        frame.add(button);

        frame.setVisible(true);
    }
}