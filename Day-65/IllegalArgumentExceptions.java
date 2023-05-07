class IllegalArgumentExceptions{
    int age;
    public void setAge(int age) throws IllegalArgumentException{
        if(age < 0) {

            throw new IllegalArgumentException("Age must be greater than zero");

        } else {

            this.age = age;

            System.out.println(this.age);
        }
    }
    public static void main(String[] args) {

        IllegalArgumentExceptions person = new IllegalArgumentExceptions();

       // person.setAge(-1);  throws IllegalArgumentException

      //  person.setAge(20); print 20

        try {

            person.setAge(-20);

        } catch(IllegalArgumentException e){
            
            System.out.println(e);
        }

    }
}