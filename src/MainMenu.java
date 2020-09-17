import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //start input stream
        boolean loopBreak = true;
        while (loopBreak) {
            System.out.println("Would you like to roll a dice? [y/n]: ");
            String input= sc.nextLine();
            if (input.equals("y")) {
                System.out.println("Proceeding with roll");
                DiceRoll.rollDice();
            }
            else if (input.equals("n")) {
                System.out.println("Skipping dice roll");
                loopBreak = false;
            }
            else {
                System.out.println("Your input is not accepted. Please try again");
            }
        }
        System.out.println();
        System.out.println("Thanks for using the Dice Roller!");

    }
}
