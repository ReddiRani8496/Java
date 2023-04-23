public class PasscodeLock {
    public static void main(String[] args) {
        Lock lock = new Lock();
        for(int i=1000;i<10000;i++) {
            if(lock.checkPasscode(i))
                System.out.println("passcode :"+i);
        }
    }
}
class Lock{
    int passcode = (int)Math.floor(Math.random()*9000.0+1000.0);
    boolean checkPasscode(int code){
        if(passcode==code)
            return true;
        return false;
    }
}

