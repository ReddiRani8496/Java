/* PENDING
public class PasscodeLock {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8,9};
        String passcode="0000";
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                for(int k=0;k<arr.length;k++){
                    for(int l=0;l<arr.length;l++){
                        if(arr[i]==passcode.charAt(0)&&arr[j]==passcode.charAt(1)&&arr[k]==passcode.charAt(2)&&arr[l]==passcode.charAt(3)){
                         System.out.println(true);
                         return;
                        }
                         count++;
                    }
                    System.out.print(arr[k ]+" ");
                }
                System.out.println(arr[j]+" ");
                
            }
            System.out.println(arr[i]+" ");


        }
        System.out.println(count);
    }
}
*/
