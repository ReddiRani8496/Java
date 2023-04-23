//program to convert the plain text to cipher text and cipher text to decipher text
public class CipherKey {
    static char alp[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
     public static void main(String[] args) {
            String plain="hi";
            int key=2;
            String res="";
            System.out.println("plain text:"+plain);
            for(int j=0;j<plain.length();j++){
                if(!(plain.charAt(j)==' ')){
                    int ind=plain.charAt(j)-97+key;
                    int cur=ind%26;
                    if(cur<0)
                        cur+=26;
                    res+=alp[cur];
                }
                else{
                    res+=" ";
                }
            }
            System.out.println("cipher text:"+res);
            System.out.print("decipher text:");
            decode(res, key);
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
        

