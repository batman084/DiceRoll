import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void throwRockPaperScissors() {
        boolean loop = true;
        // User prompt
        while (loop) {
            System.out.println("Welcome to Rock Paper Scissors!");
            Scanner rps = new Scanner(System.in);
            System.out.println("Lets play Rock Paper Scissors. The computer will randomly chose an option. What do you chose? (Rock/Paper/Scissors) ");
            String userInput = rps.nextLine();
            String userLower = userInput.toLowerCase();
            Random computerValue = new Random();


            switch (userLower) {

                case "r":
                case "rock":
                    rock();
                    System.out.println("You chose Rock");
                    break;
                case "p":
                case "paper":
                    paper();
                    System.out.println("You chose Paper");
                    break;

                case "s":
                case "scissors":
                    scissors();
                    System.out.println("You chose Scissors");
                    break;

                default:
                    break;
            }
        }
    }
    static void rock() {

        System.out.println(
                "    _______\t\t\t\t\t" +           " _______\n" +
                "---'   ____)\t\t        (____   '---\n" +
                "      (_____)\t\t      (_____)      \n" +
                "      (_____)\t\t      (_____)      \n" +
                "      (____)\t\t      (____)      \n" +
                "---.__(___)\t\t\t       (___)___.----");
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
