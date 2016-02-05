package org.usfirst.frc.team6121.robot;

import org.usfirst.frc.team6121.robot.commands.StopMotorCommand;
import org.usfirst.frc.team6121.robot.subsystems.ArmSubsystem;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick driveStick;
	
	public Button spareMotor; 
	
	public Button armUp;
	public Button armDown;
	
	public OI() {
		driveStick = new Joystick(RobotMap.DRIVE_JOYSTICK);
		spareMotor = new JoystickButton(driveStick, RobotMap.STOP_MOTOR_BUTTON);
		JoystickButton armUp = new JoystickButton(driveStick, RobotMap.ARM_UP_BUTTON);
		JoystickButton armDown = new JoystickButton(driveStick, RobotMap.ARM_DOWN_BUTTON);
		
		spareMotor.whileHeld(new StopMotorCommand());
		
		armUp.whileHeld(new armMoveUp());
		armDown.whileHeld(new armMoveDown());
		
		
	}
	
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

