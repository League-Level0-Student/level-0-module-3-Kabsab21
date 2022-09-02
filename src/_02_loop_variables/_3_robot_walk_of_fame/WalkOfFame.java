
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		rob.setSpeed(10);
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setX(10);
		rob.turn(90);
		
		rob.penDown();
	
		// 2. Make the robot draw a star shape. Hint: angle=144.
for(int i = 0; i < 20; i++) {
		star();
		reset(); }

		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}
public static void star() {
//rob.hide();
rob.penDown();
	
	rob.move(30);
	rob.turn(144);
	rob.move(30);
	rob.turn(144);
	rob.move(30);
	rob.turn(144);
	rob.move(30);
	rob.turn(144);
	rob.move(30);
	rob.turn(144);
	
}

public static void reset() {
	rob.penUp();
	
	rob.move(50);
}
}

