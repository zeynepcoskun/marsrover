package marsrover;

import java.util.ArrayList;
import java.util.List;

public class Plateau {

    public List<MyRover> myRoverList = new ArrayList<>();
    public int xDir;
    public int yDir;

    public Plateau(int x, int y) {
        this.xDir = x;
        this.yDir = y;
    }

    public void placeRoverOnPlateau(MyRover myRobot) {
        myRoverList.add(myRobot);
    }

    public List<MyRover> getMyRoverList() {
        return myRoverList;
    }

    public void setMyRoverList(List<MyRover> myRoverList) {
        this.myRoverList = myRoverList;
    }

    public int getxDir() {
        return xDir;
    }

    public void setxDir(int xDir) {
        this.xDir = xDir;
    }

    public int getyDir() {
        return yDir;
    }

    public void setyDir(int yDir) {
        this.yDir = yDir;
    }

}
