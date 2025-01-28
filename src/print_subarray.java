public class print_subarray {
    public static void subarray(int [] array){
        int total=0;
        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j <array.length; j++) {
                int end = j;
                for (int k = start; k <=end ; k++) {
                    System.out.print(array[k]+" ");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray : "+ total);
    }

    public static void main(String[] args) {
        int array [] ={2,4,6,8,10};
        subarray(array);
    }
}
