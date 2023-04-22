public class EncodedText {
    static char alp[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static void main(String[] args) {
        String cipher="olssv dvysk";
        decode(cipher);
    }   
    static void decode(String str){
        for(int i=1;i<=25;i++){
            for(int j=0;j<str.length();j++){
                if(!(str.charAt(j)==' ')){
                    int ind=str.charAt(j)-97-i;
                    int cur=ind%26;
                    if(cur<0)
                        cur+=26;
                    System.out.print( alp[cur]);
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
