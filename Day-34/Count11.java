// program to compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.
class Count11{
    public static void main(String[] args){
        String str="11dsds111";
        System.out.println(count11(str));
    }
static int count11(String str) {
  if(str.length()<2)
  return 0;
  if(str.substring(0,2).equals("11"))
  return 1+count11(str.substring(2));
  return count11(str.substring(1));
}
}