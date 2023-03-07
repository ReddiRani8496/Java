
class Butterfly_Pattern{
    public static void main(String[] args){
        int n=5;
      for(int i=n,l=(n*2)-(n/2);i>=1;i--,l-=2){
            for(int k=n;k>=i;k--) 
             System.out.print(k);
            for(int k=1;k<=l-1;k++)
            System.out.print(" ");
            for(int k=i;k<=n;k++){
                if(k==1){
                    continue;
                }
                else {
            System.out.print(k);
                }
            }
             System.out.println();
        }
        
        int row=5;
        for(int i=1,l=1;i<n;i++,l+=2){
            for(int k=n;k>i;k--)
            System.out.print(k);
            for(int j=1;j<=l;j++)
            System.out.print(" ");
            if(i==1){
                for(int p=2;p<=n;p++)
                System.out.print(p);
                System.out.println();
            }
            else{
                for(int r=i+1;r<=n;r++)
                System.out.print(r);
                System.out.println();

            }
        }
    }
}