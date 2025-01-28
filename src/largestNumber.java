public class largestNumber {
    public static int getLargest(int numbers[]){
        int smallest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]> smallest){
                smallest =numbers[i];
            }
        }
        return smallest;
    }
    public static int getSmallest(int numbers[]){
        int largest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]< largest){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
       int [] numbers = {1,2,-3,44,5,6};
        System.out.println(getLargest(numbers));
        System.out.println(getSmallest(numbers));
    }
}
