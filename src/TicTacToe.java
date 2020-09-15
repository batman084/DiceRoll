import java.util.Arrays;

public class TicTacToe {
    public static void main(String[] args) {
        int board[][] = { {0,0,0}, {0,0,0}, {0,0,0} };
        for (int i = 0; i < board.length -1; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.println(board[i][j]);
            }
        }
    }
}
