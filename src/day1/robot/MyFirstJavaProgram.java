package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		
Robot david = new Robot();
david.penDown();
david.setSpeed(10);
for(int i=0; i<4; i++){
david.move(100);
david.turn(-90);}
david.turn(180);
for(int i=0; i<4; i++){
david.move(100);
david.turn(-90);
	}
}
