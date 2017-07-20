package day3;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {
public static void main(String[] args){
int random = new Random().nextInt(100);
int n = 0;
for (int i = 0; i < 10; i++) {
	String ans = JOptionPane.showInputDialog("guess a number between 1-100");
	n=Integer.parseInt(ans);
	if (n < random) {
		JOptionPane.showMessageDialog(null, "too low");
		
	}
	if (n> random) {
		JOptionPane.showMessageDialog(null, "too high");
		
	}
	if (n == random) {
		JOptionPane.showMessageDialog(null, "you win");
		break;
	}
	
	
	
	
	
}
if (n != random) {
	JOptionPane.showMessageDialog(null,"Loser");
	
}


















}
}