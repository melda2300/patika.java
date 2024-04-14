
import java.util.Scanner;

public class MineSweeper {
    private Board gameBoard;
    private boolean isGameOver;
    private Scanner inputScanner;

    public MineSweeper( int numRows, int numCols ) {
        gameBoard = new Board(numRows, numCols);
        inputScanner = new Scanner(System.in);
        isGameOver = false;
    }
    public void startGame() {
        while (!isGameOver) {
            UserInterface.displayBoard(gameBoard);
            int[] coords = UserInterface.getCoordinates(gameBoard);
            if (coords != null) {
                isGameOver = gameBoard.selectRoom(coords[0], coords[1]);
                if (isGameOver) {
                    UserInterface.displayMessage("Tebrikler! Kazandın!");
                } else {
                    UserInterface.displayMessage("Maalesef kaybettiniz.");
                }
            }
        }
    }


    private int[] getCoordinates() {
        int[] coords = new int[2];
        boolean inputValid = false;

        while (!inputValid) {
            System.out.print("Satır numarasını girin: ");
            coords[0] = inputScanner.nextInt();
            System.out.print("Sütun numarasını girin: ");
            coords[1] = inputScanner.nextInt();

            if (coords[0] >= 0 && coords[0] < gameBoard.getNumRows() && coords[1] >= 0 && coords[1] < gameBoard.getNumCols()) {
                inputValid = true;
            } else {
                System.out.println("Geçersiz giriş! Lütfen tekrar deneyin.");
            }
        }

        return coords;
    }

    private void restartGame() {
        gameBoard = new Board(gameBoard.getNumRows(), gameBoard.getNumCols());
        isGameOver = false;
    }
}
