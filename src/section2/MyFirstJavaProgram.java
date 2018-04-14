package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot trumpbot = new Robot();
trumpbot.penDown();
trumpbot.setSpeed(32);
for(int i=0;i<3;i++) {
trumpbot.move(100);	
trumpbot.turn (120);
	
	}
}
}
