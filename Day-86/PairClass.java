import javafx.util.Pair;

import java.util.*;

public class PairClass {
    
    public static void main(String args[]) {
        
      int temperature[] = {37, 33, 30, 36, 35, 39, 26};
      
      String states[] = {"Hyderabad", "Ahmedabad", "Jaipur", "Calcutta", "Lucknow", "Nagpur", "AndhraPradesh"};
      
      ArrayList<Pair<String,Integer>> list = new ArrayList<>();
      
      for(int i=0; i<temperature.length; i++) {
          
          Pair<String, Integer> p = new Pair<>(states[i], temperature[i]);
          
          list.add(p);
      }
      
      System.out.println(list);
      
    }
}
