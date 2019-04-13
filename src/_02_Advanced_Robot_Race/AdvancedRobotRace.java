package _02_Advanced_Robot_Race;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	public static void main(String[] args) {
		Robot uno = new Robot(400, 700);
		Robot dos = new Robot(800, 700);
		Robot tres = new Robot(1200, 700);
		Robot four = new Robot(800, 700);
		Robot line = new Robot(1200, 700);
		uno.penDown();
		dos.penDown();
		tres.penDown();
		four.penDown();
		line.penDown();
		
		
		
		uno.moveTo(400, 700);
		dos.moveTo(800, 700);
		tres.moveTo(1200, 700);
		uno.moveTo(600, 900);
		dos.moveTo(1000, 900);
		tres.moveTo(1400, 900);
		
		
		
		Thread r1 = new Thread(()->move(uno,3));
		Thread r2 = new Thread(()->move(dos,3));
		Thread r3 = new Thread(()->move(tres,3));
		Thread r4 = new Thread(()->move(four,3));
		Thread r5 = new Thread(()->move(line,3));	
		
		
		
		r1.start();
		r2.start();
		r4.start();
		r3.start();
		r5.start();
		
}
	public static void move(Robot r,int v){
	
	}
}