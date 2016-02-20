package MarsRover.Direction;


import MarsRover.interfaces.Direction;
import MarsRover.interfaces.Landscape;

public class South implements Direction {
    private Landscape landscape;

    public South(Landscape landscape) {
        this.landscape = landscape;
    }

    @Override
    public void move() {
        landscape.moveYBackwards();
    }

    @Override
    public Direction turnLeft() {
        return new East(landscape);
    }

    @Override
    public Direction turnRight() {
        return new West(landscape);
    }

    public String toString(){
        return "South";
    }}
