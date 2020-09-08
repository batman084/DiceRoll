import java.util.Scanner;

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
        System.out.println("Temp"); //temp content for function
    }
}