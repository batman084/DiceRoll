import java.util.Arrays;
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
    public static void rollDice() {
        Random rand = new Random(); //Instance of new random class
        int[] diceFace = {1, 2, 3, 4, 5, 6};
        int upperBound = 5;
        int int_random = rand.nextInt(upperBound);
        switch (int_random) {
            case 0:
                System.out.println();
                break;
            case 1:
                System.out.println();
                break;
            case 2:
                System.out.println();
                break;
            case 3:
                System.out.println();
                break;
            case 4:
                System.out.println();
                break;
            case 5:
                System.out.println();
                break;
        }
        rollAnimation();
        System.out.println("You rolled a " + diceFace[int_random]);
    }
    static void rollAnimation() {
        //make dice faces only and cycle through them
        System.out.println("                                                                                     *%&&&%(.                                                    ");
        System.out.println();
        System.out.println("                                                                                   %#            .(&%%*                                               ");
        System.out.println();
        System.out.println("                                                                               /&    .&&&&&%             *&&&#.                                      ");
        System.out.println();
        System.out.println("                                                                              &        .#/                       &&.                                  ");
        System.out.println();
        System.out.println("                                                                           &,                      #&&&&&%     &#  .&                                 ");
        System.out.println();
        System.out.println("                                                                        ##                                  %%       &.                               ");



















    }

    static void ticTacToe() {
        int[][] board = new int[3][3];
        System.out.println("This is the board: " + Arrays.toString(board));
    }
}