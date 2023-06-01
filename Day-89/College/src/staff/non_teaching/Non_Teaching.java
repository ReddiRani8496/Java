package staff.non_teaching;

import staff.Staff;

public class Non_Teaching extends Staff {

    POSTNAME postname;

    public POSTNAME getPostname() {
        return postname;
    }

    public void setPostname(POSTNAME postname) {
        this.postname = postname;
    }

    @Override
    public String toString() {
        return "Non_Teaching{" +
                "postname=" + postname +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", contantNum=" + contantNum +
                '}';
    }
}
