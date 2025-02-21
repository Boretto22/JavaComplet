import java.util.Random;
import java.util.Scanner;

public class BuscaMinas {

    private static final int ROWS = 5; // Nombre de files
    private static final int COLS = 5; // Nombre de columnes
    private static final int MINES = 5; // Nombre de mines

    public static void main(String[] args) {
        char[][] board = new char[ROWS][COLS];
        boolean[][] mines = new boolean[ROWS][COLS];
        boolean gameOver = false;

        initializeBoard(board);
        placeMines(mines);

        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.println("Introdueix la fila i la columna (0-" + (ROWS - 1) + "):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 0 || row >= ROWS || col < 0 || col >= COLS) {
                System.out.println("Coordenades fora del límit! Torna a provar.");
                continue;
            }

            if (mines[row][col]) {
                System.out.println("BOOM! Has trobat una mina! Has perdut.");
                gameOver = true;
            } else {
                int adjacentMines = countAdjacentMines(mines, row, col);
                board[row][col] = (char) ('0' + adjacentMines);
                if (isGameWon(board, mines)) {
                    printBoard(board);
                    System.out.println("Enhorabona! Has descobert totes les caselles sense mines.");
                    gameOver = true;
                }
            }
        }
        scanner.close();
    }

    // Inicialitza el tauler amb caràcters ocults
    private static void initializeBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Col·loca mines aleatòriament al tauler
    private static void placeMines(boolean[][] mines) {
        Random random = new Random();
        int placedMines = 0;

        while (placedMines < MINES) {
            int row = random.nextInt(ROWS);
            int col = random.nextInt(COLS);

            if (!mines[row][col]) {
                mines[row][col] = true;
                placedMines++;
            }
        }
    }

    // Compta les mines adjacents a una casella
    private static int countAdjacentMines(boolean[][] mines, int row, int col) {
        int count = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = row + i;
                int newCol = col + j;

                if (newRow >= 0 && newRow < ROWS && newCol >= 0 && newCol < COLS && mines[newRow][newCol]) {
                    count++;
                }
            }
        }
        return count;
    }

    // Mostra el tauler actual
    private static void printBoard(char[][] board) {
        System.out.print("   ");
        for (int col = 0; col < COLS; col++) {
            System.out.print(col + " ");
        }
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" " + board[i][j]);
            }
            System.out.println();
        }
    }

    // Comprova si el jugador ha descobert totes les caselles sense mines
    private static boolean isGameWon(char[][] board, boolean[][] mines) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '-' && !mines[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}