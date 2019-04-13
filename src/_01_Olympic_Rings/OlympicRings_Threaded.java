package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot r1 = new Robot(50, 450);
		Robot r2 = new Robot(250, 550);
		Robot r3 = new Robot(450, 450);
		Robot r4 = new Robot(650, 550);
		Robot r5 = new Robot(850, 450);
		Thread t1 = new Thread(() -> circle(r1));
		Thread t2 = new Thread(() -> circle(r2));
		Thread t3 = new Thread(() -> circle(r3));
		Thread t4 = new Thread(() -> circle(r4));
		Thread t5 = new Thread(() -> circle(r5));

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

	public static void circle(Robot r) {
		r.setRandomPenColor();
		r.setPenWidth(10);
		r.penDown();
		for (int i = 0; i < 360; i++) {
			r.move(3);
			r.turn(1);
		}
		r.penUp();
	}
}
