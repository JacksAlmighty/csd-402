//Jackson Webster
//10/2/2025
//M4 Programming Assignment
//This program calculates and displays the average of different types of arrays using four overloaded methods for short, int, long, and double.

import java.util.Arrays;

public class M4 {
    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
    
    public static short average(short[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (short) (sum / array.length);
    }
    
    public static long average(long[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
    
    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        
        short[] shortArr= {1, 2, 3};
        int[] intArr = {4,5,6,7,8};
        long[] longArr = {10L, 20L, 30L, 40L};
        double[] doubleArr = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};
    
        System.out.println("Short array: " + Arrays.toString(shortArr));
        System.out.println("Average: " + average(shortArr));
        System.out.println();

        System.out.println("Int array: " + Arrays.toString(intArr));
        System.out.println("Average: " + average(intArr));
        System.out.println();

        System.out.println("Long array: " + Arrays.toString(longArr));
        System.out.println("Average: " + average(longArr));
        System.out.println();

        System.out.println("Double array: " + Arrays.toString(doubleArr));
        System.out.println("Average: " + average(doubleArr));
    }

}

