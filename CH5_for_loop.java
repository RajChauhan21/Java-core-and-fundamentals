public class CH5_for_loop {
    public static void main(String[] args) {
        // Incrementing for loop
        for(int i = 0; (i< 10); i++){
            System.out.println(i);
            if(i==5){
                System.out.println("Loop ends here");
                break;
            }
        }

        // Decrementing for loop
//        for(int a = 15;(a>0);a--){
//            System.out.println(a);
//    }

        // Quick quiz - WAP to print natural numbers in reverse till 20
//        for(int f = 20; (f>0); f--){
//            System.out.println(f);
//        }

    }
}