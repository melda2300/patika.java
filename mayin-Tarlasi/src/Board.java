import java.util.Random;

public class Board {
    private Room[][] cells;
    private int numRows;
    private int numCols;
    private int totalMines;
    private int remainingRooms;

    public Board(int numRows, int numCols) {
        this.numCols = numCols;
        this.numRows = numRows;
        cells = new Room[numRows][numCols];
        totalMines = numRows * numCols / 4;
        remainingRooms = numRows * numCols;
        initializeBoard();
        placeMines();
    }

    private void initializeBoard() {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                cells[i][j] = new Room();
            }
        }
    }

    private void placeMines() {
        Random random = new Random();
        int minesPlaced = 0;
        while (minesPlaced < totalMines) {
            int x = random.nextInt(numRows);
            int y = random.nextInt(numCols);
            if (!cells[x][y].isMine()) {
                cells[x][y].setMine(true);
                minesPlaced++;
            }
        }
    }

    public boolean selectRoom(int row, int col) {
        if (cells[row][col].isMine()) {
            return true; // game over
        }

        cells[row][col].setOpened(true);
        remainingRooms--;

        if (cells[row][col].getAdjacentMines() == 0) {
            for (int i = row - 1; i <= row + 1; i++) {
                for (int j = col - 1; j <= col + 1; j++) {
                    if (isValidRoom(i, j) && !cells[i][j].isOpened()) {
                        if (selectRoom(i, j)) {
                            return true; // game over
                        }
                    }
                }
            }
        }

        return false; // game not over
    }

    private boolean isValidRoom(int x, int y) {
        return x >= 0 && x < numRows && y >= 0 && y < numCols;
    }

    public Room getRoom(int row, int col) {
        return cells[row][col];
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public int getTotalMines() {
        return totalMines;
    }

    public int getRemainingRooms() {
        return remainingRooms;
    }
}