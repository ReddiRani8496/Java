import java.util.Scanner;

class Arrays {
    public static void main(String[] args) {
        int[][] arr =takeInput();
      //  System.out.println(printBoundaryElements(arr)+firstDiagonal(arr)+secondDiagonal(arr));
       spiral(arr);
    }

    private static void spiral(int[][] arr) {
        int rows=arr.length;
        int cols=arr[0].length;
        int left = 0, top = 0, bottom=rows-1,right=cols-1;
        while (left<=right && top<=bottom) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i]+" ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right]+" ");
            }
            right--;

            if(left <= right) {
                for (int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i]+" ");
                bottom--;
            }

            if(top<=bottom) {
                for (int i = bottom; i >= top ; i--) {
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }


        }
    }

    private static void printWave(int[][] arr) {
        int rows=arr.length;
        int cols=arr[0].length;
        for (int i = 0; i < cols; i++) {
            if(i%2==0) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(arr[j][i]+" ");
                }
            } else {
                for (int j = rows-1; j >= 0 ; j--) {
                    System.out.print(arr[j][i]+" ");
                }
            }
        }
    }

    private static int secondDiagonal(int[][] arr) {
        int sum =0;
        int rows = arr.length;
        int cols = arr[0].length;
        int i=1,j=cols-2;
        while (i<rows-1 && j>0) {
            if(i==j) {
                i++;
                j--;
                continue;
            }
           sum+=arr[i][j];
            i++;
            j--;
        }
        return sum;
    }

    private static int firstDiagonal(int[][] arr) {
        int sum=0;
        int rows = arr.length;
        int cols = arr[0].length;
        int i=1,j=1;
        while (i<rows-1 && j<cols-1) {
            sum += arr[i][j];
            i++;
            j++;
        }
        return sum;
    }

    private static int printBoundaryElements(int[][] arr) {
        int sum = 0;
        int rows = arr.length;
        int cols = arr[0].length;
        int i=0,j=0;
        for (j=0;j<cols;j++) {
            sum+=arr[i][j];
        }
        j=cols-1;
        for(i=1;i<rows;i++)
            sum+=arr[i][j];
        i=rows-1;
        for(j=cols-2;j>=0;j--)
            sum+=arr[i][j];

        j=0;
        for(i=rows-2;i>0;i--)
            sum+=arr[i][j];

        return sum;
    }


    private static int[][] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }

}