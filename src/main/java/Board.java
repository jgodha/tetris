public class Board {
    private final boolean[][] blocks;

    public Board() {
        blocks = new boolean[10][24];
    }

    public boolean[][] getBoard() {
        return blocks;
    }

    public void addShape(Shape activeShape) {
        for(Coordinate coordinate : activeShape.getCoordinates()) {
            blocks[coordinate.getX()][coordinate.getY()] = true;
        }
    }
}
