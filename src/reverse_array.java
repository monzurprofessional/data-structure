import java.util.*;
public class reverse_array {
    public static void reverse(int [] array){
        int start=0, end=array.length-1;
        while (start<end){
            int temp;
            temp = array[start];
            array[start++]=array[end];
            array[end--]=temp;
        }
    }

    public static void main(String[] args) {
        int [] array ={1,2,3,4,5,6,78};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
}
