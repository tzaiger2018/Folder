package org.usfirst.frc.team6121.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor; 
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team6121.robot.RobotMap;
import org.usfirst.frc.team6121.robot.commands.ArmCommand;

/**
 *
 */
public class ArmSubsystem extends Subsystem {
	
	
	public ArmSubsystem() {
		
	
	}
	
	public void armMoveUp() {
		RobotMap.ARM_UP_MOTOR.set(1);
	}
	
	public void armMoveDown() {
		RobotMap.ARM_DOWN_MOTOR.set(1);
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

