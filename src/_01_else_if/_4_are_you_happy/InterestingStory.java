package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class InterestingStory {
	
	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog(null, "are you overworked? yes or no");
	
	if(a.equals("no")){
		 JOptionPane.showMessageDialog(null, "you went on to live a long and boring life");
	}	
	if(a.equals("yes")){
		 JOptionPane.showMessageDialog(null, "you had a midlife crisis and died cause you offended pirates and walked the plank.");
	}	
	}
}