//Jackson Webster
//10/19/2025
//M6: Programming Assignment
//This program makes a Fan class that has settings like speed, on or off, size, and color, and it shows how the fan works by creating two examples and printing their details.

public class FanTest {
    public static void main(String[] args) {
        
        Fan defaultFan = new Fan();

        
        Fan customFan = new Fan(Fan.FAST, true, 10, "blue");

        
        System.out.println("Default Fan:");
        System.out.println(defaultFan.toString());

        System.out.println("\nCustom Fan:");
        System.out.println(customFan.toString());

        
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setOn(true);
        defaultFan.setRadius(8);
        defaultFan.setColor("red");

        System.out.println("\nAfter modifying Default Fan:");
        System.out.println(defaultFan.toString());
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
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
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

    
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON\nSpeed: " + speed + "\nColor: " + color + "\nRadius: " + radius;
        } else {
            return "Fan is OFF\nColor: " + color + "\nRadius: " + radius;
        }
    }
}