package frc.team4976.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Subtest extends Subsystem
{
    public static Subtest instance;

    public static Subtest getInstance() {
        if (instance == null)
            instance = new Subtest() ;
        return instance;
    }

    private Subtest()  //private so no duplicate Subsystem is created
    {
        //initializes variables such as SpeedControllers, Pneumatics, etc.
    }

    @Override
    protected void initDefaultCommand() {

    }
}