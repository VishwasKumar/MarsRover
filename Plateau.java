package MarsRover;


import MarsRover.interfaces.Landscape;

public class Plateau implements Landscape {
    private int coordinateX;
    private int coordinateY;
    private int gridSize;

    @Override
    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    @Override
    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public Plateau(int gridSize) {
        this.coordinateX = 0;
        this.coordinateY = 0;
        this.gridSize = gridSize;
    }


    @Override
    public int getCoordinateX() {
        return coordinateX;
    }

    @Override
    public int getCoordinateY() {
        return coordinateY;
    }

    @Override
    public void moveYForward() {
        if (coordinateY < gridSize)
            coordinateY++;
    }

    @Override
    public void moveXForward() {
        if (coordinateX < gridSize)
            coordinateX++;
    }

    @Override
    public void moveXBackwards() {
        if (coordinateX > 0)
            coordinateX--;
    }

    @Override
    public void moveYBackwards() {
        if (coordinateY > 0)
            coordinateY--;
    }
}
