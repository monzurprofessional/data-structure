public class reverse_number {

    public static void main(String[] args) {
            int n = 10899;
            int rev =0;
        //System.out.println(1/10);

            while(n>0){
                int l = n%10;
                //System.out.println(l);
                rev= rev*10+l;
                n/=10;
            }
        System.out.println(rev);
    }
}
