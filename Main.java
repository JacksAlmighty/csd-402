// Jackson Webster
// 9/11/2025
// Assignment: M1
// This program takes user input for water amount, initial temp, and final temp,
// then calculates the energy needed to heat the water.

import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
        // Scanner is used to get input from the user
        Scanner input = new Scanner(System.in);

        // These 3 lines take the user input and plug it into the formula.
        System.out.println("How much water (kilograms)?:");
        double watermass = input.nextDouble();

        System.out.println("What is the initial temperature? (°C):");
        double initial = input.nextDouble();

        System.out.println("What is the final temperature? (°C):");
        double endtemp = input.nextDouble();

        // This calculates the user input numbers to figure out how many Joules it will take.
        double energy = watermass * (endtemp - initial) * 4184;

        // This prints out all of the information in a clean way.
        System.out.printf("The amount of energy it would take to heat %.2f kg of water is %, .0f Joules.%n", watermass, energy);
    }
}