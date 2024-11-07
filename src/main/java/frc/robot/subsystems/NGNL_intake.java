package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class NGNL_intake extends SubsystemBase {

    private final CANSparkMax intakeMotor = 
        new CANSparkMax(IntakeConstants.IntakeMotor, MotorType.kBrushless);
    
    public void runPercentSpeed(double percentSpeed){
        percentSpeed = -percentSpeed;
    }    
    public NGNL_intake(){
        intakeMotor.restoreFactoryDefaults();
        intakeMotor.setCANTimeout(250);
        intakeMotor.setInverted(false);
        intakeMotor.setSmartCurrentLimit(40);
        intakeMotor.burnFlash();
    }

    
}
