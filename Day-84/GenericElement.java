public class GenericElement {
    public static void main(String[] args) {

       Price<Integer> banana = new Price<>(40);

       Price<Double> grape = new Price<>(165.79);
       
       Price<Float> apple = new Price<>(220.20f);

       System.out.println(banana.getPrice());

       System.out.println(grape.getPrice());

       System.out.println(apple.getPrice());

    }
}
class Price<E> {

    E price;

    Price(E price) {

        this.price = price;
    }

    E getPrice() {
        
        return this.price;
    }
}
