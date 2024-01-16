package com.MindCompanionWebpage;

import javax.swing.*;
import javax.swing.plaf.LayerUI;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;


public class categoryContent1 extends JFrame{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	    public categoryContent1() {
	        initialize();
	    }

	    private void initialize() {

	        setBounds(100, 100, 755, 750);
	        setResizable(false);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new GridBagLayout());
	       
	        JPanel panel = new JPanel(new GridBagLayout());
	        JButton bt1 = new JButton("Button");
	        JButton bt2 = new JButton("Click me");
	        
	        GridBagConstraints add = new GridBagConstraints();
	        add.gridx = 0;
	        add.gridy = 0;
	        add.anchor = GridBagConstraints.WEST;
	        add.insets = new Insets(0, 10, 0, 0);
	        panel.add(bt1, add);
	        
	        GridBagConstraints add2 = new GridBagConstraints();
	        add2.gridx = 1;
	        add2.gridy = 0;
	        add2.anchor = GridBagConstraints.EAST;
	        add2.insets = new Insets(0, 50, 0, 10);
	        panel.add(bt2, add2);
	        add(panel, new GridBagConstraints());
	        
	        
	        //JButton categoryButton1 = new JButton("Continue");
	        //categoryButton1.setPreferredSize(new Dimension(100, 30));
	        //add(categoryButton1, new GridBagConstraints());

	        JMenuBar menuBar = new JMenuBar();
	        JMenu menu = new JMenu("Menu");
	     
	        menuBar.add(menu);

	        JMenuItem profileItem = new JMenuItem("Profile");
	        profileItem.setOpaque(true);
	        profileItem.setBackground(Color.BLACK);
	        profileItem.setForeground(Color.WHITE);
	        profileItem.setFont(new Font("Arial", Font.BOLD, 12));
	        menu.add(profileItem);
	        profileItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                
	            }
	        });

	        JMenuItem categoryItem = new JMenuItem("Category");
	        categoryItem.setOpaque(true);
	        categoryItem.setBackground(Color.BLACK);
	        categoryItem.setForeground(Color.WHITE);
	        categoryItem.setFont(new Font("Arial", Font.BOLD, 12));
	        menu.add(categoryItem);
	        categoryItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                
	            }
	        });

	        JMenuItem signOutItem = new JMenuItem("Sign Out");
	        signOutItem.setOpaque(true);
	        signOutItem.setBackground(Color.BLACK);
	        signOutItem.setForeground(Color.WHITE);
	        signOutItem.setFont(new Font("Arial", Font.BOLD, 12));
	        menu.add(signOutItem);
	        signOutItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                
	            }
	        });

	        setJMenuBar(menuBar);
	        setVisible(true);
	    
	    }
	    
	        
	    

	    
      
}
        