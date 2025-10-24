//Jackson Webster
//10/24/2025
//M7 Programming Assignment
//This program creates a collection of Fan objects and displays the details of each fan, including speed, color, radius, and whether it is on, without using the toString() method.

import java.util.ArrayList;
import java.util.List;

public class UseFans {

    
    public static void displayFans(List<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);  
            System.out.println(); 
        }
    }

    
    public static void displayFan(Fan fan) {
        if (fan.isOn()) {
            System.out.println("Fan is ON");
            System.out.println("Speed: " + fan.getSpeed());
            System.out.println("Color: " + fan.getColor());
            System.out.println("Radius: " + fan.getRadius());
        } else {
            System.out.println("Fan is OFF");
            System.out.println("Color: " + fan.getColor());
            System.out.println("Radius: " + fan.getRadius());
        }
    }

    
    public static void main(String[] args) {
        
        List<Fan> fanCollection = new ArrayList<>();

        Fan fan1 = new Fan(); 
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        Fan fan3 = new Fan(Fan.MEDIUM, true, 8, "red");

        fanCollection.add(fan1);
        fanCollection.add(fan2);
        fanCollection.add(fan3);

        
        System.out.println("Displaying all fans in the collection:");
        displayFans(fanCollection);
    }
}


class Fan {

    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
}