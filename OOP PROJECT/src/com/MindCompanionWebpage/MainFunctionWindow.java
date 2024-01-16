package com.MindCompanionWebpage;

import javax.swing.SwingUtilities;

public class MainFunctionWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        SwingUtilities.invokeLater(() -> {
	            try {
	                SigninSignupWindow loginsignup = new SigninSignupWindow();
	                loginsignup.setVisible(true);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        });
	}


}
