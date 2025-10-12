//Jackson Webster
//10/12/2025
//Assignment 5
//This program defines four methods to find the location of the largest and smallest elements.

public class Array{
    public static int [] locateLargest(int[][] arrayParam) {
        int maxRow = 0;
        int maxCol = 0;
        int maxValue = arrayParam[0][0];
    
        for (int row = 0; row < arrayParam.length; row++) {

            for(int col = 0; col < arrayParam[row].length; col++) {
                

                if (arrayParam[row][col] > maxValue) {
                    maxValue = arrayParam[row][col];
                    maxRow = row;
                    maxCol = col;
                }
                
            }
        }
    
        return new int[] {maxRow, maxCol};
    }

    public static int [] locateLargest(double[][] arrayParam) {
        int maxRow = 0;
        int maxCol = 0;
        double maxValue = arrayParam[0][0];
    
        for (int row = 0; row < arrayParam.length; row++) {

            for(int col = 0; col < arrayParam[row].length; col++) {
                

                if (arrayParam[row][col] > maxValue) {
                    maxValue = arrayParam[row][col];
                    maxRow = row;
                    maxCol = col;
                }
                
            }
        }
    
        return new int[] {maxRow, maxCol};
    }

    public static int[] locateSmallest(int[][] arrayParam) {
    int minRow = 0;
    int minCol = 0;
    int minValue = arrayParam[0][0];

    for (int row = 0; row < arrayParam.length; row++) {
        for (int col = 0; col < arrayParam[row].length; col++) {
            if (arrayParam[row][col] < minValue) {
                minValue = arrayParam[row][col];
                minRow = row;
                minCol = col;
            }
        }
    }

    return new int[] {minRow, minCol};
    }

    public static int[] locateSmallest(double[][] arrayParam) {
    int minRow = 0;
    int minCol = 0;
    double minValue = arrayParam[0][0];

    for (int row = 0; row < arrayParam.length; row++) {
        for (int col = 0; col < arrayParam[row].length; col++) {
            if (arrayParam[row][col] < minValue) {
                minValue = arrayParam[row][col];
                minRow = row;
                minCol = col;
            }
        }
    }

    return new int[] {minRow, minCol};
    }

    public static void main(String[] args) {
        int[][] nums = {
            {3, 5, 2},
            {1, 9, 4},
            {7, 6, 8}
        };

        double[][] decimals = {
            {2.3, 5.7, 9.1},
            {1.2, 8.6, 3.5}
        };

        int[] largestInt = locateLargest(nums);
        int[] smallestInt = locateSmallest(nums);

        int[] largestDouble = locateLargest(decimals);
        int[] smallestDouble = locateSmallest(decimals);

        System.out.println("Largest int location: [" + largestInt[0] + ", " + largestInt[1] + "]");
        System.out.println("Smallest int location: [" + smallestInt[0] + ", " + smallestInt[1] + "]");
        System.out.println("Largest double location: [" + largestDouble[0] + ", " + largestDouble[1] + "]");
        System.out.println("Smallest double location: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]");
    }
}



