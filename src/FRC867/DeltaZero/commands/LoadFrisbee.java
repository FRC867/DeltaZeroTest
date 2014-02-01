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
public class LoadFrisbee extends CommandBase {
    
    public LoadFrisbee() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(frisbeeLoader);
        this.setTimeout(.55);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        frisbeeLoader.push();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        frisbeeLoader.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        frisbeeLoader.stop();
    }
}
