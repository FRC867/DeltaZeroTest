package FRC867.DeltaZero;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static final int leftMotor = 1;
    public static final int rightMotor = 2;
    
    public static final int ShooterAngle = 3;
    
    public static final int ShooterWheel1 = 5;
    public static final int ShooterWheel2 = 6;
    
    public static final int ShooterLoader = 10;
    
    public static final int PressureSwitch = 3; //3,4
    
    public static final int CompressorSpikeRelay = 7;
    
    public static final int SolenoidForward = 3;
    public static final int SolenoidReverse = 4;
}
