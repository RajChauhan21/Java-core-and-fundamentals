public class CH7_methods_practice_set {

    // Que 1 - write a java method to print multi. table of number n
//    static void multi(int x) {
//        int i;
//        for (i = 1; i <= 10; i++) {
//            System.out.println(i * x);
//        }
//    }
//   que 2 - print a star pattern *
//                                **
//                                ***
//    static void starp1(int f){
//        for(int i = 1;i<=f;i++){ // for column
//
//            for(int j =1;j<=i;j++){
//                System.out.print("*"); // for row
//            }
//            System.out.print("\n");
//        }
//    }

    // Que 3 - write a recursive function to calculate sum of n natural numbers
//    static int sum(int a){
//        int f;
//        if(a==0){
//            return 0;
//        }
//
//        return a + sum(a-1);
//    }

    // Que 4 - print star pattern ****
//                                ***
//                                 **
//                                 *
//    static void starp2(int v){
//        for(int i = 1;i<=v;i++){
//
//            for(int j = v;j>=i;j--){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//    }

    // Que 5 -  write a function to print nth term of fibonacci series using recursion
//    static int fib(int f){
//        if(f==1 || f==2){
//            return f-1;
//        }
//        else{
//            return fib(f-1) + fib(f-2);
//        }
//    }

    // Que 6 - write a function to find average of a set of numbers passed as arg
//    static int avg(int ...arr){
//         now here array is int [] arr
//        int f = 0;
//        for(int a:arr){
//            f=f+a;
//        }
//        return f/5;
//    }

    // Que 7 - Repeat que 4 using recursion
//    static void starp2_rec(int r) {
//        if (r >= 0) {
//
//            for (int i = r; i > 0; i--) {
//                System.out.print("*");
//
//            }
//            System.out.println(" ");
//            starp2_rec(r - 1);
//            }


    // Que 8 - Repeat que 2 using recursion
    static void starp1_rec(int s) {
        if (s > 0) {
            starp1_rec(s - 1);
            for (int i = 0; i < s; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


    // Que 9 - convert celsius into fahrenheit
//    static int ctof(int c){
//        int f;
//          f = c*9/5+32;
//          return f;
//    }

    // Que 10 - write an iterative approach to sum of n natural numbers
//    static void sumiterate(int...sum){
//        int f = 0;
//        for(int a:sum){
//            f=f+a;
//        }
//        System.out.println(f);
//    }


    public static void main(String[] args) {

//        multi(2); // que 1
//        starp1(10); // Que 2
//        System.out.println(sum(6)); // Que 3
//        starp2(5); // Que 4
//        System.out.println(fib(6)); // Que 5
//        System.out.println(avg(12,21,4,6,3)); // Que 6
//        starp2_rec(4);
          starp1_rec(5); // Que 8
//        System.out.println(ctof(23)); // Que 9
//        sumiterate(21,43,85,21,94); // Que 10

//        for(int i=1;i<=4;i++){ // for column
//
//            for(int j=4;j>=i;j--){  // for row
//                System.out.print(j +" ");
//            }
//            System.out.print("\n");
//        }

    }
}




