public class test {

        public static void subarray(int [] array){
            int total=0;
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");
                for (int j = i+1; j <array.length; j++) {

                        System.out.print(array[j]+" ");
                  //  }
                    total++;
                   // System.out.println();
                }

                System.out.println();
            }

        }

        public static void main(String[] args) {
            int array [] ={2,4,6,8,10};
            subarray(array);
        }
    }


