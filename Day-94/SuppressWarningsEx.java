class SuppressWarningsEx {
    public static void main(String[] args) {

       @SuppressWarnings("unused") 
        Duck duck = new Duck(); // here duck variable never used warning raises, this can be prevented by using SuppressWarnings annotation

    }
}
class Duck {

    void run() {

        System.out.println("hi");

    }

}