// Import needed libraries (Random and Scanner)
import java.util.Scanner;
import java.util.Random;

// Declare main rps class
public class RockPaperScissors {

    // Declare main rps method
    public static void throwRockPaperScissors() {

        // Declaration of boolean for while loop
        boolean loop = true;

        // Welcome message
        System.out.println("Welcome to Rock Paper Scissors!");

        // While loop for constant user input if bad user input
        while (loop) {

            // Initialize User input object from imported scanner class
            Scanner rps = new Scanner(System.in);
            System.out.println("Lets play Rock Paper Scissors. The computer will randomly chose an option. What do you chose? (Rock/Paper/Scissors/0 to exit) ");

            // Capture user input as a string
            String userInput = rps.nextLine();

            // Convert string to lowercase for later string matching
            String userLower = userInput.toLowerCase();

            // Random object declration
            Random computerValue = new Random();

            // switch statement for RPS logic
            switch (userLower) {

                //rock case
                case "r":
                case "rock":
                    rock();
                    System.out.println("You chose Rock");
                    break;

                //paper case
                case "p":
                case "paper":
                    paper();
                    System.out.println("You chose Paper");
                    break;

                //paper scissors
                case "s":
                case "scissors":
                    scissors();
                    System.out.println("You chose Scissors");
                    break;

                // Default case if the user input doesn't match rock (r), paper (p), scissors (s)
                default:
                    break;

                // Exit case
                case "0": // we need to do case "0": instead of case 0: since we are taking user input as a string and case 0: relies on an integer input
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
    static void rp() {
        System.out.println(
                "    _______\t\t\t\t_______\t    \n" +
                        "---'   ____)\t   ____(____    '---\n" +
                        "      (_____)\t  (______\t    \n" +
                        "      (_____)\t  (_______\t    \n" +
                        "      (____)\t   (_______         \n" +
                        "---.__(___)\t\t     (__________.---");
    }
    static void rs() {
        System.out.println(
                "    _______\t\t\t\t\t_______    \n" +
                        "---'   ____)\t   ____(___    '---\n" +
                        "      (_____)\t  (______\t   \n" +
                        "      (_____)\t (__________       \n" +
                        "      (____)\t\t       (____)      \n" +
                        "---.__(___)\t\t\t        (___)__.---");
    }
    static void pr() {
        System.out.println("     _______\\t\\t\\t\\t\\t\" +           \" _______\n" +
                "---'    ____)____\t\t        (____   '---\n" +
                "           ______)\t\t      (_____)      \n" +
                "          _______)\t\t      (_____)      \n" +
                "         _______)\t\t      (____)      \n" +
                "---.__________)\\t\\t\\t       (___)___.----");
    }
    static void ps() {
        System.out.println("     _______\t\t\t\t\t_______    \n" +
                "---'    ____)____\t   ____(___    '---\n" +
                "           ______)\t  (______\t   \n" +
                "          _______)\t (__________       \n" +
                "         _______)\t\t       (____)      \n" +
                "---.__________)\t\t\t        (___)__.---");
    }
    static void sr() {
        System.out.println("    _______\\t\\t\\t\\t\\t\" +           \" _______\n" +
                "---'   ____)____\t\t        (____   '---\n" +
                "          ______)\t\t      (_____)      \n" +
                "       __________)\t\t      (_____)      \n" +
                "      (____)\t\t      (____)      \n" +
                "---.__(___)\\t\\t\\t       (___)___.----");
    }
    static void sp() {
        System.out.println("    _______\t\t\t\t_______\t    \n" +
                "---'   ____)____\t   ____(____    '---\n" +
                "          ______)\t  (______\t    \n" +
                "       __________)\t  (_______\t    \n" +
                "      (____)\t   (_______         \n" +
                "---.__(___)\t\t     (__________.---");
    }


}
