package com.MindCompanionWebpage;

import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class SigninSignupWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	

	public SigninSignupWindow() {
		//kanang setIconImage() gawas na sa JFrame ni. Kabantay ka na pag run nimo sa Java Swing nay murag kape sa kilid, oh
		//mao na, kung mag ilis kag picture, pwede ra e remove nang sulod ana " ", pag human copy lng ang file na gikan sa File Manager, e open ang file mag new window na automatic
		//tapos copy nang nay, tan awa sa sample anang sa sulod " ", tapos mao ra pwede ra walay C:\\ or pwede pud naa, depende ata na sa IDE.
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jesus Christ\\Downloads\\yawaLogo.jpg"));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1020, 650);
        setLayout(null);
        
        BufferedImage image = null;//ambot nganong null.
		try {//try catch pang block sa ga error na code biskan correct hahaha or arte lng guro ning IDE.
			image = ImageIO.read(new File("D:/eclipse/.metadata/MindCompanion2/src/com/anonymous/hack/all/yawaLogo.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        ImageIcon logoIcon = new ImageIcon(image.getScaledInstance(200, -1, Image.SCALE_SMOOTH));//adjust size sa image.jpeg/png ug e smooth niya.
        //automatic nanang setBounds() no need na e adjust ang JFrame, pwede ra ilisan ang setSize() bisan unsa then unless kung gamay
        //ang components pwede ra e adjust kanang "getWidth() - 250)/2" ayaw hilabti ang /2, ang "250" ra e adjust, kayp kanang /2 is calculated na sya para ma
        //center ang components kanang getHeight() -...... nay -300, 250, kanang -300 is sa height na sya ambot nganong na negative hahaha, ang 250 is sa getWidth()
        //kon unsa may e input nimo sa getWidth() , e input pud sa "getWidth() - " ")/2". 
        JLabel logo = new JLabel(logoIcon);
        logo.setHorizontalAlignment(SwingConstants.CENTER);
        logo.setBounds((getWidth() - 250)/2, (getHeight() - logo.getPreferredSize().height) / 2 + logo.getPreferredSize().height - 300, 250, logo.getPreferredSize().height);
        add(logo);
        
        JLabel welcomeLabel = new JLabel("Welcome to MindCompanion");
        welcomeLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 16));//dri murag walay problema kon ma encounter kag error basin need nag import.
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setBounds((getWidth() - 250)/2, (getHeight() - welcomeLabel.getPreferredSize().height) / 2 + welcomeLabel.getPreferredSize().height - 15, 250, welcomeLabel.getPreferredSize().height);
        add(welcomeLabel);
        
        JButton signinButton = new JButton("LOGIN");
        signinButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		LoginWindow login = new LoginWindow();
        		login.setVisible(true);
        		dispose();
        		
        	}
        });
        signinButton.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
        signinButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        signinButton.setBounds((getWidth() - 270) / 2, (getHeight() - signinButton.getPreferredSize().height) / 2 + signinButton.getPreferredSize().height + 30, 270, signinButton.getPreferredSize().height);
        add(signinButton);
        
        JButton signupButton =  new JButton("SIGN UP");
        signupButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		SignupWindow signin = new SignupWindow();
        		signin.setVisible(true);
        		dispose();
        	}
        });
        signupButton.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
        signupButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        signupButton.setBounds((getWidth() - 270) / 2, (getHeight() - signupButton.getPreferredSize().height) / 2 + signupButton.getPreferredSize().height + 70, 270, signupButton.getPreferredSize().height);
        add(signupButton);
        
        
    }
    
}   
		
