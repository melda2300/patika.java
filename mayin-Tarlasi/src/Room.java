public class Room {
    private boolean isMine;
    private boolean isOpened;
    private  int adjacentMines;

    public Room(){
        isMine=false;
        isOpened=false;
        adjacentMines=0;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setMine( boolean mine ) {
        isMine = mine;
    }

    public int getAdjacentMines() {
        return adjacentMines;
    }

    public void setAdjacentMines( int adjacentMines ) {
        this.adjacentMines = adjacentMines;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened( boolean opened ) {
        isOpened = opened;
    }
}

