import java.util.Scanner;

public class UserInterface {
    private static Scanner inputScanner;

    public UserInterface() {
        inputScanner = new Scanner(System.in);
    }

    public static void displayBoard(Board board) {
        for (int i = 0; i < board.getNumRows(); i++) {
            for (int j = 0; j < board.getNumCols(); j++) {
                if (board.getRoom(i, j).isOpened()) {
                    System.out.print(board.getRoom(i, j) + " ");
                } else {
                    System.out.print("- ");
                }
            }
        }
        // Oyun tahtasını ekrana yazdırma
    }

    public static int[] getCoordinates( Board board ) {
        int[] coords = new int[2];
        boolean inputValid = false;

        while (!inputValid) {
            System.out.print("Satır numarasını girin: ");
            coords[0] = inputScanner.nextInt();
            System.out.print("Sütun numarasını girin: ");
            coords[1] = inputScanner.nextInt();

            if (coords[0] >= 0 && coords[0] < board.getNumRows() && coords[1] >= 0 && coords[1] < board.getNumCols()) {
                inputValid = true;
            } else {
                System.out.println("Geçersiz giriş! Lütfen tekrar deneyin.");
            }
        }

        return coords;
    }

    public static void displayMessage(String message) {
        System.out.println(message);
    }
}