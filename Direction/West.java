package MarsRover.Direction;


import MarsRover.Direction.North;
import MarsRover.Direction.South;
import MarsRover.interfaces.Direction;
import MarsRover.interfaces.Landscape;

public class West implements Direction {
    private Landscape landscape;

    public West(Landscape landscape) {
        this.landscape = landscape;
    }
    @Override
    public void move(){
            landscape.moveXBackwards();
    }

    @Override
    public Direction turnLeft() {
        return new South(landscape);
    }

    @Override
    public Direction turnRight() {
        return new North(landscape);
    }

    public String toString(){
        return "West";
    }
}
