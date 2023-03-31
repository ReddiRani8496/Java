//program to compute recursively the total number of blocks in such a triangle with the given number of rows
class TriangleRowsCount{
    public static void main(String[] args){
        int rows=3;
        int result=triangle(rows);
        System.out.println(result);
    }
    static int triangle(int rows){
        if(rows==0)
        return rows;
        return rows+triangle(rows-1);
    }
}