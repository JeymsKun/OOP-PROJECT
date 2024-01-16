package com.MindCompanionWebpage;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class LoginWindow extends JFrame {

	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginWindow() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jesus Christ\\Downloads\\yawaLogo.jpg"));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1020, 650);
        setLayout(null);
        
        BufferedImage image = null;
		try {
			image = ImageIO.read(new File("D:/eclipse/.metadata/MindCompanion2/src/com/anonymous/hack/all/yawaLogo.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        ImageIcon logoIcon = new ImageIcon(image.getScaledInstance(200, -1, Image.SCALE_SMOOTH));
        
        JLabel logo = new JLabel(logoIcon);
        logo.setBounds((getWidth() - 250)/2, (getHeight() - logo.getPreferredSize().height) / 2 + logo.getPreferredSize().height - 360, 250, logo.getPreferredSize().height);
        add(logo);
        
        JLabel welcomeLabel = new JLabel("Welcome to MindCompanion");
        welcomeLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setBounds((getWidth() - 250)/2, (getHeight() - welcomeLabel.getPreferredSize().height) / 2 + welcomeLabel.getPreferredSize().height - 60, 250, welcomeLabel.getPreferredSize().height);
        add(welcomeLabel);
        
        JTextField usernameField = new JTextField("   Username");
        Font usernameFont = new Font("Tahoma", Font.BOLD, 14);
        usernameField.setFont(usernameFont);
        usernameField.setBounds((getWidth() - 270) / 2, (getHeight() - usernameField.getPreferredSize().height) / 2 + usernameField.getPreferredSize().height + 1, 270, usernameField.getPreferredSize().height + 15);
        usernameField.setForeground(Color.GRAY);
        usernameField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (usernameField.getText().equals("   Username")) {
                	usernameField.setText("");
                	usernameField.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (usernameField.getText().isEmpty()) {
                	usernameField.setForeground(Color.GRAY);
                	usernameField.setText("   Username");
                }
            }
        });
        add(usernameField);

        JPasswordField passwordField = new JPasswordField("   Password");
        Font passwordLabelFont = new Font("Tahoma", Font.BOLD, 14);
        passwordField.setFont(passwordLabelFont);
        passwordField.setBounds((getWidth() - 270) / 2, (getHeight() - passwordField.getPreferredSize().height) / 2 + passwordField.getPreferredSize().height + 50, 270, passwordField.getPreferredSize().height + 15);
        passwordField.setEchoChar((char) 0); 
        passwordField.setForeground(Color.GRAY);
        passwordField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);
                if (password.equals("   Password")) {
                    passwordField.setText("");
                    passwordField.setEchoChar('*'); 
                    passwordField.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);
                if (password.isEmpty()) {
                    passwordField.setForeground(Color.GRAY);
                    passwordField.setEchoChar((char) 0); 
                    passwordField.setText("   Password");
                }
            }
        });
        add(passwordField);
        
        JButton signinButton = new JButton("LOGIN");
        signinButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {     	
        		
        	}
        });
        signinButton.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
        signinButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        signinButton.setBounds((getWidth() - 270) / 2, (getHeight() - signinButton.getPreferredSize().height) / 2 + signinButton.getPreferredSize().height + 120, 270, signinButton.getPreferredSize().height);
        add(signinButton);
        
        JCheckBox checkBox = new JCheckBox("Remember me.");
        checkBox.setFont(new Font("Arial", Font.BOLD, 9));
        checkBox.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
            	checkBox.setForeground(Color.BLUE); 
            }

            public void mouseExited(MouseEvent e) {
            	checkBox.setForeground(UIManager.getColor("Button.foreground")); 
            }
        });
        checkBox.setBounds((getWidth() - 280)/2, (getHeight() - checkBox.getPreferredSize().height) / 4 + checkBox.getPreferredSize().height + 250 , 120, checkBox.getPreferredSize().height);
        add(checkBox);
        
        JButton forgotButton = new JButton("Forgot password?");
        forgotButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {     	
        		SignupWindow signin = new SignupWindow();
        		signin.setVisible(true);
        		dispose();
        	}
        });
        forgotButton.setFont(new Font("Arial", Font.BOLD, 9));
        forgotButton.setBorderPainted(false);
        forgotButton.setFocusPainted(false);
        forgotButton.setContentAreaFilled(false);
        forgotButton.setBorder(new EmptyBorder(0, 0, 0, 0));
        
        forgotButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                forgotButton.setForeground(Color.BLUE); 
            }

            public void mouseExited(MouseEvent e) {
                forgotButton.setForeground(UIManager.getColor("Button.foreground")); 
            }
        });
        forgotButton.setBounds((getWidth() + 67) / 2, (getHeight() - forgotButton.getPreferredSize().height) / 2 + forgotButton.getPreferredSize().height + 100, 120, forgotButton.getPreferredSize().height);
        add(forgotButton);
        
        JLabel continueLabel = new JLabel("or continue with");
        continueLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        continueLabel.setBounds((getWidth() + 380)/3, (getHeight() - continueLabel.getPreferredSize().height) / 2 + continueLabel.getPreferredSize().height + 180, 100, continueLabel.getPreferredSize().height);
        add(continueLabel);
        
        JButton logoFacebookButton = new JButton("");
        logoFacebookButton.setHorizontalTextPosition(SwingConstants.CENTER);
        logoFacebookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	SignupWindow signin = new SignupWindow();
        		signin.setVisible(true);
        		dispose();
            }
        });

        
        try {
            BufferedImage originalImage = ImageIO.read(new File("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Jesus Christ\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\facebook-logo.png"));
            
            
            int width = 45; 
            int height = 45;
            Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            
          
            logoFacebookButton.setIcon(new ImageIcon(scaledImage));

        } catch (IOException e) {
            e.printStackTrace();
        }

        logoFacebookButton.setBounds((getWidth() + 240)/3, (getHeight() - logoFacebookButton.getPreferredSize().height) / 2 + logoFacebookButton.getPreferredSize().height + 180, 100, logoFacebookButton.getPreferredSize().height + 5);
        logoFacebookButton.setBorderPainted(false);
        logoFacebookButton.setFocusPainted(false);
        logoFacebookButton.setContentAreaFilled(false);
        logoFacebookButton.setBorder(new EmptyBorder(0, 0, 0, 0));
        add(logoFacebookButton);
        
        JButton logoGoogleButton = new JButton("");
        logoGoogleButton.setHorizontalTextPosition(SwingConstants.CENTER);
        logoGoogleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	SignupWindow signin = new SignupWindow();
        		signin.setVisible(true);
        		dispose();
            }
        });

        
        try {
            BufferedImage originalImage = ImageIO.read(new File("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\Jesus Christ\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\google-logo.png"));
            
           
            int width = 55; 
            int height = 55; 
            Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            
            // Set the scaled image to the button
            logoGoogleButton.setIcon(new ImageIcon(scaledImage));

        } catch (IOException e) {
            e.printStackTrace();
        }

        logoGoogleButton.setBounds((getWidth() + 490)/3, (getHeight() - logoGoogleButton.getPreferredSize().height) / 2 + logoGoogleButton.getPreferredSize().height + 170, 100, logoGoogleButton.getPreferredSize().height + 5);
        logoGoogleButton.setBorderPainted(false);
        logoGoogleButton.setFocusPainted(false);
        logoGoogleButton.setContentAreaFilled(false);
        logoGoogleButton.setBorder(new EmptyBorder(0, 0, 0, 0));
        add(logoGoogleButton);
        
	}
}