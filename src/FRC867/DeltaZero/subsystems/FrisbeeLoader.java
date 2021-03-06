/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRC867.DeltaZero.subsystems;

import FRC867.DeltaZero.RobotMap;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Team-867
 */
public class FrisbeeLoader extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    Victor loader = new Victor(RobotMap.ShooterLoader);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void push(){
        loader.set(1);
    }
    
    public void stop(){
        loader.set(0);
    }
    
    public void reset(){
        loader.set(-1);
    }
}
