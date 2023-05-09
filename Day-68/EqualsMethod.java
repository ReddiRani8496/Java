public class EqualsMethod {
    private int id;
    private String name;
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public EqualsMethod(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }   
    public static void main(String[] args) {
        EqualsMethod eql = new EqualsMethod(1, "java");
        EqualsMethod eql2 = new EqualsMethod(2, "java");
        EqualsMethod eql3 = new EqualsMethod(1, "java");
        System.out.println(eql.equals(eql2)); // if equals method is not overriden, it compares the object reference
        System.out.println(eql.equals(eql3));
        System.out.println(eql.equals(eql));
    }
}
