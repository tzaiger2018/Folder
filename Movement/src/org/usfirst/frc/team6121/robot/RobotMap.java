package org.usfirst.frc.team6121.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	// Joystick declarations
	public static int DRIVE_JOYSTICK = 1;
	
	// Joystic button declarations 
	public static int STOP_MOTOR_BUTTON = 2;
	
	//digital IO declarations 
	public static int SPARE_LIMIT_SWITCH = 16;
	
	// PWM/Motor channel declarations
	public static int LEFT_FRONT_DRIVE = 0;
	public static int LEFT_REAR_DRIVE = 1;
	public static int RIGHT_FRONT_DRIVE = 2;
	public static int RIGHT_REAR_DRIVE = 3;
	//0 and 1 are left side
	//2 and 3 are right side
	
	public static int SPARE_MOTOR = 5;

	
	
}
