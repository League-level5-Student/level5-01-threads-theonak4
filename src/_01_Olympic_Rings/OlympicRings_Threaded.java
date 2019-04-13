package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	public static void main(String[] args) {
		Robot uno = new Robot(400, 700);
		Robot dos = new Robot(800, 700);
		Robot tres = new Robot(1200, 700);
		Robot four = new Robot(800, 700);
		Robot five = new Robot(1200, 700);
		uno.setSpeed(10);
		dos.setSpeed(10);
		tres.setSpeed(10);
		
		uno.penDown();
		dos.penDown();
		tres.penDown();
		four.penDown();
		five.penDown();
		
		
		
		uno.moveTo(400, 700);
		dos.moveTo(800, 700);
		tres.moveTo(1200, 700);
		uno.moveTo(600, 900);
		dos.moveTo(1000, 900);
		tres.moveTo(1400, 900);
		
		
		
		Thread r1 = new Thread(()->doLoop(uno,3));
		Thread r2 = new Thread(()->doLoop(dos,3));
		Thread r3 = new Thread(()->doLoop(tres,3));
		Thread r4 = new Thread(()->doLoop(four,3));
		Thread r5 = new Thread(()->doLoop(five,3));	
		
		
		
		r1.start();
		r2.start();
		r4.start();
		r3.start();
		r5.start();
		
}
	public static void doLoop(Robot r,int v){
	for (int i = 0; i < 360; i++) {
		r.move(v);
		r.turn(1);
	}
	}
}
