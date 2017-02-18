public class Tetris {

    public boolean[][] board;

    public void start() {
        board = new boolean[10][24];
    }

    public boolean[][] getBoard() {
        return board;
    }

    public void tick() {
        board[0][4] = true;
        board[1][4] = true;
        board[2][4] = true;
        board[3][4] = true;
    }
}
