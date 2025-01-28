import java.util.Arrays;
public class plus_one_leetcode {
    public static void main(String[] args) {
        int [] digits ={9,8,7,6,5,4,3,2,1,0};
        System.out.println(plusOne(digits));
        System.out.println(count(plusOne(digits)));
        new_array(count(plusOne(digits)),plusOne(digits));
    }
    public static int plusOne(int digits[]){
        int number =0;
        for (int i = 0; i < digits.length; i++) {
            number = 10*number + digits[i];
        }
        number++;

        return number;
    }
    public static int count(int number){
        int digit_count = 0;
        int n = number;
        while(n>0){
            int l = n%10;
            n/=10;
            digit_count++;
        }
        return digit_count;
    }
    public static void new_array(int n, int digits){
        int [] array = new int[n];
        int index=n-1;
        while (digits>0){
           int l = digits%10;
           array[index--]=l;
           digits/=10;
        }
        System.out.println(Arrays.toString(array));
    }



}
