public class CH7_variable_arguments {

//    static int sum(int x , int y) { // Instead of writing such methods
//        return x + y;               // again and again
//                                     // for adding the  no.int's
//    }
//        static int sum(int x , int y, int z){
//
//        return x + y + z;
//    }
//    static int sum(int x , int y, int z , int a){
//
//        return x + y + z + a;
//    }

    static int sum(int s , int ...arr) { //we can use this solution by creating a for each loop it is known as
        // Available as int [] arr;       //variable arguments
         int num = s;                 // If we want to keep at least 1 int so we can put it in the method
        for ( int a : arr) {               // just like (int s)
            num = num + a;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(sum(4));     // calling
        System.out.println(sum(3,5,8)); // the
        System.out.println(sum(3,5,8,5)); //  above method
    }
}
