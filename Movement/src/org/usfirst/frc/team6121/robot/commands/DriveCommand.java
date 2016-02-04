
package org.usfirst.frc.team6121.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6121.robot.Robot;
import org.usfirst.frc.team6121.robot.subsystems.ChassisSubsystem;

/**
 *
 */
public class DriveCommand extends Command {

    public DriveCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.chassisSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
   	 Robot.chassisSubsystem.drive(Robot.oi.driveStick.getY(), Robot.oi.driveStick.getZ());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }
    

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassisSubsystem.StopDriving();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.chassisSubsystem.StopDriving();
    }
}
