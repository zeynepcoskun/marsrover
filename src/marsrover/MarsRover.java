package marsrover;

import marsrover.enums.RotationEnum;
import static java.lang.System.in;
import java.util.List;
import java.util.Scanner;
import marsrover.constants.ConstantMessage;

public class MarsRover {

    public static void main(String[] args) {

        ConstantMessage constant = new ConstantMessage();
        System.out.println(constant.getProgramName());
        System.out.println(constant.getInfoForUser());
        StringBuilder result = new StringBuilder();

        Scanner scanner = new Scanner(in);
        System.out.print(constant.getUpperRight());
        String plateauPoints = scanner.nextLine();

        String[] parts = plateauPoints.split(" ");
        int dimX = Integer.parseInt(parts[0]);
        int dimY = Integer.parseInt(parts[1]);
        Plateau plateau = new Plateau(dimX, dimY);

        String whichRover = "";

        for (int i = 0; i < 2; i++) {

            if (i == 0) {
                whichRover = constant.getFirst();
            } else {
                whichRover = constant.getSecond();
            }

            System.out.print(constant.getPosition() + whichRover + constant.getRover());
            String roverPos = scanner.nextLine();

            try {
                MyRover robot = placeRoverOnPlateau(roverPos, plateau);

                System.out.print(constant.getInstruction() + whichRover + constant.getRover());
                String instructions = scanner.nextLine();

                Command command = new Command(instructions);
                List<RotationEnum> instructionsCollection = command.findRotations();
                robot.findRotation(instructionsCollection);

                result.append("\n");
                result.append(robot.resultRoverFinalPlace());

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
        System.out.println(result);

    }

    private static MyRover placeRoverOnPlateau(String points, Plateau plateau) {
        MyRover rover = new MyRover();
        rover.placeRoverOnPlateau(points, plateau);
        return rover;
    }

}
