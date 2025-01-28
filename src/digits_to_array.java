public class digits_to_array {
    public static void array_maker(int n, int digit){
        while (digit>0){
            digit/=Math.pow(10,(n-1));
            n--;
            System.out.println(digit);
        }
    }

    public static void main(String[] args) {
        array_maker(3,543);
    }

}
