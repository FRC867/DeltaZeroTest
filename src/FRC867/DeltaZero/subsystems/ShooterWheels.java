/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRC867.DeltaZero.subsystems;

import FRC867.DeltaZero.RobotMap;
import FRC867.DeltaZero.commands.SpinUpShooter;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Team-867
 */
public class ShooterWheels extends Subsystem {
    
    public static final double Wheel1Speed = -1;
    public static final double Wheel2Speed = -.7;
    
    private static boolean spinning = false;
        
    Victor Wheel1 = new Victor(RobotMap.ShooterWheel1);
    Victor Wheel2 = new Victor(RobotMap.ShooterWheel2);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        

        //setDefaultCommand(new SpinUpShooter());
    }
    
    public void spinUp(){
        Wheel1.set(Wheel1Speed);
        Wheel2.set(Wheel2Speed);
        spinning = true;
    }
    
    public void spinDown(){
        Wheel1.set(0);
        Wheel2.set(0);
        spinning = false;
    }
        
    public boolean isSpinning(){
        return spinning;
    }
}
