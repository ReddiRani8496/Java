public class FindSubstring {
    public static void main(String[] args) {
        String str = "hi how are you";

        String sub = "you";

        System.out.println(find(str, sub));
    }
    static boolean find(String text,String sub) {
          if(text.length()<sub.length())

            return false;

          if(text.substring(0,sub.length()).equals(sub)) 

            return true; 
                  
          return find(text.substring(1), sub);
    }
}
