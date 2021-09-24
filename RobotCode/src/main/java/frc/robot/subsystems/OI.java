package frc.robot.subsystems;

import frc.robot.Constants;

import static frc.robot.Constants.LEFT_JOYSTICK_PORT;
import static frc.robot.Constants.RIGHT_JOYSTICK_PORT;

public class OI {
    Joystick leftJoystick  = new Joystick(LEFT_JOYSTICK_PORT);
    Joystick rightJoystick  = new Joystick(RIGHT_JOYSTICK_PORT);
}
