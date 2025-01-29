public class Kadanes_algorith_MaxSum {
    public static void kadanes(int[]array){
        int curr_Sum = 0;
        int max_Sum = Integer.MIN_VALUE;
        for (int i:array) {
            curr_Sum+=array[i];
            if(curr_Sum<0) {
                curr_Sum = 0;
            }
            max_Sum= Math.max(curr_Sum,max_Sum);

        }
        System.out.println(max_Sum);
    }

    public static void main(String[] args) {
        int [] array = {-2,-3,4,-1,-2,1,5,3};
        kadanes(array);
    }
}
