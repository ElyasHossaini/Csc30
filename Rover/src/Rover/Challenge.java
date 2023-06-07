package Rover;


//Add Phidgets Library
import com.phidget22.*;

public class Challenge {
    public static void main(String[] args) throws Exception {

        //Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        //Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();
        DistanceSensor sonar = new DistanceSensor();

        //Address
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        //Open
        leftMotors.open(5000);
        rightMotors.open(5000);
        sonar.open(5000);
        
        
        

        while (true) {

            System.out.println("Distance: " + sonar.getDistance() + " mm");
            
            if (sonar.getDistance() < 400) {
                //Object detected! Stop motors
                leftMotors.setTargetVelocity(-1);
                rightMotors.setTargetVelocity(1);
                
                //Wait for 2 second
                Thread.sleep(750);
                
            } else {
                //Move forward slowly (25% max speed)
            	leftMotors.setAcceleration(leftMotors.getMaxAcceleration());
                rightMotors.setAcceleration(rightMotors.getMaxAcceleration());
            	
                leftMotors.setTargetVelocity(1);
                rightMotors.setTargetVelocity(1);
                
                //Wait for 2 second
                Thread.sleep(1100);
                
                leftMotors.setTargetVelocity(0);
                rightMotors.setTargetVelocity(0);
                
                //Wait for 2 second
                Thread.sleep(1000);
                
                
                
                leftMotors.setTargetVelocity(1);
                rightMotors.setTargetVelocity(0);

                //Wait for 2 second
                Thread.sleep(520);
                
                leftMotors.setTargetVelocity(0);
                rightMotors.setTargetVelocity(0);
                
                //Wait for 2 second
                Thread.sleep(1000);

            }

           
            
            
        }
    }
}
  