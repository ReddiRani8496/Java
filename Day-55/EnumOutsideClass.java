enum Colors {

    RED, //constants should be declared in capital letters

    BLUE,

    PINK,
    
    GREEN
}
class EnumOutsideClass{
    public static void main(String[] args) {

        Colors color = Colors.RED;

        System.out.println(color);
    }
}