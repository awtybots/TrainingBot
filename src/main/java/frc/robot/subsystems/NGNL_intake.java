package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;

public class NGNL_intake extends SubsystemBase{
  private final CANSparkMax intakeMotor;

  public NGNL_intake(int intakeMotorID) {
    intakeMotor = new CANSparkMax(IntakeConstants.IntakeMotor, CANSparkMax.MotorType.kBrushless);

  }

  // Spins intake motor to intake notes
  public void intake() {
    intakeMotor.set(.75);
  }

  public void outtake() {
    intakeMotor.set(-0.75);
  }

  public void stopIntake() {
    intakeMotor.set(0);
  }

  @Override
  public void periodic() {

  }

  public void stop() {
    intakeMotor.stopMotor();
  }

}