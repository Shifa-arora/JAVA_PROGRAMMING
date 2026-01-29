import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("🎮 Tic Tac Toe Game");
        System.out.println("You = X | Computer = O");

        while (true) {

            printBoard();

            // User move
            System.out.print("Enter row (0-2): ");
            int row = sc.nextInt();
            System.out.print("Enter column (0-2): ");
            int col = sc.nextInt();

            if (board[row][col] != ' ') {
                System.out.println("❌ Cell already taken! Try again.");
                continue;
            }

            board[row][col] = 'X';

            if (checkWin('X')) {
                printBoard();
                System.out.println("🎉 You win!");
                break;
            }

            if (isBoardFull()) {
                printBoard();
                System.out.println("🤝 It's a draw!");
                break;
            }

            // Computer move
            int r, c;
            do {
                r = rand.nextInt(3);
                c = rand.nextInt(3);
            } while (board[r][c] != ' ');

            board[r][c] = 'O';
            System.out.println("💻 Computer played at (" + r + ", " + c + ")");

            if (checkWin('O')) {
                printBoard();
                System.out.println("💻 Computer wins!");
                break;
            }

            if (isBoardFull()) {
                printBoard();
                System.out.println("🤝 It's a draw!");
                break;
            }
        }

        sc.close();
    }

    // Print board
    static void printBoard() {
        System.out.println("\nBoard:");
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("---+---+---");
        }
        System.out.println();
    }

    // Check win
    static boolean checkWin(char player) {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player)
                return true;

            if (board[0][i] == player &&
                board[1][i] == player &&
                board[2][i] == player)
                return true;
        }

        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player)
            return true;

        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player)
            return true;

        return false;
    }

    // Check draw
    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }
}

