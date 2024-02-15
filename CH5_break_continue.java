public class CH5_break_continue {
    public static void main(String[] args) {
        //Break and continue using loops
        // in for loop
        for(int a = 0; (a<5); a++){
            if(a==3){ // continue statement immediately moves on to the next iteration , by skipping  everything below continue
                System.out.println("Ending the loop");
                continue;

            }
            System.out.println(a);
            System.out.println("Java");

        }

        // in while loop
//        int c = 0;
//        while(c<5){
//
//            c++;
//            if(c==3){
//                System.out.println("Loop ends here");
//                continue;
//            }
//        System.out.println(c);
//       }

        // in do while loop
//        int f = 0;
//        do{
//            System.out.println(f);
//            f++;
//            if(f==4){
//                System.out.println("Loop ends here");
//                continue;
//
//            }
//        }while(f<5);

    }
}
