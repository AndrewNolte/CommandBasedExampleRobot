package org.usfirst.frc.team3735.robot.subsystems;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GearIntake extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public CANTalon gearRoller;
	public Solenoid sol;


	public GearIntake() {
		
		 sol = new Solenoid(0);
		 gearRoller = new CANTalon(8);
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());

    }
    
    
    public void setIsDown(boolean isDown) {
    	sol.set(isDown);
    }
    
    public void setGearRollerSpeed(double spd) {
    	gearRoller.set(spd);
    }
    
    
}

