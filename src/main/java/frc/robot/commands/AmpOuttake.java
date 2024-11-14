package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Amp;

public class AmpOuttake extends Command {
  private final Amp amp;

  public AmpOuttake(Amp amp) {
    this.amp = amp;

    addRequirements(amp);
  }

  @Override
  public void execute() {
    amp.outtake();
  }

  @Override
  public void end(boolean interrupted) {
    amp.stopIntake();
  }

}