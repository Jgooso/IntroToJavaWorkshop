package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot Jon = new Robot();
	

	void go() {
		// 4. Make the robot move as fast as possible
		Jon.setSpeed(10);
		// 5. Set the pen width to 5
		Jon.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
		for (int o = 0; o < 4; o++) {
			// 7. Set the pen color to random
			Jon.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			Jon.turn(45);
Jon.hide();
		
	}
	}
	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		
		Jon.penDown();
		for (int i = 0; i < 10; i++){
			
			int u=100;
			u=u-10;
		Jon.move(u);
		Jon.turn(90);
		}
	
	}
	public static void main(String[] args) {
		new FourSquare().go();
	}

}
