package frc.team4976.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {

    public static Joystick joystick;

    public static void init(){
        joystick = new Joystick(0);
    }
}
