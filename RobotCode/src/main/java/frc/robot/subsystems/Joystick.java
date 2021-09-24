package frc.robot.subsystems;

import static frc.robot.Constants.LEFT_JOYSTICK_PORT;
import static frc.robot.Constants.RIGHT_JOYSTICK_PORT;

public class Joystick {

    public double getY() {
        return 0;
    }

    public class OI{
        public static Joystick leftJoystick = new Joystick(LEFT_JOYSTICK_PORT);
        public static Joystick rightJoystick = new Joystick(RIGHT_JOYSTICK_PORT);
    }

}
