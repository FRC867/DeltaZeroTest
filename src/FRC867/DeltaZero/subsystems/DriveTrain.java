/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRC867.DeltaZero.subsystems;

import FRC867.DeltaZero.RobotMap;
import FRC867.DeltaZero.commands.DriveWithGamepad;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Team-867
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    RobotDrive chassis = new RobotDrive(RobotMap.leftMotor, RobotMap.rightMotor);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new DriveWithGamepad());
    }
    
    public void drive(double movement, double turn){
        chassis.arcadeDrive(movement, turn, true);
    }
}
