package com.MindCompanionWebpage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class SignupWindow extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public SignupWindow() {
		initialize();
	}
	
	private void initialize() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jesus Christ\\Downloads\\yawaLogo.jpg"));
		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1020, 650);
        setLayout(null);
        
        JLabel welcomeLabel = new JLabel("Mind Companion");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));//pwede gyud ni sya mailisan ang font "Arial" ug font.BOLD, 20.
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setBounds((getWidth() - 250)/2, (getHeight() - welcomeLabel.getPreferredSize().height) / 2 + welcomeLabel.getPreferredSize().height - 275, 250, welcomeLabel.getPreferredSize().height);
        add(welcomeLabel);
        
        JLabel FirstNameLabel = new JLabel("First Name: ");
        FirstNameLabel.setFont(new Font("Arial", Font.BOLD, 13));
        FirstNameLabel.setBounds((getWidth() - 30)/3, (getHeight() - FirstNameLabel.getPreferredSize().height) / 2 + FirstNameLabel.getPreferredSize().height - 197, 90, FirstNameLabel.getPreferredSize().height);
        add(FirstNameLabel);
        
        JTextField FirstNameTextField = new JTextField("");
        FirstNameTextField.setFont(new Font("Arial", Font.BOLD, 13));//pag type nimo kalit rag ka arial bold 15 hahaha, pwede ra ilisan or e remove.
        FirstNameTextField.setBounds((getWidth() - 180)/2, (getHeight() - FirstNameTextField.getPreferredSize().height) / 2 + FirstNameTextField.getPreferredSize().height - 202, 250, FirstNameTextField.getPreferredSize().height);
        add(FirstNameTextField);
        
        JLabel LastNameLabel = new JLabel("Last Name: ");
        LastNameLabel.setFont(new Font("Arial", Font.BOLD, 13));
        LastNameLabel.setBounds((getWidth() - 30)/3, (getHeight() - LastNameLabel.getPreferredSize().height) / 4 + LastNameLabel.getPreferredSize().height - 5, 90, LastNameLabel.getPreferredSize().height);
        add(LastNameLabel);
        
        JTextField LastNameTextField = new JTextField("");
        LastNameTextField.setFont(new Font("Arial", Font.BOLD, 13));
        LastNameTextField.setBounds((getWidth() - 180)/2, (getHeight() - LastNameTextField.getPreferredSize().height) / 4 + LastNameTextField.getPreferredSize().height - 9 , 250, LastNameTextField.getPreferredSize().height);
        add(LastNameTextField);
        
        JLabel MiddleNameLabel = new JLabel("Middle Name: ");
        MiddleNameLabel.setFont(new Font("Arial", Font.BOLD, 13));
        MiddleNameLabel.setBounds((getWidth() - 30)/3, (getHeight() - MiddleNameLabel.getPreferredSize().height) / 3 + MiddleNameLabel.getPreferredSize().height - 24, 100, MiddleNameLabel.getPreferredSize().height);
        add(MiddleNameLabel);
        
        JTextField MiddleNameTextField = new JTextField("");
        MiddleNameTextField.setFont(new Font("Arial", Font.BOLD, 13));
        MiddleNameTextField.setBounds((getWidth() - 145)/2, (getHeight() - MiddleNameTextField.getPreferredSize().height) / 3 + MiddleNameTextField.getPreferredSize().height - 28 , 233, MiddleNameTextField.getPreferredSize().height);
        add(MiddleNameTextField);
        
        JLabel genderLabel = new JLabel("Gender: ");
        genderLabel.setFont(new Font("Arial", Font.BOLD, 13));
        genderLabel.setBounds((getWidth() + 80)/3, (getHeight() - genderLabel.getPreferredSize().height) / 4 + genderLabel.getPreferredSize().height + 77, 70, genderLabel.getPreferredSize().height);
        add(genderLabel);
        
        JCheckBox checkBo1 = new JCheckBox("Male");
        checkBo1.setFont(new Font("Arial", Font.BOLD, 13));
        checkBo1.setBounds((getWidth() - 153)/2, (getHeight() - checkBo1.getPreferredSize().height) / 3 + checkBo1.getPreferredSize().height + 14 , 70, checkBo1.getPreferredSize().height);
        add(checkBo1);
        
        JCheckBox checkBox2 = new JCheckBox("Female");
        checkBox2.setFont(new Font("Arial", Font.BOLD, 13));
        checkBox2.setBounds((getWidth() - 1)/2, (getHeight() - checkBox2.getPreferredSize().height) / 4 + checkBox2.getPreferredSize().height + 66 , 90, checkBox2.getPreferredSize().height);
        add(checkBox2);
        
        JCheckBox checkBox3 = new JCheckBox("Custom");
        checkBox3.setFont(new Font("Arial", Font.BOLD, 13));
        checkBox3.setBounds((getWidth() + 181)/2, (getHeight() - checkBox3.getPreferredSize().height) / 4 + checkBox3.getPreferredSize().height + 66 , 90, checkBox3.getPreferredSize().height);
        add(checkBox3);
        
        JLabel birthdayLabel = new JLabel("Birthday: ");
        birthdayLabel.setFont(new Font("Arial", Font.BOLD, 13));
        birthdayLabel.setBounds((getWidth() + 80)/3, (getHeight() - birthdayLabel.getPreferredSize().height) / 4 + birthdayLabel.getPreferredSize().height + 108, 70, birthdayLabel.getPreferredSize().height);
        add(birthdayLabel);
        
        JTextField date = new JTextField("Date");
        Font dateFont = new Font("Arial", Font.BOLD, 14);
        setFont(dateFont);
        date.setHorizontalAlignment(SwingConstants.CENTER);
        date.setForeground(Color.GRAY);
        date.setBounds((getWidth() - 143)/2, (getHeight() - date.getPreferredSize().height) / 3 + date.getPreferredSize().height + 50, 50, date.getPreferredSize().height);
        date.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (date.getText().equals("Date")) {
                	date.setText("");
                	date.setForeground(Color.BLACK);
                	        
                }
            }

            public void focusLost(FocusEvent e) {
                if (date.getText().isEmpty()) {
                	date.setForeground(Color.GRAY);
                	date.setText("Date");
                	

                }
            }
        });
        add(date);
       
        JTextField month = new JTextField("Month");
        Font monthFont = new Font("Arial", Font.BOLD, 14);
        setFont(monthFont);
        month.setHorizontalAlignment(SwingConstants.CENTER);
        month.setForeground(Color.GRAY);
        month.setBounds((getWidth() - 10)/2, (getHeight() - month.getPreferredSize().height) / 3 + month.getPreferredSize().height + 50, 50, month.getPreferredSize().height);
        month.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (month.getText().equals("Month")) {
                	month.setText("");
                	month.setForeground(Color.BLACK);
                	        
                }
            }

            public void focusLost(FocusEvent e) {
                if (month.getText().isEmpty()) {
                	month.setForeground(Color.GRAY);
                	month.setText("Month");
                	

                }
            }
        });
        add(month);
        
        JTextField year = new JTextField("Year");
        Font yearFont = new Font("Arial", Font.BOLD, 14);
        setFont(yearFont);
        year.setHorizontalAlignment(SwingConstants.CENTER);
        year.setForeground(Color.GRAY);
        year.setBounds((getWidth() + 130)/2, (getHeight() - year.getPreferredSize().height) / 3 + year.getPreferredSize().height + 50, 50, year.getPreferredSize().height);
        year.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (year.getText().equals("Year")) {
                	year.setText("");
                	year.setForeground(Color.BLACK);
                	        
                }
            }

            public void focusLost(FocusEvent e) {
                if (year.getText().isEmpty()) {
                	year.setForeground(Color.GRAY);
                	year.setText("Year");
                	

                }
            }
        });
        add(year);
        
        JLabel contactLabel = new JLabel("Contact: ");
        contactLabel.setFont(new Font("Arial", Font.BOLD, 13));
        contactLabel.setBounds((getWidth() - 30)/3, (getHeight() - contactLabel.getPreferredSize().height) / 2 + contactLabel.getPreferredSize().height + 7, 90, contactLabel.getPreferredSize().height);
        add(contactLabel);
        
        JTextField contactTextField = new JTextField("");
        contactTextField.setFont(new Font("Arial", Font.BOLD, 13));
        contactTextField.setBounds((getWidth() - 220)/2, (getHeight() - contactTextField.getPreferredSize().height) / 2 + contactTextField.getPreferredSize().height + 3, 225, contactTextField.getPreferredSize().height);
        add(contactTextField);
        
        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 13));
        usernameLabel.setBounds((getWidth() - 30)/3, (getHeight() - usernameLabel.getPreferredSize().height) / 2 + usernameLabel.getPreferredSize().height + 45, 90, usernameLabel.getPreferredSize().height);
        add(usernameLabel);
        
        JTextField usernameTextField = new JTextField("");
        usernameTextField.setFont(new Font("Arial", Font.BOLD, 13));
        usernameTextField.setBounds((getWidth() - 190)/2, (getHeight() - usernameTextField.getPreferredSize().height) / 2 + usernameTextField.getPreferredSize().height + 40, 210, usernameTextField.getPreferredSize().height);
        add(usernameTextField);
        
        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 13));
        passwordLabel.setBounds((getWidth() - 30)/3, (getHeight() - passwordLabel.getPreferredSize().height) / 2 + passwordLabel.getPreferredSize().height +80, 90, passwordLabel.getPreferredSize().height);
        add(passwordLabel);

        JPasswordField passwordField = new JPasswordField("");
        passwordField.setFont(new Font("Arial", Font.BOLD, 13));
        passwordField.setBounds((getWidth() - 190)/2, (getHeight() - passwordField.getPreferredSize().height) / 2 + passwordField.getPreferredSize().height + 75, 210, passwordField.getPreferredSize().height);
        add(passwordField);
        
        JButton signupButton =  new JButton("SIGN UP");
        signupButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
        	}
        });
        signupButton.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
        signupButton.setBounds((getWidth() - 190) / 2, (getHeight() - signupButton.getPreferredSize().height) / 2 + signupButton.getPreferredSize().height + 130, 190, signupButton.getPreferredSize().height + 10);
        add(signupButton);
    }

}

