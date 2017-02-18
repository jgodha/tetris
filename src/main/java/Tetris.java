public class Tetris {

    public enum Shapes {STRAIGHT};
    public boolean[][] board;

    public void start(Shapes initialShape) {
        board = new boolean[10][24];

        board[0][4] = true;
        board[1][4] = true;
        board[2][4] = true;
        board[3][4] = true;
    }

    public boolean[][] getBoard() {
        return board;
    }

    public void tick() {

    }
}

