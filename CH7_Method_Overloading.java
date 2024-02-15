public class CH7_Method_Overloading {

    static void num(int z) {
        z = 31;

    }
    static void num1(int[]mks) {
        mks[0] = 31;
    }
    static void src (){ // Two or more methods can have same reference but different parameters,are called method overloading
        System.out.println("Good morning");
    }
    static void src(int z, int f) { // elements in the () are known as parameters ,  Here the int z is parameter and value
        // of the z is argument.Argument are actual values
        System.out.println("Good morning" + z + f);

    } static void src(int z, int f,int x) { // method overloading cannot be performed by changing the return type of the
        // method . parameters should be different in method overloading
        // of the z is argument.Argument are actual values
        System.out.println("Good morning" + z + f);


    }

        public static void main (String[]args){
//        quote();

            //  case 1:Changing the integer
//        int x = 21; // Integer will not change
//        num(x);
//        System.out.println(x);

//      case 2:Changing the array
//        int[] marks = {21, 54, 73, 85, 92}; // Array will be changed because reference will be passed to method
//        num1(marks);
//        System.out.println(marks[0]);
            src(45,21); // in the methods here z and f are parameters and 45 and 21 are arguments

        }
    }

