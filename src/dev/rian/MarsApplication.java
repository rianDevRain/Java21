package dev.rian;

public class MarsApplication {
    public static void main(String[] args){
        MarsRobot spirit = new MarsRobot();
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttributes();
        System.out.println("Increasing speed to 3.");

        spirit.speed = 3;
        spirit.checkTemperature();
        System.out.println("Changing temperature to -90.");
        spirit.checkTemperature();
        // spirit.showAttributes();
    }
}
