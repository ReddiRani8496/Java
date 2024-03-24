public class ReverseString2 {
    String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int i = 0, n = arr.length;

        while(i < n) {
            int j = Math.min(i+k-1, n-1);
            reverse(arr,i,j);
            i += (2 * k);
        }
        return new String(arr);
    }

    void reverse(char[] arr,int start,int end){
        while(start <= end) {
            char ch = arr[start];
            arr[start] = arr[end];
            arr[end] = ch;
            start++;
            end--;
        }
    }
}
