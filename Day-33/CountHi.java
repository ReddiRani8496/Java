//program to compute recursively the number of 'hi' in the given string
class CountHi{
    public static void main(String[] args){
        String str="xxhixxhi";
        System.out.println(countHi(str));
    }
    static int countHi(String str) {
    if(str.length()<2)
  return 0;
  if(str.substring(0,2).equals("hi"))
  return 1+countHi(str.substring(1));
  return countHi(str.substring(1));
    }
}