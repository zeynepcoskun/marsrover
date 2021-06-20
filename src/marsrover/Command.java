package marsrover;

import marsrover.exception.MarsRoverException;
import marsrover.enums.RotationEnum;
import java.util.ArrayList;
import java.util.List;

public class Command {

    private final Character cLeft = 'L';
    private final Character cRight = 'R';
    private final Character cMove = 'M';
    private String commands;

    public Command(String commands) {
        this.commands = commands;
    }

    public List<RotationEnum> findRotations() {

        List<RotationEnum> result = new ArrayList<>();

        for (char c : commands.toCharArray()) {

            if (c == cLeft) {
                result.add(RotationEnum.LEFT);
            } else if (c == cRight) {
                result.add(RotationEnum.RIGHT);
            } else if (c == cMove) {
                result.add(RotationEnum.MOVE);
            } else {
                throw new MarsRoverException(c + " Not a valid rotation.");
            }
        }

        return result;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

}
