import java.util.Random;

public class Board {

    private Room[][] rooms;
    private int rows;
    private int cols;
    private int totalMines;
    private int remainingRooms;

    public Board( int rows, int cols ) {
        this.cols = cols;
        this.rows = rows;
        rooms = new Room[rows][cols];
        totalMines = rows * cols / 4;
        remainingRooms = rows * cols;
    }

    private void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rooms[i][j] = new Room();
            }
        }
    }

    private void placeMines() {
        Random random = new Random();
        int minesPlaced = 0;
        while (minesPlaced < totalMines) {
            int x = random.nextInt(rows);
            int y = random.nextInt(cols);
            if (!rooms[x][y].isMine()) {
                rooms[x][y].setMine(true);
                minesPlaced++;
            }
        }
    }

    public boolean selectRoom( int x, int y ) {
        if (rooms[x][y].isMine()) {
            System.out.println("Oyun bitti! Mayına bastın. ");
            return true; // oyun biter
        }
        rooms[x][y].setOpened(true);
        remainingRooms++;
        if (rooms[x][y].getAdjacentMines() == 0) {
            for (int i = x - 1; i <= x + 1; i++) {
                for (int j = y - 1; j <= y + 1; j++) {
                    if (isValidRoom(i, j) && !rooms[i][y].isOpened()) {
                        selectRoom(i, j);
                    }
                }
            }
        }
        return false;
    }

    private boolean isValidRoom( int x, int y ) {
        return x >= 0 && x <= rows && y >= 0 && y <= cols;
    }


    public Room[][] getRooms( int i, int j ) {
        return rooms;
    }

    public void setRooms( Room[][] rooms ) {
        this.rooms = rooms;
    }

    public int getRows() {
        return rows;
    }

    public void setRows( int rows ) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols( int cols ) {
        this.cols = cols;
    }

    public int getTotalMines() {
        return totalMines;
    }

    public void setTotalMines( int totalMines ) {
        this.totalMines = totalMines;
    }

    public int getRemainingRooms() {
        return remainingRooms;
    }

    public void setRemainingRooms( int remainingRooms ) {
        this.remainingRooms = remainingRooms;
    }
}
