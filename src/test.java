public class test {

    public static int superPow(int a, int[] b) {
        if(a==1){
            return 1;
        }
        int pow = 0;
        for(int i =0; i<b.length; i++){
            pow=pow*10+b[i];
        }
        double sum = Math.pow(a,pow);
        System.out.println(sum);
        double mod = sum%1337;
        System.out.println(mod);
        return (int)mod;
    }

    public static void main(String[] args) {
        int a = 2147483647;
        int[] b = {200};
        System.out.println(superPow(a,b));
    }
    }


