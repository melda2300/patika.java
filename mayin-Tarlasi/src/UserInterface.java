import java.util.Scanner;

public class UserInterface {

    public UserInterface() {
        Scanner scanner = new Scanner(System.in);
    }

    public void displayBoard(Board board) {
    // Oyun tahtasını ekrana yazdırma
    }
    public int[] getCoordinates(Board board) {
        // Kullanıcıdan koordinatları al ve dizi olarak geri döndür
        return new int[]{0};
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

}