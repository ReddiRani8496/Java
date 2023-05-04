class ClassNotFoundExceptions{
    public static void main(String[] args){

        System.out.println("hi");


        try {
            
            Class.forName("Hello");

            System.out.println("class found");
        }
        catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

        try {
            
            Class.forName("HelloWorld");
        }
        catch(ClassNotFoundException e) {

            e.printStackTrace(); // class not found then throws class not found exception
        }

    }
}