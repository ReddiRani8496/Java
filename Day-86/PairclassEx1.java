import javafx.util.Pair;

import java.util.*;

public class PairClassEx1 {
    
    public static void main(String args[]) {
        
        Pair<String, Double> p = new Pair<>("India",142.8);

        System.out.println(p.getKey());

        System.out.println(p.getValue());

        System.out.println(p);

        p = new Pair<>("China",142.56);
        
        System.out.println(p);
      
    }
}