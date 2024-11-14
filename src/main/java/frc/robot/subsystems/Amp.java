package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.AmpConstants;

public class Amp extends SubsystemBase{
  private final CANSparkMax ampMotor;

  public Amp(int AmpMotorID) {
    ampMotor = new CANSparkMax(AmpConstants.AmpMotor, CANSparkMax.MotorType.kBrushless);

  }

  // Spins intake motor to intake notes
  public void intake() {
    ampMotor.set(.75);
  }

  public void outtake() {
    ampMotor.set(-0.75);
  }

  public void stopIntake() {
    ampMotor.set(0);
  }

  @Override
  public void periodic() {

  }

  public void stop() {
    ampMotor.stopMotor();
  }

}