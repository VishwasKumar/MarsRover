package MarsRover.Commands;


import MarsRover.Rover;
import MarsRover.interfaces.Command;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TurnLeftCommand implements Command {


    @Override
    public void execute(Rover rover) {
        rover.turnLeft();
    }
}
