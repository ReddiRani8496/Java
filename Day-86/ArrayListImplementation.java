import java.util.Arrays;

class ArrayListImplementation {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(6);
        System.out.println(list.isEmpty());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(60);
        list.add(40);
        System.out.println(list);
        list.add(70);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.contains(140));
        System.out.println(list.isEmpty());
        list.set(0,110);
        System.out.println(list);
        System.out.println(list.remove(0));
        System.out.println(list);
    }
}
class  myArrayList {
    int count;
    int arr[];
    int size;
    myArrayList(int size) {
        this.size = size;
        arr = new int[size];
    }
    myArrayList() {
        arr = new int[10];
    }

    void add(int value) {
        if(count==size) {
            int arr2[] = new int[size+(size/2)];
            for(int i=0; i<arr.length;i++)
                arr2[i] = arr[i];
            arr = arr2;
            size = arr2.length;
        }
        arr[count++] = value;
    }

    @Override
    public String toString() {
        return "myArrayList{" +
                "count=" + count +
                ", arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    int get(int index) {
        if(index>arr.length-1)
            throw new IndexOutOfBoundsException();
        return arr[index];
    }

    boolean contains(int value) {
        for(int i=0;i<size;i++) {
            if(arr[i]==value)
                return true;
        }
        return  false;
    }

    boolean isEmpty(){
        if(size==0)
            return true;
        return false;
    }
    
    void set(int index, int value) {
        if(index>arr.length-1)
         throw new IndexOutOfBoundsException();
        arr[index] = value;
    }

    int remove(int index) {
        int temp1 =arr[index];
        arr[index] = 0;
        for(int i=0;i<count;i++) {
            if(arr[i]==0) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        count -= 1;
        return temp1;
   }

}