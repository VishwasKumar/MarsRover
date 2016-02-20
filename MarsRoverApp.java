package MarsRover;

import MarsRover.Commands.ForwardCommand;
import MarsRover.Commands.TurnLeftCommand;
import MarsRover.Commands.TurnRightCommand;

public class MarsRoverApp {
    public static void main(String[] args) {
        executeCommands(1,2,"North","LMLMLMLMM");
        executeCommands(3,3,"East","MMRMMRMRRM");

    }

    public static void executeCommands(int x, int y, String direction, String commandString){
        Plateau plateau = new Plateau(5);
        Rover rover = new Rover(plateau);
        rover.setCoordinates(x, y, direction);

        for (int i = 0; i < commandString.length(); i++) {
            if (commandString.charAt(i) == 'L') {
                TurnLeftCommand turnLeftCommand = new TurnLeftCommand();
                turnLeftCommand.execute(rover);
            }
            else if (commandString.charAt(i) == 'R') {
                TurnRightCommand turnRightCommand = new TurnRightCommand();
                turnRightCommand.execute(rover);
            }
            else if (commandString.charAt(i) == 'M') {
                ForwardCommand forwardCommand = new ForwardCommand();
                forwardCommand.execute(rover);
            }
        }
        rover.printCoordinates();
    }
}
