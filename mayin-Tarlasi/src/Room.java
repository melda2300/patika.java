public class Room {
    private boolean isMine;
    private boolean isOpened;
    private boolean isFlagged;
    private int adjacentMines;

    public Room() {
        isMine = false;
        isOpened = false;
        isFlagged = false;
        adjacentMines = 0;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setMine(boolean isMine) {
        this.isMine = isMine;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void toggleOpened() {
        isOpened = !isOpened;
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public void toggleFlagged() {
        isFlagged = !isFlagged;
    }

    public int getAdjacentMines() {
        return adjacentMines;
    }

    public void setAdjacentMines(int adjacentMines) {
        this.adjacentMines = adjacentMines;
    }

    public void setOpened( boolean b ) {
    }
}


