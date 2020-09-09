import java.util.Scanner;
import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //start input stream
        System.out.println("Would you like to roll a dice? [y/n]: ");
        String input= sc.nextLine();
        if (input.equals("y")) {
            System.out.println("Proceeding with roll");
            rollDice();
        }
        else {
            System.out.println("Skipping dice roll");
        }
    }
    static void rollDice() {
        Random rand = new Random(); //Instance of new random class
        System.out.println("Temp"); //temp content for function
        int[] diceFace = {1, 2, 3, 4, 5, 6};
        int upperBound = 5;
        int int_random = rand.nextInt(upperBound);
        System.out.println("You rolled a " + diceFace[int_random]);
    }
}