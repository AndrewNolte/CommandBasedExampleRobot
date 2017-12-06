package org.usfirst.frc.team3735.robot;

import org.usfirst.frc.team3735.robot.commands.GearIntakeDown;
import org.usfirst.frc.team3735.robot.util.oi.XboxController;

import edu.wpi.first.wpilibj.buttons.Button;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//Be sure to use the XboxController class from our team's util folder!!!
	//If you haven't already, download the robot2017 project from our github, and do "copy qualified name" on
	//the util package into your robot package. Instructions for downloading the project can be found
	//on the downloading software document.
	public XboxController con1;
	
	//An instance of OI gets contructed in Robotinit() in Robot.java
	//This stands for operator interface, and handles attaching commands to buttons
	public OI() {
		//this makes a new xboxcontroller at port 0
		con1 = new XboxController(0);
		
		//this attaches a new instance of the gearintakedown command to the 'a' button
		//while held means it will activate the command when it is pressed, and cancel it when its released
		con1.a.whileHeld(new GearIntakeDown());
	
	}
	
	
}
