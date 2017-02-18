public class Tetris {

    private Shape activeShape;

    public Board board;

    public void start() {
        board = new Board();

        activeShape = new Shape();
    }

    public boolean[][] getBoard() {
        board.addShape(activeShape);
        return board.getBoard();
    }

    public void tick() {
        activeShape.advance();
    }
}



