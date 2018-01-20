package frc.team4976.robot.subsystems;

import edu.wpi.first.wpilibj.command.PIDSubsystem;

public class Shooter extends PIDSubsystem {

    public Shooter(String name, double p, double i, double d) {
        super(name, p, i, d);
    }

    @Override
    protected double returnPIDInput() {
        return 0;
    }

    @Override
    protected void usePIDOutput(double output) {

    }

    @Override
    protected void initDefaultCommand() {

    }
}
