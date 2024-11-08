package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.NGNL_intake;

public class intakecommands extends Command {
  private final NGNL_intake intake;

  public intakecommands(NGNL_intake intake) {
    this.intake = intake;

    addRequirements(intake);
  }

  @Override
  public void execute() {
    intake.intake();
  }

  @Override
  public void end(boolean interrupted) {
    intake.stopIntake();
  }

}