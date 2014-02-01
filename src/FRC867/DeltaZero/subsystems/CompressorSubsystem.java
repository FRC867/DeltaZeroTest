/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRC867.DeltaZero.subsystems;

import FRC867.DeltaZero.RobotMap;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Team-867
 */
public class CompressorSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    //public static Compressor compressor = new Compressor(RobotMap.PressureSwitch, RobotMap.CompressorSpikeRelay);
    //public static Victor compressor1 = new Victor(7);
    public static Relay expRelay = new Relay(RobotMap.CompressorSpikeRelay);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void Start(){
        //compressor.start();
        expRelay.set(Relay.Value.kForward);
        //compressor1.set(1);
    }
}
