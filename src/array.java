import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array []= new int[5];
        array[2]=77;
        System.out.println(Arrays.toString(array));
       // String fruits []= {"apple","mango","guava"};
        String farray[] = new String[5];
        System.out.println(Arrays.toString(farray));
        if(farray[1]==null){
            System.out.println("say hi");
        }
    }
}
