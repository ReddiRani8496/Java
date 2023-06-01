package department;

public class Department {
    
    private DeptName deptName;
    private String deptCode;
    private String deptPlace;
    private String deptMail;
    private long contantNum;

    public long getContantNum() {
        return contantNum;
    }

    public void setContantNum(long contantNum) {
        this.contantNum = contantNum;
    }

    public DeptName getDeptName() {
        return deptName;
    }

    public void setDeptName(DeptName deptName) {
        this.deptName = deptName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptPlace() {
        return deptPlace;
    }

    public void setDeptPlace(String deptPlace) {
        this.deptPlace = deptPlace;
    }

    public String getDeptMail() {
        return deptMail;
    }

    public void setDeptMail(String deptMail) {
        this.deptMail = deptMail;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", deptPlace='" + deptPlace + '\'' +
                ", deptMail='" + deptMail + '\'' +
                ", contantNum=" + contantNum +
                '}';
    }
}
