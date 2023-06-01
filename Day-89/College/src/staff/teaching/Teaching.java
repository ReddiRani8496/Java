package staff.teaching;

import staff.Staff;

public class Teaching extends Staff {
    

    STAFFSUBJECT staffsubject;
    int experience;
    
    String postName;

    public STAFFSUBJECT getStaffsubject() {
        return staffsubject;
    }

    public void setStaffsubject(STAFFSUBJECT staffsubject) {
        this.staffsubject = staffsubject;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Teaching{" +
                "staffsubject=" + staffsubject +
                ", experience=" + experience +
                ", postName='" + postName + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", contantNum=" + contantNum +
                '}';
    }
}
