//Jackson Webster
//Assignment: M2: Programming Assignment
//9/20/2025
//This program takes user input to play a game of Rock Paper Scissors with a computer Outputting whoever wins and both sides choices.

import java.util.Random;
import java.util.Scanner;


public class RPS{
    public static void main(String[] args){
    System.out.print("Welcome to my game this is Rock, Paper, Scissors!\n");
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Make your choice numbers only!\n");
    System.out.print(" 1 = Rock\n 2 = Paper\n 3 = scissors\n");
    int choice = scanner.nextInt();
    
    //Generates a random number from 1 - 3
    Random rand = new Random();
    int randomNumber = rand.nextInt(3) + 1;
    
    String computerChoice = "";
    
    //assigns the computers choice to Rock Paper or Scissors then displays choice  
    switch (randomNumber) {
    case 1 -> computerChoice = "rock";
    case 2 -> computerChoice = "paper";
    case 3 -> computerChoice = "scissors";
    default -> computerChoice = ""; 
}
    System.out.println("Computer chose: " + computerChoice);

    String playerChoice = "";
    
    //Assigns the players choice to Rock Paper or Scissors then displays choice 
    switch (choice) {
        case 1 -> playerChoice = "rock";
        case 2 -> playerChoice = "paper";
        case 3 -> playerChoice = "scissors";
    default -> playerChoice = "";
    
    }
    System.out.println("You chose: " + playerChoice);
    
    // decides who wins based on choices and outputs winner 
    if (playerChoice.equals(computerChoice)) {
        System.out.println("It's a tie!");
    } else if (
        (playerChoice.equals("rock") && computerChoice.equals("scissors"))||
        (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
        (playerChoice.equals("scissors") && computerChoice.equals("paper"))
    ) {
        System.out.println("You Win!");
    }else {
        System.out.println("Computer wins!");
    } 
    
    }
}

