class Dog {
    public static void main(String[] args) {

        bark(); 
    }
    public static void bark(){

        bark(); // calls the method infinite times, since the terminating condition not mentioned
    }
}