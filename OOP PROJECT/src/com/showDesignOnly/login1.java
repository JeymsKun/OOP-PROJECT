package com.showDesignOnly;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.MenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.MenuEvent;



public class login1 {

	private JFrame frame;
	
	 private MenuEvent event;
	 private String[][] menuItems = new String[][]{
	        {"Dashboard"},
	        {"Email", "Inbox", "Read", "Compost"},
	        {"Chat"},
	        {"Calendar"},
	        {"UI Kit", "Accordion", "Alerts", "Badges", "Breadcrumbs", "Buttons", "Button group"},
	        {"Advanced UI", "Cropper", "Owl Carousel", "Sweet Alert"},
	        {"Forms", "Basic Elements", "Advanced Elements", "SEditors", "Wizard"},
	        {"Charts", "Apex", "Flot", "Peity", "Sparkline"},
	        {"Table", "Basic Tables", "Data Table"},
	        {"Icons", "Feather Icons", "Flag Icons", "Mdi Icons"},
	        {"Special Pages", "Blank page", "Faq", "Invoice", "Profile", "Pricing", "Timeline"}
	    };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login1 window = new login1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new MigLayout());
		
		layout = new MigLayout("wrap 1, fillx, gapy 0, inset 2", "fill");
	       frame.setLayout(layout);
	       frame.setOpaque(true);
	        //  Init MenuItem
	       for (int i = 0; i < menuItems.length; i++) {
	           frame.addMenu(menuItems[i][0], i);
	       }
		
		
		
		
	    frame.setVisible(true);
       
    }
	private void addMenu(String menuName, int index) {
        int length = menuItems[index].length;
        MenuItem item = new MenuItem(menuName, index, length > 1);
        Icon icon = getIcon(index);
        if (icon != null) {
            item.setIcon(icon);
        }
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (length > 1) {
                    if (!item.isSelected()) {
                        item.setSelected(true);
                        addSubMenu(item, index, length, getComponentZOrder(item));
                    } else {
                        //  Hide menu
                        hideMenu(item, index);
                        item.setSelected(false);
                    }
                } else {
                    if (event != null) {
                        event.selected(index, 0);
                    }
                }
            }
        });
        add(item);
       
    }
	
	private void addSubMenu(MenuItem item, int index, int length, int indexZorder) {
        JPanel panel = new JPanel(new MigLayout("wrap 1, fillx, inset 0, gapy 0", "fill"));
        panel.setName(index + "");
        panel.setBackground(new Color(18, 99, 63));
        for (int i = 1; i < length; i++) {
            MenuItem subItem = new MenuItem(menuItems[index][i], i, false);
            subItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (event != null) {
                        event.selected(index, subItem.getIndex());
                    }
                }
            });
            subItem.initSubMenu(i, length);
            panel.add(subItem);
        }
        frame.add(panel, "h 0!", indexZorder + 1);
        
   
    }


    
}
