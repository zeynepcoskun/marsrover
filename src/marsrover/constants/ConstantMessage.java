package marsrover.constants;

public class ConstantMessage {

    private final String programName = "Mars Rover Program for only 2 Rovers";
    private final String infoForUser = "Please enter the values in order and press enter button";
    private final String upperRight = "Upper-right coordinates of the plateau(Example: 5 5): ";
    private final String position = "Position of the(Example: 1 2 N) ";
    private final String instruction = "Instructions of the(Example:LMLMLMLMM) ";
    private final String rover = " rover is: ";
    private final String first = "first";
    private final String second = "second";

    public ConstantMessage() {
    }

    public String getProgramName() {
        return programName;
    }

    public String getInfoForUser() {
        return infoForUser;
    }

    public String getUpperRight() {
        return upperRight;
    }

    public String getPosition() {
        return position;
    }

    public String getInstruction() {
        return instruction;
    }

    public String getRover() {
        return rover;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

}
