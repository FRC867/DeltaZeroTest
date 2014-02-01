package FRC867.DeltaZero.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import FRC867.DeltaZero.OI;
import FRC867.DeltaZero.subsystems.CompressorSubsystem;
import FRC867.DeltaZero.subsystems.DriveTrain;
import FRC867.DeltaZero.subsystems.FrisbeeLoader;
import FRC867.DeltaZero.subsystems.LeftSolenoid;
import FRC867.DeltaZero.subsystems.ShooterPitch;
import FRC867.DeltaZero.subsystems.ShooterWheels;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    //public static ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
    
    public static ShooterWheels shooterWheels = new ShooterWheels();
    public static DriveTrain driveTrain = new DriveTrain(); 
    public static ShooterPitch shooterPitch = new ShooterPitch();
    public static FrisbeeLoader frisbeeLoader = new FrisbeeLoader();
    public static CompressorSubsystem compressor = new CompressorSubsystem();
    public static LeftSolenoid leftSolenoid = new LeftSolenoid();
    
    
    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        
        // Show what command your subsystem is running on the SmartDashboard
        //SmartDashboard.putData(exampleSubsystem);
        SmartDashboard.putData(shooterWheels);
        SmartDashboard.putData(driveTrain);
        SmartDashboard.putData(compressor);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
    
    public boolean isShooterWheelsUp(){
        return shooterWheels.isSpinning();
    }
}
