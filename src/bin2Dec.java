public class bin2Dec {
    public static void main(String[] args) {
        int bin = 10001;
        int dec = 0;
        int pow = 0;
        while (bin > 0) {
            int n = bin % 10;
            dec += n * Math.pow(2, pow++);
            bin /= 10;
        }
        System.out.println(dec);
    }
}