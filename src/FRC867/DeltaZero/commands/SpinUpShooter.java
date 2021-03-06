/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRC867.DeltaZero.commands;

/**
 *
 * @author Team-867
 */
public class SpinUpShooter extends CommandBase {
    
    private boolean wasSpinning;
    
    public SpinUpShooter() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(shooterWheels);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        wasSpinning = shooterWheels.isSpinning();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        shooterWheels.spinUp();        
        this.setTimeout(3.2);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(wasSpinning){
            return true;
        }
        return this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
