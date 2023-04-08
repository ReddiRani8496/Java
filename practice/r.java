import java.util.Scanner;
class r{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int count=0;
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<arr.length;j++){
                int s=sc.nextInt();
                int y=sc.nextInt();
                if(y-s>5)
                count++;
            }
            System.out.println(count);
        }
    }
}