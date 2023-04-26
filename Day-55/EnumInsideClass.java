public class EnumInsideClass {
    enum Cards {
        DIAMOND,

        CLUB,

        SPADE,
        
        HEART
    }
    public static void main(String[] args) {

        Cards card = Cards.SPADE;

        System.out.println(card);
    }
    
}
