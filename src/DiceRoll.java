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
        int upperBound = 5;
        int int_random = rand.nextInt(upperBound);
        System.out.println("You rolled a " + diceFace[int_random]);
    }
}