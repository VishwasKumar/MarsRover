package MarsRover.Commands;


import MarsRover.Rover;
import MarsRover.interfaces.Command;

public class ForwardCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.move();
    }
}
