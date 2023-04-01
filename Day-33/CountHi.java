//program to compute recursively the number of 'hi' in the given string
class CountHi{
    public static void main(String[] args){
        String str="xxhixxhi";
        System.out.println(countHi(str));
    }
    static int countHi(String str) {
  int len=str.length();
  if(len==0||len==1)
  return 0;
  if(len==2){
    if(str.charAt(len-1)=='i'){
      if(str.charAt(len-2)=='h')
      return 1+countHi(str.substring(0,len-1));
      return 0+countHi(str.substring(0,len-1));
    }
  }
  if(len>2){
  if(str.charAt(len-1)=='i'){
  if(str.charAt(len-2)=='h')
  return 1+countHi(str.substring(0,len-1));
   return countHi(str.substring(0,len-1));
  }
  }
  return countHi(str.substring(0,len-1));
  
}

}