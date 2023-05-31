import java.util.HashMap;

public class PlayersReady {

    static HashMap<Integer, Boolean> hashMap = new HashMap<>();
    public static void main(String[] args) {

        for(int i = 0; i < 100; i++) {

            hashMap.put(i, true);
        }

        hashMap.put(8, false);

        hashMap.put(34, negation(hashMap.get(34)));

        hashMap.put(8, negation(hashMap.get(8)));

        hashMap.put(76, negation(hashMap.get(76)));

        System.out.println("Players ready: " + getPlayersReady());
    }
    
    static boolean negation(boolean prevState) {

        return !prevState;
    }

    static int getPlayersReady() {

        int count = 0;

        for(var x : hashMap.values()) {

            if(x)

                count++;

        }

        return count;
    }
}
