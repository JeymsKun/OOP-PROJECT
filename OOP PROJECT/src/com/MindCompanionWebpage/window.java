package com.MindCompanionWebpage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class window extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public window() {
		initialize();
	}
	
	private void initialize() {
		
        setBounds(100, 100, 1366, 768);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
       
        
        JLabel showLogo = new JLabel("");
		showLogo.setHorizontalAlignment(SwingConstants.CENTER);
		showLogo.setIcon(new ImageIcon(getClass().getResource("/com/fixMindCompanion/th3.jpg")));
		showLogo.setBounds(485, 10, 400, 400);
		add(showLogo);

        JLabel welcomeAddress = new JLabel("Create an account");
		welcomeAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		welcomeAddress.setBounds(620, 355, 293, 35);
		add(welcomeAddress);

		JLabel direct = new JLabel("Already have an account?");
		direct.setFont(new Font("Tahoma", Font.BOLD, 14));
		direct.setBounds(600, 570, 293, 35);
		add(direct);
		
		JTextField emailField = new JTextField("Email");
        Font emailLabelFont = new Font("Tahoma", Font.BOLD, 14);
        emailField.setFont(emailLabelFont);
        emailField.setBounds(538, 400, 293, 35);
        emailField.setForeground(Color.GRAY);
        emailField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (emailField.getText().equals("Email")) {
                    emailField.setText("");
                    emailField.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (emailField.getText().isEmpty()) {
                    emailField.setForeground(Color.GRAY);
                    emailField.setText("Email");
                }
            }
        });
        add(emailField);

        JPasswordField passwordField = new JPasswordField("Password");
        Font passwordLabelFont = new Font("Tahoma", Font.BOLD, 14);
        passwordField.setFont(passwordLabelFont);
        passwordField.setBounds(538, 445, 293, 35);
        passwordField.setEchoChar((char) 0); // Make the password visible
        passwordField.setForeground(Color.GRAY);
        passwordField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);
                if (password.equals("Password")) {
                    passwordField.setText("");
                    passwordField.setEchoChar('*'); // Set the echo char back to '*'
                    passwordField.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);
                if (password.isEmpty()) {
                    passwordField.setForeground(Color.GRAY);
                    passwordField.setEchoChar((char) 0); // Make the password visible
                    passwordField.setText("Password");
                }
            }
        });
        add(passwordField);

        JButton continueButton = new JButton("Continue");
        continueButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        continueButton.setBounds(538, 490, 293, 35);
        continueButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	categoryWindow category = new categoryWindow();
		    	category.setVisible(true);
		    	dispose();
            }

			
        });
        add(continueButton);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(538, 560, 293, 6);
        separator.setOrientation(SwingConstants.HORIZONTAL);
        separator.setBackground(Color.BLACK);
        separator.setOpaque(true);
        add(separator);
        
        JButton imageButton = new JButton(" ");
        imageButton.setIcon(new ImageIcon("/eclipse/.metadata/project/src/com/fixMindCompanion/OIP%20(1)2.jpg"));
        imageButton.setBounds(264, 630, 50, 50);
        add(imageButton);
        

		JButton imageButton2 = new JButton(" ");
		imageButton2.setIcon(new ImageIcon("/eclipse/.metadata/project/src/com/fixMindCompanion/OIP%20(1)2.jpg"));
		imageButton2.setBounds(422, 630, 50, 50);
		//soon to make a rounded border.
		//btnNewButton_1.setBorder(new LineBorder(Color.BLUE));
		add(imageButton2);

    }

}
