package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import static frc.robot.OI.leftJoystick;
import static frc.robot.OI.rightJoystick;

public class DriveCommand extends CommandBase {

    public void execute() {
        double leftJoyStickValue = -leftJoystick.getY();
        double rightJoystickValue = -rightJoystick.getY();
    }


}
