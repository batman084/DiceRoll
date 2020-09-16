import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        // User prompt
        System.out.println("Welcome to Rock Paper Scissors!");
        Scanner rps = new Scanner(System.in);
        System.out.println("Lets play Rock Paper Scissors. The computer will randomly chose an option. What do you chose? (Rock/Paper/Scissors) ");
        String userInput = rps.nextLine();
        System.out.println("You chose " + userInput + ".");

        Random computerValue = new Random();
        computerValue.

        switch (userInput) {
            case "Rock":
                System.out.println("You chose Rock");
            case "Paper":
                System.out.println("You chose Paper");
            case "Scissors":
                System.out.println("You chose Scissors");
        }
    }
}
