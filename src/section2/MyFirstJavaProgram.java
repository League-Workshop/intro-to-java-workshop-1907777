package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot Sarah = new Robot("mini");
		Sarah.penDown();
		Sarah.setSpeed(15);
		
		Sarah.move(50);
		Sarah.turn(90);
		Sarah.move(50);
		Sarah.turn(90);
		Sarah.move(50);
		Sarah.turn(90);
		Sarah.move(50);
		
		Sarah.penUp();
		Sarah.move(50);
		
		Sarah.penDown();
		
	
		
		
	}
}
