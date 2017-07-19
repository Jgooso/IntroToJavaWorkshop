package day3;

import javax.swing.JOptionPane;

public class QuizGame {
public static void main(String[] args) {
String ans1 =JOptionPane.showInputDialog("Did you read Lord of the Rings?");
String ans2 =JOptionPane.showInputDialog("Do you spend more time studying than being with friends");
String ans3 =JOptionPane.showInputDialog("Can you name which president took got shot then delivered \na 90-minute speech before recieving medical attention");
String ans4 =JOptionPane.showInputDialog("Can you spell the world's longest word");
String ans5 =JOptionPane.showInputDialog("Did you read Game of Thrones");
	speak ("If you answered yes to any of the questions, you are a nerd");
	

}
static void speak(String words){
	try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	} catch (Exception e) {
		e.printStackTrace();
	}
}




}
