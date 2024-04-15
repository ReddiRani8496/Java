package ClassPractice;
public class RemoveX {
    public static void main(String[] args) {
        String str = "xabcxd";
        String res = "";
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)!='x') {
                res += str.charAt(i);
            }
        }
        System.out.println(res);

        System.out.println(removeX(str));
    }
    public static String removeX(String str) {
        if(str.isEmpty()) {
            return "";
        }

        if(str.charAt(0)=='x') {
          return  removeX(str.substring(1));
        } 
        return str.charAt(0) + removeX(str.substring(1));
    }
}
