package computerlab;

public class ComputerLab {
    private int computers;
    private int fans;
    private int chairs;
    private String incharge;
    LabSubjects labSubjects;

    public int getComputers() {
        return computers;
    }

    public void setComputers(int computers) {
        this.computers = computers;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }

    public String incharge() {
        return incharge;
    }

    public void setincharge(String incharge) {
        this.incharge = incharge;
    }

    public LabSubjects getLabSubjects() {
        return labSubjects;
    }

    public void setLabSubjects(LabSubjects labSubjects) {
        this.labSubjects = labSubjects;
    }

    @Override
    public String toString() {
        return "ComputerLab{" +
                "computers=" + computers +
                ", fans=" + fans +
                ", chairs=" + chairs +
                ", incharge='" + incharge + '\'' +
                ", labSubjects=" + labSubjects +
                '}';
    }
}
