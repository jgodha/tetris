/**
 * Created by jgodha on 2/18/17.
 */
public class Tetris {

    public boolean[][] board;

    public void start() {
        board = new boolean[10][24];
    }

    public boolean[][] getBoard() {
        return board;
    }
}
