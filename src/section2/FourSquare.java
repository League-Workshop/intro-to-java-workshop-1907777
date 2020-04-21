package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot Sarah = new Robot("mini");
	void go() {
		// 4. Make the robot move as fast as possible
		Sarah.setSpeed(100);
		// 5. Set the pen width to 5
		Sarah.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		Sarah.penDown();
		for (int i = 0; i < 4; i++) {
			
			// 7. Set the pen color to random
			Sarah.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			Sarah.turn(90);
		}
	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for (int i = 0; i < 4; i++) {

		Sarah.move(50);
		Sarah.turn(90);
		
		}	
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



