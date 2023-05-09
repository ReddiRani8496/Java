// toString() method is used to return a String representation of the object.

public class ToStringMethod {

    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ToStringMethod(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        ToStringMethod str = new ToStringMethod(1, "java");

       // System.out.println(str.toString()); // if we don't override toString() it will return className@hashcode

        System.out.println(str.toString()); // returns the id and name
    }
    @Override  // Annotation
    public String toString() {

        return id+" "+name;
    }
    

}
