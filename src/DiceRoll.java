// Import needed libraries (Random and Scanner)
import java.util.Scanner;
import java.util.Random;

// Define main DiceRoll class
public class DiceRoll {

    //declare main method rollDice within DiceRoll class
    public static void rollDice() {

        //Instance of new random class, creation of object rand from Random class
        Random rand = new Random();

        // Declare 6 numebr array for later use
        int[] diceFace = {1, 2, 3, 4, 5, 6};

        // Define index upper bound of rand object and nextInt method
        int upperBound = 6;

        // Declare random integer using nextInt method
        int int_random = rand.nextInt(upperBound);

        // Queue animation for dice roll
        rollAnimation();

        // Switch case logic for different dice faces
        switch (int_random) {
            case 0:
                // print the ascii art for dice face 1
                printface1();
                break;
            case 1:
                // print the ascii art for dice face 2
                printface2();
                break;
            case 2:
                // print the ascii art for dice face 3
                printface3();
                break;
            case 3:
                // print the ascii art for dice face 4
                printface4();
                break;
            case 4:
                // print the ascii art for dice face 5
                printface5();
                break;
            case 5:
                // print the ascii art for dice face 6
                printface6();
                break;
        }
        // Print final result to console so user can easily see
        System.out.println("You rolled a " + diceFace[int_random]);
    }

    // Dice roll animation method
    public static void rollAnimation() {

        //Instance of new random class, creation of object rand from Random class
        Random rand = new Random();

        // Declare lastface integer to use in case statements
        int lastface = 0; // Why cant we just make this int lastface; ?

        // For loop to displace dice face 5 times to imitate an animation
        for (int x =0; x<5;) {

            // Declare index count upper bound
            int upperBound = 6;

            // Use nextInt method to get random number
            int int_rando = rand.nextInt(upperBound);

            // Switch statement logic for dice roll animation
            switch (int_rando) {
                case 0:
                    // Ensure we do not print the same face 2 times in a row
                    if (lastface == 1) {
                        break;
                    }
                    printface1();
                    x++;
                    lastface = 1;
                    break;
                case 1:
                    // Ensure we do not print the same face 2 times in a row
                    if (lastface == 2) {
                        break;
                    }
                    printface2();
                    x++;
                    lastface = 2;
                    break;

                case 2:
                    // Ensure we do not print the same face 2 times in a row
                    if (lastface == 3) {
                        break;
                    }
                    printface3();
                    x++;
                    lastface = 3;
                    break;

                case 3:
                    // Ensure we do not print the same face 2 times in a row
                    if (lastface == 4) {
                        break;
                    }
                    printface4();
                    x++;
                    lastface = 4;
                    break;
                case 4:
                    // Ensure we do not print the same face 2 times in a row
                    if (lastface == 5) {
                        break;
                    }
                    printface5();
                    x++;
                    lastface = 5;
                    break;
                case 5:
                    // Ensure we do not print the same face 2 times in a row
                    if (lastface == 6) {
                        break;
                    }
                    printface6();
                    x++;
                    lastface = 6;
                    break;

            }

        }

    }

    // Functions used to print dice faces to console, used in 2 methods above.
    public static void printface1() {
        System.out.println("----------");
        System.out.println("|        |");
        System.out.println("|    0   |");
        System.out.println("|        |");
        System.out.println("----------");
    }
    public static void printface2() {
        System.out.println("----------");
        System.out.println("|  0     |");
        System.out.println("|        |");
        System.out.println("|      0 |");
        System.out.println("----------");
    }
    public static void printface3() {
        System.out.println("----------");
        System.out.println("|0       |");
        System.out.println("|   0    |");
        System.out.println("|       0|");
        System.out.println("----------");
    }
    public static void printface4() {
        System.out.println("----------");
        System.out.println("| 0    0 |");
        System.out.println("|        |");
        System.out.println("| 0    0 |");
        System.out.println("----------");
    }
    public static void printface5() {
        System.out.println("----------");
        System.out.println("| 0    0 |");
        System.out.println("|   0    |");
        System.out.println("| 0    0 |");
        System.out.println("----------");
    }
    public static void printface6() {
        System.out.println("----------");
        System.out.println("| 0    0 |");
        System.out.println("| 0    0 |");
        System.out.println("| 0    0 |");
        System.out.println("----------");
    }
}