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
        for (int i = 0;i < rows;i++){
            for (int j =0;j<cols;j++){
                rooms[i][j]=new Room();
            }
        }
    }
    private  void placeMines(){
        Random random=new Random();
        int minesPlaced=0;
        while (minesPlaced < totalMines) {
            int x= random.nextInt(rows);
            int y =random.nextInt(cols);
            if (!rooms[x][y].isMine()){
                rooms[x][y].setMine(true);
                minesPlaced++;
            }
        }
    }
}
