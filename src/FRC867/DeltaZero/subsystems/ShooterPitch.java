/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRC867.DeltaZero.subsystems;

import FRC867.DeltaZero.RobotMap;
import FRC867.DeltaZero.commands.PitchWithGamepad;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Team-867
 */
public class ShooterPitch extends Subsystem {
    
    Victor pitchControl = new Victor(RobotMap.ShooterAngle);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new PitchWithGamepad());
    }
    
    public void pitchUp(){
        pitchControl.set(1);
    }
    
    public void pitch(double pitchSpeed){
        pitchControl.set(pitchSpeed);
    }
    
    public void pitchStop(){
        pitchControl.set(0);
    }
    
    public void pitchDown(){
        pitchControl.set(-1);
    }
}
