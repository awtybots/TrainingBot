package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSubsystem;

public class zeroGyro extends Command {
  private final DriveSubsystem gyro;

  public zeroGyro(DriveSubsystem gyro) {
    this.gyro = gyro;

    addRequirements(gyro);
  }

  @Override
  public void execute() {
    gyro.zeroHeading();
  }

  @Override
  public void end(boolean interrupted) {
    gyro.getHeading();
  }

}