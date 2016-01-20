package org.usfirst.frc.team6121.robot.commands;

import org.usfirst.frc.team6121.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StopMotorCommand extends Command {

    public StopMotorCommand() {
        // Use requires() here to declare subsystem dependencies
    	// eg. requires(chassis);
    	requires(Robot.chassisSubsystem); 
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.chassisSubsystem.isLimitSwitchPressed()) {
    		Robot.chassisSubsystem.jogSpareMotor (0.0);
    	} else {
    		Robot.chassisSubsystem.jogSpareMotor (0.5);
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassisSubsystem.jogSpareMotor(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.chassisSubsystem.jogSpareMotor(0.0);
    }
}
