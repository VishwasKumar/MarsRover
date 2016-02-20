package MarsRover.Direction;


import MarsRover.interfaces.Direction;
import MarsRover.interfaces.Landscape;

public class East implements Direction {
    private Landscape landscape;

    public East(Landscape landscape) {
        this.landscape = landscape;
    }

    @Override
    public void move(){
        landscape.moveXForward();
    }

    @Override
    public Direction turnLeft() {
        return new North(landscape);
    }

    @Override
    public Direction turnRight() {
        return new South(landscape);
    }

    public String toString(){
        return "East";
    }
}
