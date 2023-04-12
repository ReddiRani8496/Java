class Animal{
    void animal(){
        System.out.println("This is animal outer class");
    }
    class Dog{
        public static void main(String[] args) { //we cannot declare main method in inner class
            System.out.println("this is inner class");
        }
    }
}