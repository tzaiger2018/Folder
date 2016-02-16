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
		
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveCommand());
        }
    
    public void drive(double move, double rotate) {
        chassis.arcadeDrive(move, rotate);
    }
   
    public void robotDrive(double move, double rotate) {
    	
    	public chassisFrontLeft = RobotMap.LEFT_FRONT_DRIVE;
    	public chassisRearLeft = RobotMap.LEFT_REAR_DRIVE;
    	public chassisFrontRight = RobotMap.RIGHT_FRONT_DRIVE;
    	public chassisRearRight = RobotMap.RIGHT_REAR_DRIVE;

    	if (move == 0 && rotate == 0) {
    		chassisFrontLeft.set(0);
    		chassisRearLeft.set(0);
    		chassisFrontRight.set(0);
    		chassisRearRight.set(0);
    	}
    	
    	if (move < 0) {
    		chassisRearLeft.set(move);
    		chassisRearRight.set(move);
    	} else if (move > 0) {
    		chassisFrontLeft.set(move);
    		chassisFrontRight.set(move);
    	}
    	
    	if (rotate > 0) {
    		chassisFrontLeft.set(rotate);
    		chassisRearRight.set(-rotate);
    	} else if (rotate < 0) {
    		chassisFrontRight.set(rotate);
    		chassisRearLeft.set(-rotate);
    	}
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
    
    