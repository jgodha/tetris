public class Shape {
    private Coordinate bottomCoordinate;

    public Shape() {
        bottomCoordinate = new Coordinate(3,4);
    }

    public void advance() {
        bottomCoordinate.setX(bottomCoordinate.getX() + 1);
    }

    public Coordinate[] getCoordinates() {
        Coordinate[] currentBlocks = new Coordinate[4];

        int bottomXCoord = bottomCoordinate.getX();
        currentBlocks[0] = new Coordinate(bottomXCoord - 3, 4);
        currentBlocks[1] = new Coordinate(bottomXCoord - 2, 4);
        currentBlocks[2] = new Coordinate(bottomXCoord - 1, 4);
        currentBlocks[3] = new Coordinate(bottomXCoord, 4);
        return currentBlocks;
    }

    public Coordinate getBottomCoordinate() {
        return bottomCoordinate;
    }
}

