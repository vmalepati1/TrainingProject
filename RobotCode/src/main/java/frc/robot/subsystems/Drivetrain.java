package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.LEFT_WHEELS_CHANNEL;
import static frc.robot.Constants.RIGHT_WHEELS_CHANNEL;

public class Drivetrain extends SubsystemBase {

    private Talon leftWheels = new Talon(LEFT_WHEELS_CHANNEL);
    private  Talon RightWheels = new Talon(RIGHT_WHEELS_CHANNEL);

    public void setSpeeds (double leftSpeed, double rightSpeed) {
        leftWheels.set(leftSpeed);
        RightWheels.set(rightSpeed);
    }

}
