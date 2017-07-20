package day3;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
	int random = new Random().nextInt(5);
	if (random == 1) {
	JOptionPane.showMessageDialog(null, "Yes");	
	}
	if (random == 2) {
		JOptionPane.showMessageDialog(null, "No");
	}
	if (random == 3) {
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google");
	}
	if (random == 4) {
		JOptionPane.showMessageDialog(null, "Why are you asking me? \nWho told you I was a trustworthy source. \nIf you believe me, you should just give up on life.");
	}
		
	
	
	
	
	
	
	
	
}
}
