class DeprecatedEx {
    public static void main(String[] args) {

        Duck duck = new Duck();

        duck.oldmethod();
    }
}

class Duck {

    @Deprecated

    public void oldmethod() {

        System.out.println("This is a deprecated method");
        
    }

}