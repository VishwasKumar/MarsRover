package MarsRover.interfaces;


public interface Landscape {
    void setCoordinateY(int coordinateY);

    void setCoordinateX(int coordinateX);

    int getCoordinateX();
    int getCoordinateY();
    void moveYForward();
    void moveXForward();

    void moveXBackwards();
    void moveYBackwards();
}
