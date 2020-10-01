// Import needed libraries (Random and Scanner)
import java.util.Scanner;
import java.util.Random;

// Declare main rps class
public class RockPaperScissors {

    // Declare main rps method
    public static void throwRockPaperScissors() throws InterruptedException {

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
            Random rand = new Random();
            //random int to pick computer hand
            int upperBound = 3;
            //picks random number from 0-2
            int int_random = rand.nextInt(upperBound);

            // switch statement for RPS logic
            switch (userLower) {

                //rock case
                case "r":
                case "rock":
            //initial throwing of hands (rock rock)
                    rock();
                    Thread.sleep(600);
                    rock();
                    Thread.sleep(600);


            //shows what you picked
                    System.out.println("You chose Rock");

                    switch (int_random) {
                        //case if the cpu picks rock
                        case 0:
                            rock();
                            System.out.println("You tied!");
                            break;
                        //case if the cpu picks paper
                        case 1:
                            rp();
                            System.out.println("You lost!");
                            break;
                        //case if the cpu picks scissors
                        case 2:
                            rs();
                            System.out.println("You won!");
                            break;
                    }
                    break;

                //paper case
                case "p":
                case "paper":
                    //initial throwing of hands (rock rock)
                    rock();
                    Thread.sleep(600);
                    rock();
                    Thread.sleep(600);
                    //displays what you chose
                    System.out.println("You chose Paper");

                    switch (int_random) {
                        //case if the cpu picks paper
                        case 0:
                            paper();
                            System.out.println("You tied!");
                            break;
                        //case if the cpu picks scissors
                        case 1:
                            ps();
                            System.out.println("You lost!");
                            break;
                        //case if the cpu picks rock
                        case 2:
                            pr();
                            System.out.println("You won!");
                            break;
                    }
                    break;

                //scissors case
                case "s":
                case "scissors":
                    //initial rock throwdown
                    rock();
                    Thread.sleep(600);
                    rock();
                    Thread.sleep(600);
                    //say what you chose
                    System.out.println("You chose Scissors");

                    switch (int_random) {
                        //case if cpu picks scissors
                        case 0:
                            scissors();
                            System.out.println("You tied!");
                            break;
                        //case if cpu picked rock
                        case 1:
                            sr();
                            System.out.println("You lost!");
                            break;
                        //case if cpu picked paper
                        case 2:
                            sp();
                            System.out.println("You won!");
                            break;
                    }
                    break;

                // Exit case
                case "0": // we need to do case "0": instead of case 0: since we are taking user input as a string and case 0: relies on an integer input
                    loop = false;
                    break;

                // Default case if the user input doesn't match rock (r), paper (p), scissors (s)
                default:
                    System.out.println("Your input did not match. Please try again. \n");

            }
        }
    }
    //functions for printing symbols
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
        System.out.println("     _______\t\t\t\t " +           "    _______\n" +
                "---'    ____)____\t\t        (____   '---\n" +
                "           ______)\t\t      (_____)      \n" +
                "          _______)\t\t      (_____)      \n" +
                "         _______)\t\t       (____)      \n" +
                "---.__________)\t\t\t       (___)___.----");
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
        System.out.println("    _______\t\t\t\t\t " +           "    _______\n" +
                "---'   ____)____\t\t        (____   '---\n" +
                "          ______)\t\t     (_____)      \n" +
                "       __________)\t\t     (_____)      \n" +
                "      (____)\t\t\t      (____)      \n" +
                "---.__(___)\t\t\t           (___)___.----");
    }
    static void sp() {
        System.out.println("    _______\t\t\t\t\t_______\t    \n" +
                "---'   ____)____\t   ____(____    '---\n" +
                "          ______)\t  (______\t    \n" +
                "       __________)\t  (_______\t    \n" +
                "      (____)\t\t   (_______         \n" +
                "---.__(___)\t\t         (__________.---");
    }


}
