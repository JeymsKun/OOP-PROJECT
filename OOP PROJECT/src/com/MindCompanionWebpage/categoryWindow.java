package com.MindCompanionWebpage;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class categoryWindow extends JFrame{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public categoryWindow() {
		initialize();
	}
	
	private void initialize() {
		
        setBounds(100, 100, 1366, 768);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

		JLabel categoryLabel = new JLabel("Categories");
		categoryLabel.setHorizontalAlignment(SwingConstants.CENTER);
		categoryLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		categoryLabel.setBounds(540, 140, 293, 35);
		add(categoryLabel);

		JButton categoryButton1 = new JButton("Panic");
		categoryButton1.setFont(new Font("Tahoma", Font.BOLD, 15));
		categoryButton1.setBounds(560, 220, 120, 120);
		add(categoryButton1);
		categoryButton1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	categoryContent1 content1 = new categoryContent1();
		    	content1.setVisible(true);
		    	
		    	dispose();
            }
        });
	   
			
		JButton categoryButton2 = new JButton("Depression");
		categoryButton2.setFont(new Font("Tahoma", Font.BOLD, 15));
		categoryButton2.setBounds(700, 220, 120, 120);
		add(categoryButton2);
		categoryButton2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	categoryContent2 content2 = new categoryContent2();
		    	content2.setVisible(true);
		    	
		    	dispose();
            }
        });
        
        JButton categoryButton3 = new JButton("Stress");
		categoryButton3.setFont(new Font("Tahoma", Font.BOLD, 15));
        categoryButton3.setBounds(560, 360, 120, 120);
		add(categoryButton3);
        categoryButton3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	categoryContent3 content3 = new categoryContent3();
		    	content3.setVisible(true);
		    	
		    	dispose();
            }
        });
		
		
		JButton categoryButton4 = new JButton("Anxiety");
		categoryButton4.setFont(new Font("Tahoma", Font.BOLD, 15));
		categoryButton4.setBounds(700, 360, 120, 120);
		add(categoryButton4);
		categoryButton4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	categoryContent4 content4 = new categoryContent4();
		    	content4.setVisible(true);
		    	
		    	dispose();
            }
        });
		


		
		
	}
}