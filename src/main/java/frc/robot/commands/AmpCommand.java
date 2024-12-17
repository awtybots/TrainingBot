package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Amp;

public class AmpCommand extends Command {
  private final Amp amp;

  public AmpCommand(Amp amp) {
    this.amp = amp;

    addRequirements(amp);
  }

  @Override
  public void execute() {
    amp.intake();
  }

  @Override
  public void end(boolean interrupted) {
    amp.stopIntake();
  }

}