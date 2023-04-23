//program to encrypt and decrypt the text

public class  Encryption{
    static char alp[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
     public static void main(String[] args) {
            String plain="hi";
            int key=2;
            String result= encode(plain, key);
            System.out.println(result);
            decode(result, key);
     }
     static String encode(String plai,int key){
        String s="";
            for(int j=0;j<plai.length();j++){
                if(!(plai.charAt(j)==' ')){
                    int ind=plai.charAt(j)-97+key;
                    int cur=ind%26;
                    if(cur<0)
                        cur+=26;
                    s+=alp[cur];
                }
                else{
                    s+=" ";
                }
              
            }
            return s;
        }
        static void decode(String str,int key){
            for(int j=0;j<str.length();j++){
                if(!(str.charAt(j)==' ')){
                    int ind=str.charAt(j)-97-key;
                    int cur=ind%26;
                    if(cur<0)
                        cur+=26;
                    System.out.print(alp[cur]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }
}
