/* program to print the following pattern
1 
2 10
3 11 18
4 12 19 25 
5 13 20 26 31
6 14 21 27 32 36
7 15 22 28 33 37 40
8 16 23 29 34 38 41 43
9 17 24 30 35 39 42 44 45

*/

class Number_Pattern18{
    public static void main(String[] args){
        int n=9;
        for(int i=1;i<=n;i++){
            int start=1;
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start=start+n-1+i;
            }
            System.out.println();
        }
    }
}
