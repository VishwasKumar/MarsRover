package MarsRover;


import MarsRover.Direction.East;
import MarsRover.Direction.North;
import MarsRover.Direction.South;
import MarsRover.Direction.West;
import MarsRover.interfaces.Direction;
import MarsRover.interfaces.Landscape;

public class Rover {
    private Landscape landscape;


    public Direction direction;
    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Rover(Landscape landscape) {
        this.landscape = landscape;
        this.direction = new North(landscape);
    }

    public void turnLeft(){
        this.direction = direction.turnLeft();
    }

    public void move(){
        direction.move();
    }

    public void turnRight(){
        this.direction = direction.turnRight();
    }

    public void setCoordinates(int x, int y, String direction){
        landscape.setCoordinateY(y);
        landscape.setCoordinateX(x);

        if (direction.equals("North"))
            setDirection(new North(landscape));
        if (direction.equals("South"))
            setDirection(new South(landscape));
        if (direction.equals("East"))
            setDirection(new East(landscape));
        else if (direction.equals("West"))
            setDirection(new West(landscape));
    }

    public void printCoordinates(){
        System.out.println(landscape.getCoordinateX() + " " + landscape.getCoordinateY() + " " + direction.toString());
    }
}
