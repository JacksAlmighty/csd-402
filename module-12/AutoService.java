// Jackson Webster
// 11/23/2025
// Module 12 Assignment
// This program calculates the total cost of a yearly auto service by using overloaded methods to include optional fees for oil changes, tire rotations, and discounts.

public class AutoService {

    // returns standard service charge
    public static double yearlyService() {
        double standardCharge = 100.0; 
        return standardCharge;
    }

    // adds oil change fee
    public static double yearlyService(double oilChangeFee) {
        double standardCharge = 100.0;
        return standardCharge + oilChangeFee;
    }

    // adds oil change fee and tire rotation charge
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        double standardCharge = 100.0;
        return standardCharge + oilChangeFee + tireRotationFee;
    }

    // adds oil change fee, tire rotation fee, and applies coupon
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double coupon) {
        double standardCharge = 100.0;
        return standardCharge + oilChangeFee + tireRotationFee - coupon;
    }

    public static void main(String[] args) {
        

        // Test 1
        System.out.println("Standard service cost: $" + yearlyService());
        System.out.println("Standard service cost: $" + yearlyService());

        // Test 2
        System.out.println("Service with oil change: $" + yearlyService(30.0));
        System.out.println("Service with oil change: $" + yearlyService(25.0));

        // Test 3
        System.out.println("Service with oil change and tire rotation: $" + yearlyService(30.0, 20.0));
        System.out.println("Service with oil change and tire rotation: $" + yearlyService(25.0, 15.0));

        // Test 4
        System.out.println("Service with oil change, tire rotation, and coupon: $" + yearlyService(30.0, 20.0, 10.0));
        System.out.println("Service with oil change, tire rotation, and coupon: $" + yearlyService(25.0, 15.0, 5.0));
    }
}
