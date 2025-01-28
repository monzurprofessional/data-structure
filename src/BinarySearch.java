public class BinarySearch {
    public static int binarySearch(int array[], int target){
        int start=0, end=array.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(array[mid]==target){
                return mid;
            }
            if(array[mid]>target){
                end=mid-1;
            }
            else {
               start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,8,10};
        int target=4;
        System.out.println(binarySearch(array, target));
    }
}
