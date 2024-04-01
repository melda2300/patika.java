public class mineSweeper {
    private Board board;
    private UserInterface Id;
    private boolean gameover;

    public mineSweeper( int rows, int cols ) {
        board = new board(rows, cols);
        Id = new UserInterface();
        gameover = false;
    }

    public void startGame() {
        while (!gameover) {
            Id.displayBoard(board);
            int[] coords = Id.getCoordinates(board);
            if (coords != null) {
                gameover = board.selectRoom(coords[0], coords[1]);
                if (board.checwin()) {
                    Id.displayMessage("Tebrikler! Kazandın!");
                    gameover = true;
                }else{
                    Id.displayMessage("malesef kaybettiniz");
                }
            }
        }
    }


}
