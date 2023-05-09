// A unique id that is assigned to an Object is known as hashcode object.

public class HashCodeMethod {
    
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

    public HashCodeMethod(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
   
    public static void main(String[] args) {
        
        HashCodeMethod hash = new HashCodeMethod(1, "java");

        System.out.println(hash.hashCode()); 

    }
    @Override
    public int hashCode(){
        return id;
    }
}

   
