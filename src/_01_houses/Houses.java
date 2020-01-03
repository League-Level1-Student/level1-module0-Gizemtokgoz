package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
	int x = 700;
	int y = 500;
		
	Robot rob = new Robot();
	rob.setX(x);
	rob.setY(y);
	rob.setSpeed(50);
	rob.setPenWidth(5);
	rob.penDown();
	
	drawHouse(rob, "large", "purple");
	drawHouse(rob, "small", "grey");
	drawHouse(rob, "medium", "salmon");
	drawHouse(rob, "medium", "blue");
	drawHouse(rob, "large", "white");
	drawHouse(rob, "small", "purple");
	drawHouse(rob, "medium", "salmon");
	drawHouse(rob, "large", "grey");
	drawHouse(rob, "small", "blue");
	drawHouse(rob, "small", "white");
	}
	
	public void drawHouse(Robot bob, int height) {
		bob.move(height);
		bob.turn(-90);
		bob.move(25);
		bob.turn(-90);
		bob.move(height);
		bob.setPenColor(0,200,0);
		bob.turn(90);
		bob.move(15);
		bob.turn(90);
	}
	
	public void drawHouse(Robot bob, String height, String color) {
		
		if (color.equals("purple")) {
			bob.setPenColor(204, 153, 255);
		}
		
		else if (color.equals("blue")) {
			bob.setPenColor(153, 204, 255);
		}
		
		else if (color.equals("white")) {
			bob.setPenColor(255, 294, 229);		
		}
		
		else if (color.equals("salmon")) {
			bob.setPenColor(255, 153, 153);
		}
		
		else if (color.equals("grey")) {
			bob.setPenColor(192, 192, 192);
		}
		
		if (height.equals("small")) {
			drawHouse(bob, 60);
		}
		
		else if (height.equals("medium")) {
			drawHouse(bob, 120);
		}
		
		else if (height.equals("large")) {
			drawHouse(bob, 250);
		}
		
	}
}
