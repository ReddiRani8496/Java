public class PasscodeLock {
   public static void main(String[] args) {
        Lockpad lock = new Lockpad();
        String passCode = crackPasscode(lock);
        System.out.println(passCode);
   } 
   static String crackPasscode(Lockpad newLock) {
        String actualPasscode=newLock.getPasscode();
        for(int i = 0 ; i < 10; i++) {
            for(int j = 0 ; j<10 ; j++) {
                for(int k = 0; k<10 ; k++) {
                    for(int l=0 ; l<10 ; l++){
                        String currpass = brutePasscode(i , j , k , l);
                        if(currpass.equals(actualPasscode))
                            return actualPasscode;
                    }
                }
            }
        }
        return "";
    }
    static String brutePasscode(int first,int second, int third, int fourth) {
        return String.valueOf(first) + String.valueOf(second) +
               String.valueOf(third) + String.valueOf(fourth);
    }
}
class Lockpad{
    int first = randomDigit();
    int second = randomDigit();
    int third = randomDigit();
    int fourth = randomDigit();
    private String passcode = generatePasscode();
    int randomDigit() {
        return (int) (Math.floor(Math.random() * 10.0));
    }
    public String getPasscode() {
        return passcode;
    }
    private String generatePasscode() {
        return String.valueOf(this.first) + String.valueOf(second) + String.valueOf(third) + String.valueOf(fourth);
    }
}
