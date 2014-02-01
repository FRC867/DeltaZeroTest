/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRC867.DeltaZero.subsystems;

import FRC867.DeltaZero.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Team-867
 */
public class LeftSolenoid extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public static DoubleSolenoid leftCylinderSolenoid = new DoubleSolenoid(RobotMap.SolenoidForward,RobotMap.SolenoidReverse);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void Extend(){
        leftCylinderSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    public void Retract(){
        leftCylinderSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
    
}
