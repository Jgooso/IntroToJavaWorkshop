package day3;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
	int random = new Random().nextInt(5);
	if (random == 1) {
	JOptionPane.showMessageDialog(null, "Loser");	
	}
	if (random == 2) {
		JOptionPane.showMessageDialog(null, "Try asking someone who can give an actual anwser");
	}
	if (random == 3) {
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google, like a normal person");
	}
	if (random == 4) {
		JOptionPane.showMessageDialog(null, "Why are you asking me? \nWho told you I was a trustworthy source. \nIf you believe me, you should just give up on life.");
	}
		if (random == 0){
			JOptionPane.showMessageDialog(null, "Whatever your question is, you will never accomplish anything");
		}
	
	
	
	
	
	
	
	
}
}
