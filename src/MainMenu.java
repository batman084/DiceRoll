import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc= new Scanner(System.in); //initializes scanner for input
        boolean finalBreak = true; //boolean that controls the infinite while loop is created and set to true
        while(finalBreak) { //infinite while loop that will run until finalBreak is false
            //menu is printed out. number correlate to each mini-game/leaving the project
            System.out.println("Welcome to Mini Games! Please select which game you would like to play: ");
            System.out.println("0. Exit the Mini Games"); //menu item to leave the project
            System.out.println("1. Dice Roll");
            System.out.println("2. Coin Flip");
            System.out.println("3. Rock Paper Scissors");
            int menuChoice = sc.nextInt(); //make new variable to get user choice from input
            // System.out.println("You have chosen " + menuChoice); //tells the user what choice they chose
            switch (menuChoice) { //switch case for menu choice
                case 0: //case for leaving the project
                    System.out.println("You have chosen to exit the Mini Games. We hope you had a good time!");
                    finalBreak = false; //sets variable that controls the while loop to false so that the while loop doesn't run anymore
                    break;
                case 1: //case for running Dice Roll
                    System.out.println("You have chosen to play Dice Roll.");
                    System.out.println("How many times would you like to roll a dice?");
                    int repeat = sc.nextInt();
                    DiceRoll.rollDice(repeat);
                    break;
                case 2: //case for Coin Flip
                    System.out.println("You have chosen to play Coin Flip");
                    CoinFlip.coinFlip();
                    break;
                case 3: //case for Rock Paper Scissors
                    System.out.println("You have chosen to play Rock Paper Scissors");
                    RockPaperScissors.throwRockPaperScissors();
                    break;
                default: //default case runs if the input doesn't match any other case
                    System.out.println("Your input is not correct. Please try again.\n");
            }

        }
        System.out.println("Thank you for playing. You are exiting."); //letting the user know they are leaving
        }


}