package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

import static frc.robot.Constants.LEFT_JOYSTICK_PORT;
import static frc.robot.Constants.RIGHT_JOYSTICK_PORT;

public class OI {

    public static Joystick leftJoystick  = new Joystick(LEFT_JOYSTICK_PORT);
    public static Joystick rightJoystick  = new Joystick(RIGHT_JOYSTICK_PORT);

}
