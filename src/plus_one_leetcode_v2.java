import java.util.Arrays;

public class plus_one_leetcode_v2 {
    public static int[] plusOne(int[] digits) {
            int len = digits.length;
        for (int i = len-1; i >=0 ; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int [] array = new int[len+1];
        array[0]=1;
        return array;

    }

    public static void main(String[] args) {
        int [] array = {9,9,9,9,9};
        int []arr= plusOne(array);
        System.out.println(Arrays.toString(arr));
    }

}
