public enum Size {
    SMALL,MEDIUM,LARGE, EXTRALARGE
}
class Shirt{
    public static void main(String[] args) {

        System.out.println(Size.LARGE);

        System.out.println(Size.MEDIUM);

        for(Size x : Size.values())
            System.out.println(x);
    }
}
