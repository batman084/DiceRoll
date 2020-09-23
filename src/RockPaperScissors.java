import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void throwRockPaperScissors() {
        boolean loop = true;
        System.out.println("Welcome to Rock Paper Scissors!");
        // User prompt
        while (loop) {

            Scanner rps = new Scanner(System.in);
            System.out.println("Lets play Rock Paper Scissors. The computer will randomly chose an option. What do you chose? (Rock/Paper/Scissors/0 to exit) ");
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

                case "0":
                    loop = false;
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

        System.out.println("     _______\t\t\t\t_______\t    \n" +
                "---'    ____)____\t   ____(____    '---\n" +
                "           ______)\t  (______\t    \n" +
                "          _______)\t  (_______\t    \n" +
                "         _______)\t   (_______         \n" +
                "---.__________)\t\t     (__________.---");
    }
    static void scissors() {

        System.out.println("    _______\t\t\t\t\t_______    \n" +
                "---'   ____)____\t   ____(___    '---\n" +
                "          ______)\t  (______\t   \n" +
                "       __________)\t (__________       \n" +
                "      (____)\t\t       (____)      \n" +
                "---.__(___)\t\t\t        (___)__.---");
    }
}
