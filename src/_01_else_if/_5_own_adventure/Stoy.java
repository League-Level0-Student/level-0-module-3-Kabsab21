package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Stoy {
public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null, "you are about to die in 30 seconds");
String answer =	JOptionPane.showInputDialog(null, "what will you do? a. something stupid b. curse your rivals c. take your rivals with you d. ask the docter for a refund");
if(answer.equals("a")){
	JOptionPane.showMessageDialog(null, "your death was stupid");
}
if(answer.equals("b")){
	JOptionPane.showMessageDialog(null, "they heard you, thats why your dead");
}
else if(answer.equals("c")){
	JOptionPane.showMessageDialog(null, "it was a tough fight, your both in hell now!");
}
else {
	JOptionPane.showMessageDialog(null, "the doctor didnt give you a refund, but your grave was decorated in medical supplies");

}
	
}
}
