package org.usfirst.frc.team3735.robot.subsystems;

import org.usfirst.frc.team3735.robot.RobotMap;
import org.usfirst.frc.team3735.robot.commands.TeleopDrive;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {

	
	public static CANTalon l1;
	public static CANTalon l2;
	public static CANTalon l3;
	
	public static CANTalon r1;
	public static CANTalon r2;
	public static CANTalon r3;
	
	public Drive() {
		l1 = new CANTalon(RobotMap.DriveMap.leftMotor1);
		l2 = new CANTalon(RobotMap.DriveMap.leftMotor2);
		l3 = new CANTalon(RobotMap.DriveMap.leftMotor3);

		r1 = new CANTalon(RobotMap.DriveMap.rightMotor1);
		r2 = new CANTalon(RobotMap.DriveMap.rightMotor2);
		r3 = new CANTalon(RobotMap.DriveMap.rightMotor3);
	}

    public void initDefaultCommand() {
        // This command will run when no other command that requires the subsystem wants to run
        setDefaultCommand(new TeleopDrive());
    	
    }
    
    //These are methods copied from the previous project for controlling the motors
    
	public void move(double magnitude, double turn) {
		tank(magnitude + turn, magnitude - turn);
	}
	
	public void tank(double left, double right) {
		l1.set(left);
		l2.set(left);
		l3.set(left);
		
		r1.set(-right);
		r2.set(-right);
		r3.set(-right);

	}
}

