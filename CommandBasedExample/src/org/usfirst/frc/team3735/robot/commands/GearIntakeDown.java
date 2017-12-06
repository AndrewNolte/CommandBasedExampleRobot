package org.usfirst.frc.team3735.robot.commands;

import org.usfirst.frc.team3735.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearIntakeDown extends Command {

    public GearIntakeDown() {
    	/*
    	 * This statement says that the command needs full control of the specified subsystem.
    	 * This means that if another command that is running has requires(Robot.gearIntake); in its contructor,
    	 * when this gets triggered to start, it will halt that command, calling that commands interuppted method, 
    	 * before starting itself. It is perfectly legal to have as many requires(subsystem); statements as you want.
    	 */

        requires(Robot.gearIntake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.gearIntake.setIsDown(true);
    }

    // Called at a rate of 50 hz when this command is running
    protected void execute() {
    	Robot.gearIntake.setGearRollerSpeed(-.7);
    }
    
    //when this returns true, the command will stop, and the end method will be called
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.gearIntake.setIsDown(false);
    	Robot.gearIntake.setGearRollerSpeed(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
