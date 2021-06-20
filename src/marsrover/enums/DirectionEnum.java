package marsrover.enums;

public enum DirectionEnum {

    NORTH("North", "N", true),
    EAST("East", "E", true),
    WEST("West", "W", true),
    SOUTH("South", "S", true);

    private final String direction;
    private final String directionLetter;
    private final boolean active;

    private DirectionEnum(String direction, String directionLetter, boolean active) {
        this.direction = direction;
        this.directionLetter = directionLetter;
        this.active = active;
    }

    public static DirectionEnum getNORTH() {
        return NORTH;
    }

    public static DirectionEnum getEAST() {
        return EAST;
    }

    public static DirectionEnum getWEST() {
        return WEST;
    }

    public static DirectionEnum getSOUTH() {
        return SOUTH;
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
