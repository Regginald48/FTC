package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;


@Autonomous(name="Testing", group="test")
//@Disabled
public class AutoTest extends LinearOpMode {

    private DcMotor motorTest;

    HardwareMap hwMap = null;

    public void init(HardwareMap ahwMap) {
        hwMap = ahwMap;
        motorTest = hwMap.dcMotor.get("motorTest");
    }
    @Override
    public void runOpMode() throws InterruptedException {

        init(hardwareMap);
        telemetry.addData("Status", "Running");
        telemetry.update();
        waitForStart();

        while(opModeIsActive()) {
            motorTest.setPower(.5);
            motorTest.setPower(0);
        }
    }
}