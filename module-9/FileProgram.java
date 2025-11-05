//Jackson Webster
//Module 9 Asisignment Part 2
//11/4/2025
//This program creates or updates a file by writing 10 random numbers to it, then reads and displays the file’s contents.

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FileProgram {
    public static void main(String[] args) {
        File file = new File("data.file");
        Random rand = new Random();

        try {
            // Create file if it doesn't exist
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists. Appending new data...");
            }

            // Write or append 10 random numbers to file
            FileWriter writer = new FileWriter(file, true);
            for (int i = 0; i < 10; i++) {
                writer.write(rand.nextInt(100) + " "); 
            }
            writer.close();
            System.out.println("Data written successfully.");

            // Read and display file data
            Scanner reader = new Scanner(file);
            System.out.println("\nFile contents:");
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}