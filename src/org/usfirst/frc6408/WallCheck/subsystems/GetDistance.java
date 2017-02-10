// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6408.WallCheck.subsystems;

import org.usfirst.frc6408.WallCheck.Robot;
import org.usfirst.frc6408.WallCheck.RobotMap;
import org.usfirst.frc6408.WallCheck.commands.*;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class GetDistance extends Subsystem {
	
	public AnalogInput analogInput = new AnalogInput(3);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public double ObtainDistance() {
    	return analogInput.getAverageVoltage() * 100 * 0.977;
    }
    public void IsNearWall() {
    	if(ObtainDistance() <= 18)
    	{
    		Robot.move.driveSpeed = 0;
    	}
    	else
    	{
    		Robot.move.driveSpeed = -0.5;
    	}
    }
}

