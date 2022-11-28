package come.sparta;

public class Main {
    public static void main(String[] args) {
        int [] array = {10,5,3,1,24,12};
        int len = array.length;
        new bubbleSort(array,len);
        for(int i = 0; i<len; ++i){
            System.out.print(array[i] + " ");
        }
    }
}