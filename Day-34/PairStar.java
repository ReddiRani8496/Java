//program to compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
class PairStar{
    public static void main(String[] args){
        String str="hell0";
        System.out.println(pairStar(str));
    }

static String pairStar(String str) {
  if(str.length()<2)
  return str;
  if(str.charAt(0)==str.charAt(1))
  return str.charAt(0)+"*"+pairStar(str.substring(1));
  return str.charAt(0)+pairStar(str.substring(1));
}
}