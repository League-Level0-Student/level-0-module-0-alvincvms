import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args)throws Exception{
	Robot derp = new Robot();
	derp.moveTo(15, 300);
	derp.setSpeed(80);
	derp.penDown();
	derp.setAngle(30);
	derp.move(100);
	derp.setAngle(150);
	derp.move(100);
	derp.penUp();
	derp.move(-60);
	derp.setAngle(270);
	derp.penDown();
	derp.move(40);
	derp.penUp();//
	derp.setAngle(90);
	derp.move(120);
	derp.setAngle(0);
	derp.move(30);
	derp.setAngle(180);
	derp.penDown();
	derp.move(80);
	derp.penUp();
	derp.setAngle(90);
	derp.move(40);
	derp.setAngle(0);
	derp.move(40);
	derp.penDown();
	derp.setAngle(150);
	derp.move(50);
	derp.setAngle(30);
	derp.move(50);
	derp.penUp();
	derp.setAngle(90);
	derp.move(40);
	derp.setAngle(0);
	derp.move(15);
	derp.penDown();derp.move(1);derp.penUp();
	derp.setAngle(180);
	derp.move(16);
	derp.penDown();
	derp.move(40);
	derp.penUp();
	derp.setAngle(90);
	derp.move(40);
	derp.penDown();
	derp.setAngle(0);
	derp.move(20);
	for(int i=0;i<60;i++) {
		derp.turn(3);
		derp.move(1);
	}
	derp.move(20);
	derp.penUp();
	derp.moveTo(900, 900);
	JOptionPane.showMessageDialog(null, "#dab");
}
}
