package dev.rian;

public class MarsRobot {

    String status;
    int speed;
    float temperature;

    void checkTemperature() {
        if (temperature < -80) {
            status = "retruning home 'It's too cold for this ish";
            speed = 5;
        } else {
            status = "Above negative eighty is sweater weather";
            speed = 2;
        }
        showAttributes();
    }

    // void checkTemperatureWarm(){
    //     if(temperature>=-80){
    //         status = "Negative eighty is sweater weather";
    //         speed = 2;
    //     }
    // }

    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);

    }
}
