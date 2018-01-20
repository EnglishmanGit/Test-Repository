package frc.team4976.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4976.robot.OI;
import frc.team4976.robot.subsystems.Subtest;

public class CommandBase extends Command
{
    public static Subtest shooter;

    public static void init()
    {
        shooter = Subtest.getInstance();
        OI.init();  //we will cover the OI class shortly.
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}