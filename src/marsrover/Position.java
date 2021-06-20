package marsrover;

import marsrover.enums.DirectionEnum;

public class Position {

    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position forwardOnePoint(DirectionEnum direction) {

        if (direction.equals(DirectionEnum.EAST)) {
            return new Position(x + 1, y);
        }
        if (direction.equals(DirectionEnum.WEST)) {
            return new Position(x - 1, y);
        }
        if (direction.equals(DirectionEnum.NORTH)) {
            return new Position(x, y + 1);
        }
        if (direction.equals(DirectionEnum.SOUTH)) {
            return new Position(x, y - 1);
        }
        return null;

    }

    public boolean isInPlateauBorder(Plateau p) {

        return !((x < 0 || x > p.xDir)
                || (y < 0 || y > p.yDir));
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
