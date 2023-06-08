
public class Main implements Cow,Buffalo{

    public static void main(String[] args) {

        Main main = new Main();

        main.milk();
    }
    @Override
    public void milk() {

        Cow.super.milk();
        
    }
}