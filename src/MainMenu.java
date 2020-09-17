import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //start input stream
        boolean finalBreak = true;
        while(finalBreak) {
            System.out.println("Welcome to Mini Games! Please select which game you would like to play: ");
            System.out.println("1. Dice Roll");
            System.out.println("2. Coin Flip");
            System.out.println("3. Rock Paper Scissors");
            int menuChoice = sc.nextInt();
            System.out.println("You have chosen " + menuChoice);
            switch (menuChoice) {
                case 1:
                    System.out.println("You have chosen to play Dice Roll.");
                    runDiceRoll();
                    break;
                case 2:
                    System.out.println("You have chosen to play Coin Flip");
                    runCoinFlip();
                    break;
                case 3:
                    System.out.println("You have chosen to play Rock Paper Scissors");
                    runRPS();
                    break;
            }
            System.out.println("Thank you for playing. Would you like to play again? [yes/no]");
            Scanner scanFinal= new Scanner(System.in); //start input stream
            String again = scanFinal.nextLine();
            if (again == "yes") {
                System.out.println("You will be taken back to the menu. Select the game you would like to play.");
            }
            else if (again == "no") {
                System.out.println("Thank you for playing!");
                finalBreak = false;
            }

        }
        System.out.println("Thank you for playing. You are exiting.");
        }

    //dice roll
    public static void runDiceRoll() {
        DiceRoll.rollDice();
    }
    //coin flip
    public static void runCoinFlip() {
        CoinFlip.coinFlip();
    }
    //rock paper scissors
    public static void runRPS() {
        RockPaperScissors.throwRockPaperScissors();
    }


}
