package marsrover.enums;

public enum RotationEnum {

    LEFT("Left", "L", true),
    RIGHT("Right", "R", true),
    MOVE("Move", "M", true);

    private final String direction;
    private final String directionLetter;
    private final boolean active;

    private RotationEnum(String direction, String directionLetter, boolean active) {
        this.direction = direction;
        this.directionLetter = directionLetter;
        this.active = active;
    }

    public static RotationEnum getLEFT() {
        return LEFT;
    }

    public static RotationEnum getRIGHT() {
        return RIGHT;
    }

    public static RotationEnum getMOVE() {
        return MOVE;
    }

    public String getDirection() {
        return direction;
    }

    public String getDirectionLetter() {
        return directionLetter;
    }

    public boolean isActive() {
        return active;
    }

}
