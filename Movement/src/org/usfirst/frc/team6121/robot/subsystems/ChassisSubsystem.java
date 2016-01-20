package org.usfirst.frc.team6121.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor; 
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team6121.robot.RobotMap;
import org.usfirst.frc.team6121.robot.commands.DriveCommand;



/**
 *
 */
public class ChassisSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	RobotDrive chassis;
	Victor spareMotor;
	DigitalInput limitSwitch;
	
	public ChassisSubsystem() {
		chassis = new RobotDrive(RobotMap.LEFT_FRONT_DRIVE, RobotMap.LEFT_REAR_DRIVE, RobotMap.RIGHT_FRONT_DRIVE, RobotMap.RIGHT_REAR_DRIVE);
		spareMotor = new Victor (RobotMap.SPARE_MOTOR);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveCommand());	
        }
    
    public void drive(Joystick stick){
    	chassis.arcadeDrive(stick);
    }
    
    public void StopDriving() {
    	chassis.stopMotor();
    }

    public void jogSpareMotor(double power) {
    	spareMotor.set(power);
    }
    public boolean isLimitSwitchPressed() {
    	return limitSwitch.get();
    
    }
}
    
    