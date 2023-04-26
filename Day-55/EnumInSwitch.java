enum Currency {
    RUPEE,
    DOLLAR,
    POUND,
    PENNY
}
public class EnumInSwitch {
    public static void main(String[] args) {

        Currency currency = Currency.POUND;

        switch(currency) {

            case RUPEE:
                System.out.println("RUPEE");
                break;
                
            case DOLLAR:
                System.out.println("DOLLAR");
                break;

            case POUND:
                System.out.println("POUND");
                break;

            case PENNY:
                System.out.println("PENNY"); 
                break;
                
            default:
                System.out.println("NOT VALID");
                break;
        }  
    }
  
}
