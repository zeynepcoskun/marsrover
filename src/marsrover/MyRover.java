package marsrover;

import java.util.List;
import marsrover.exception.MarsRoverException;
import marsrover.enums.DirectionEnum;
import marsrover.enums.RotationEnum;

public class MyRover {

    private Plateau plateau;
    private Position position;
    private DirectionEnum directionEnum;

    public MyRover() {
    }

    public void placeRoverOnPlateau(Plateau plateau, Position position, DirectionEnum directionEnum) {
        if (!position.isInPlateauBorder(plateau)) {
            throw new MarsRoverException("Out of the plateau.");
        }
        this.plateau = plateau;
        this.position = position;
        this.directionEnum = directionEnum;

        plateau.placeRoverOnPlateau(this);
    }

    public void placeRoverOnPlateau(String points, Plateau plateau) {

        String[] parts = points.split(" ");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        DirectionEnum direction = findDirection(parts[2].toCharArray()[0]);
        placeRoverOnPlateau(plateau, new Position(x, y), direction);
    }

    public String resultRoverFinalPlace() {
        String str = "";
        str += position.toString() + " " + getDirectionChar(directionEnum);
        return str;
    }

    public void findRotation(List<RotationEnum> instructions) {

        for (RotationEnum i : instructions) {
            if (i.equals(RotationEnum.LEFT)) {
                turnLeft();
            }
            if (i.equals(RotationEnum.RIGHT)) {
                turnRight();
            }
            if (i.equals(RotationEnum.MOVE)) {
                moveForward();
            }
        }
    }

    private void turnLeft() {

        if (directionEnum.equals(DirectionEnum.EAST)) {
            directionEnum = DirectionEnum.NORTH;
            return;
        }
        if (directionEnum.equals(DirectionEnum.NORTH)) {
            directionEnum = DirectionEnum.WEST;
            return;
        }
        if (directionEnum.equals(DirectionEnum.SOUTH)) {
            directionEnum = DirectionEnum.EAST;
            return;
        }
        if (directionEnum.equals(DirectionEnum.WEST)) {
            directionEnum = DirectionEnum.SOUTH;
        }

    }

    private void turnRight() {

        if (directionEnum.equals(DirectionEnum.EAST)) {
            directionEnum = DirectionEnum.SOUTH;
            return;
        }
        if (directionEnum.equals(DirectionEnum.NORTH)) {
            directionEnum = DirectionEnum.EAST;
            return;
        }
        if (directionEnum.equals(DirectionEnum.SOUTH)) {
            directionEnum = DirectionEnum.WEST;
            return;
        }
        if (directionEnum.equals(DirectionEnum.WEST)) {
            directionEnum = DirectionEnum.NORTH;
            return;
        }

    }

    private void moveForward() {
        Position newPosition = position.forwardOnePoint(directionEnum);
        if (!newPosition.isInPlateauBorder(plateau)) {
            throw new MarsRoverException("Out of the plateau.");
        }
        position = newPosition;
    }

    private static DirectionEnum findDirection(char direction) {

        if (direction == 'N') {
            return DirectionEnum.NORTH;
        }
        if (direction == 'W') {
            return DirectionEnum.WEST;
        }
        if (direction == 'S') {
            return DirectionEnum.SOUTH;
        }
        if (direction == 'E') {
            return DirectionEnum.EAST;
        }
        return null;

    }

    private static char getDirectionChar(DirectionEnum direction) {

        if (direction.equals(DirectionEnum.getNORTH())) {
            return 'N';
        } else if (direction.equals(DirectionEnum.getWEST())) {
            return 'W';
        } else if (direction.equals(DirectionEnum.getEAST())) {
            return 'E';
        } else if (direction.equals(DirectionEnum.getSOUTH())) {
            return 'S';
        } else {
            throw new MarsRoverException(direction + " Not a valid value.");
        }

    }
}
