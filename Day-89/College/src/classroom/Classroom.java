package classroom;

public class Classroom {
    private int projector;
    private int benches;
    private int blackBoards;
    private int chairs;
    private boolean isAC;
    private int doors;
    private int windows;

    public int getProjector() {
        return projector;
    }

    public void setProjector(int projector) {
        this.projector = projector;
    }

    public int getBenches() {
        return benches;
    }

    public void setBenches(int benches) {
        this.benches = benches;
    }

    public int getBlackBoards() {
        return blackBoards;
    }

    public void setBlackBoards(int blackBoards) {
        this.blackBoards = blackBoards;
    }

    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }

    public boolean isAC() {
        return isAC;
    }

    public void setAC(boolean AC) {
        isAC = AC;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "projector=" + projector +
                ", benches=" + benches +
                ", blackBoards=" + blackBoards +
                ", chairs=" + chairs +
                ", isAC=" + isAC +
                ", doors=" + doors +
                ", windows=" + windows +
                '}';
    }
}
