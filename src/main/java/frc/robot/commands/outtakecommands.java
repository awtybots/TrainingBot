package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.NGNL_intake;

public class outtakecommands extends Command {
  private final NGNL_intake outtake;

  public outtakecommands(NGNL_intake outtake) {
    this.outtake = outtake;

    addRequirements(outtake);
  }

  @Override
  public void execute() {
    outtake.outtake();
  }

  @Override
  public void end(boolean interrupted) {
    outtake.stopIntake();
  }

}