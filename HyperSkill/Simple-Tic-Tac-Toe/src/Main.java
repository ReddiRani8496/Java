import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static char[][] matrix = new char[3][3];

    public static void main(String[] args) {
        initializeGrid();
        printGrid();

        char currentPlayer = 'X';

        while (!isGameEnded()) {
            makeMove(currentPlayer);
            printGrid();
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        System.out.println(checkGameResult());
    }

    private static void initializeGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = '_';
            }
        }
    }

    private static void printGrid() {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    private static void makeMove(char player) {
        int row, col;

        while (true) {
            try {
                System.out.println("Player " + player + ", enter the coordinates (row col): ");
                row = scanner.nextInt();
                col = scanner.nextInt();

                if (row < 1 || row > 3 || col < 1 || col > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else if (matrix[row - 1][col - 1] != '_') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    matrix[row - 1][col - 1] = player;
                    break;
                }
            } catch (Exception e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }
        }
    }

    private static boolean isGameEnded() {
        return checkGameResult() != "Game not finished";
    }

    private static String checkGameResult() {
        for (int i = 0; i < 3; i++) {
            if (matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2]) {
                if (matrix[i][0] == 'X') return "X wins";
                else if (matrix[i][0] == 'O') return "O wins";
            }
        }

        for (int i = 0; i < 3; i++) {
            if (matrix[0][i] == matrix[1][i] && matrix[1][i] == matrix[2][i]) {
                if (matrix[0][i] == 'X') return "X wins";
                else if (matrix[0][i] == 'O') return "O wins";
            }
        }


        if ((matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]) ||
                (matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0])) {
            if (matrix[1][1] == 'X') return "X wins";
            else if (matrix[1][1] == 'O') return "O wins";
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == '_') {
                    return "Game not finished";
                }
            }
        }

        return "Draw";
    }
}
