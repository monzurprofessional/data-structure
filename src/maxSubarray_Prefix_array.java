public class maxSubarray_Prefix_array {
    public static void maxSubarray(int[] array){
        int maxSum = Integer.MIN_VALUE;
        int currSum =0;
        int [] prefix = new int[array.length];
        prefix[0]=array[0];
        for(int i = 1; i < array.length; i++) {
            prefix[i]=prefix[i-1]+array[i];
        }
        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j <array.length ; j++) {
                int end = j;
                currSum = start==0? prefix[end] : prefix[end]-prefix[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int [] array ={2,-4,-6,8,10};
        maxSubarray(array);
    }
}
