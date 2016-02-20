package MarsRover.Direction;


import MarsRover.interfaces.Direction;
import MarsRover.interfaces.Landscape;

public class North implements Direction {
    private Landscape landscape;

    public North(Landscape landscape) {
        this.landscape = landscape;
    }

    @Override
    public void move(){
        landscape.moveYForward();
    }

    @Override
    public Direction turnLeft() {
        return new West(landscape);
    }

    @Override
    public Direction turnRight() {
        return new East(landscape);
    }

    public String toString(){
        return "North";
    }
}
