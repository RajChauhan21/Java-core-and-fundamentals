public class CH7_Recursion {
         //factorial(n) = n * n-1 * ....1
        //factorial(n) = n * factorial(n-1)
        //factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
        //factorial(0) is always = 1
        static int factorial_iterate(int g) { // calculating factorial using loop(iteration)
             int s = 1;
            for(int i = 1;i<=g;i++){
                s = s * i;
            }
         return s;
        }
        static int factorial(int z){
            if(z==1 || z==0){
                return 1;
            }
           return z * factorial(z-1);
        }






    public static void main(String[] args) {

//        System.out.println(factorial(5));
//        System.out.println(factorial_iterate(5));
    }
}
