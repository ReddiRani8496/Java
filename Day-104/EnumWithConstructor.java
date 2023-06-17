enum Colors {

    // enum constants calling the enum constructors
    PINK("The  is pink"),
    GREEN("The is green"),
    RED("The is red"),
    BLUE("The is blue");

    private final String dressColor;

    // private enum constructor
    private Colors(String dressColor) {
        this.dressColor = dressColor;
    }

    public  String getDressColor() {
        return dressColor;
    }
}

public class EnumWithConstructor {

    public static void main(String[] args) {

        Colors colors = Colors.PINK;

        System.out.println(colors.getDressColor());

    }
}

