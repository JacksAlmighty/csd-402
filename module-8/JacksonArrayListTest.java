// Jackson Webster
// Module 8 Assignment - Find the largest number in an ArrayList
// 11/1/2025
// This program takes integers from the user, stores them in an ArrayList, and uses a method named max() to find and display the largest number entered. If the list is empty, it returns 0.

import java.util.ArrayList;
import java.util.Scanner;

public class JacksonArrayListTest {

    
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        int largest = list.get(0);
        for (int num : list) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop):");
        while (true) {
            int num = input.nextInt();
            numbers.add(num);
            if (num == 0) {
                break;
            }
        }

        Integer largestValue = max(numbers);
        System.out.println("The largest value in the list is: " + largestValue);
    }
}