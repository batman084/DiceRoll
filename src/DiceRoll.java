import java.util.Scanner;
import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        OUTER_LOOP: //label
        for (;;) {
            Scanner sc= new Scanner(System.in); //start input stream
            System.out.println("Would you like to roll a dice? [y/n]: ");
            String input= sc.nextLine();
            LOOP: //label
            if (input.equals("y")) {

                System.out.println("Proceeding with roll");
                rollDice();
            }
            else if (input.equals("n")) {
                System.out.println("Skipping dice roll");
                break OUTER_LOOP;
            }
            else {
                System.out.println("Your input is not accepted. Please try again");
                break LOOP;
            }
        }
        System.out.println();
        System.out.println("Thanks for using the Dice Roller!");

    }
    static void rollDice() {

        Random rand = new Random(); //Instance of new random class
        int[] diceFace = {1, 2, 3, 4, 5, 6};
        int upperBound = 6;
        int int_random = rand.nextInt(upperBound);

        rollAnimation();

        switch (int_random) {
            case 0:
                printface1();
                break;
            case 1:
                printface2();
                break;
            case 2:
                printface3();
                break;
            case 3:
                printface4();
                break;
            case 4:
                printface5();
                break;
            case 5:
                printface6();
                break;
        }
        System.out.println("You rolled a " + diceFace[int_random]);
    }
    static void rollAnimation() {
        clearScreen();
        Random rand = new Random();
        int lastface = 100;
        for (int x =0; x<5;) {
            int[] diceface = {1, 2, 3, 4, 5, 6};
            int upperBound = 6;
            int int_rando = rand.nextInt(upperBound);
            switch (int_rando) {
                case 0:
                    if (lastface == 1) {
                        break;
                    }
                    printface1();
                    x++;
                    lastface = 1;
                    break;
                case 1:
                    if (lastface == 2) {
                        break;
                    }
                    printface2();
                    x++;
                    lastface = 2;
                    break;

                case 2:
                    if (lastface == 3) {
                        break;
                    }
                    printface3();
                    x++;
                    lastface = 3;
                    break;

                case 3:
                    if (lastface == 4) {
                        break;
                    }
                    printface4();
                    x++;
                    lastface = 4;
                    break;
                case 4:
                    if (lastface == 5) {
                        break;
                    }
                    printface5();
                    x++;
                    lastface = 5;
                    break;
                case 5:
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
    static void printface1() {
        System.out.println("----------");
        System.out.println("|        |");
        System.out.println("|    0   |");
        System.out.println("|        |");
        System.out.println("----------");
    }
    static void printface2() {
        System.out.println("----------");
        System.out.println("|  0     |");
        System.out.println("|        |");
        System.out.println("|      0 |");
        System.out.println("----------");
    }
    static void printface3() {
        System.out.println("----------");
        System.out.println("|0       |");
        System.out.println("|   0    |");
        System.out.println("|       0|");
        System.out.println("----------");
    }
    static void printface4() {
        System.out.println("----------");
        System.out.println("| 0    0 |");
        System.out.println("|        |");
        System.out.println("| 0    0 |");
        System.out.println("----------");
    }
    static void printface5() {
        System.out.println("----------");
        System.out.println("| 0    0 |");
        System.out.println("|   0    |");
        System.out.println("| 0    0 |");
        System.out.println("----------");
    }
    static void printface6() {
        System.out.println("----------");
        System.out.println("| 0    0 |");
        System.out.println("| 0    0 |");
        System.out.println("| 0    0 |");
        System.out.println("----------");
    }
}