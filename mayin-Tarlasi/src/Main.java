import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Satır sayısını girin: ");
            int numRows = scanner.nextInt();
            System.out.print("Sütun sayısını girin: ");
            int numCols = scanner.nextInt();

            MineSweeper game = new MineSweeper(numRows, numCols);
            game.startGame();
        }
    }
}