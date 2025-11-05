//Jackson Webster
//Module 9 Asisignment Part 1
//11/4/2025
//This program stores 10 strings in an ArrayList, lets the user pick one by index, and safely handles invalid inputs using try/catch.

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        
        words.add("four");
        words.add("one");
        words.add("eight");
        words.add("six");
        words.add("nine");
        words.add("three");
        words.add("five");
        words.add("two");
        words.add("seven");
        words.add("zero");

        // Use for-each loop to print all elements
        System.out.println("Here are a list of numbers:");
        for (String word : words) {
            System.out.println(word);
        }

        // Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the index number (0-9) what number do you want to choose: ");
        String userInput = input.nextLine();

        // Auto-unboxing: convert String to Integer
        try {
            int index = Integer.parseInt(userInput);
            System.out.println("You chose: " + words.get(index));
        } catch (Exception e) {
            System.out.println("Exception thrown: Out of Bounds");
        }

        input.close();
    }
}