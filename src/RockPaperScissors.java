import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void throwRockPaperScissors() {
        // User prompt
        System.out.println("Welcome to Rock Paper Scissors!");
        Scanner rps = new Scanner(System.in);
        System.out.println("Lets play Rock Paper Scissors. The computer will randomly chose an option. What do you chose? (Rock/Paper/Scissors) ");
        String userInput = rps.nextLine();
        String userLower = userInput.toLowerCase();
        Random computerValue = new Random();


        switch (userLower) {
            case "rock":
                rock();
                System.out.println("You chose Rock");
                break;
            case "r":
                rock();
                System.out.println("You chose Rock");
                break;
            case "paper":
                paper();
                System.out.println("You chose Paper");
                break;
            case "p":
                paper();
                System.out.println("You chose Paper");
                break;
            case "scissors":
                scissors();
                System.out.println("You chose Scissors");
                break;
            case "s":
                scissors();
                System.out.println("You chose Scissors");
                break;
        }
    }
    static void rock() {

        System.out.println("---'   ____)\n" +
                "      (_____)\n" +
                "      (_____)\n" +
                "      (____)\n" +
                "---.__(___)\n");
    }
    static void paper() {

        System.out.println("    _______\n" +
                "---'   ____)____\n" +
                "          ______)\n" +
                "          _______)\n" +
                "         _______)\n" +
                "---.__________)\n");
    }
    static void scissors() {

        System.out.println("    _______\n" +
                "---'   ____)____\n" +
                "          ______)\n" +
                "       __________)\n" +
                "      (____)\n" +
                "---.__(___)");
    }
}
