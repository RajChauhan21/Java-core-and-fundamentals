public class CH7_Recursion_exercises {


    public static void main(String[] args) {
//        System.out.println(fac(5)); //Que 1
//        System.out.println(fib(10)); //Que 2
//        till_0(10); //Que 3
//        String rev = "JAR"; //Que 4
//       revstr(rev,rev.length()-1);
//        int[] revnum = {1,2,3,5}; //Que 5
//        reversenum(revnum,revnum.length-1);
//        System.out.println(calcpower(9,9));  //Que 6
//        System.out.println(gcd(16,24)); //Que 7
//        System.out.println(sum(10)); //Que 8
//        String[] word = {"Zero" , "One" , "Two" , "Three" , "Four" , "Five" , "Six" , "Seven" ,
//                         "Eight" , "Nine"};
//        countw(word,932); //Que 9
//        int [] arr = {2,4,5,8,12,15};
//        boolean result = issorted(arr,0);
//        System.out.println(result); //Que 10
//        int [] arr1 = {2,4,5,8,12,15}; //Que 11
//        boolean result = elempres(arr1,0,4);
//        System.out.println(result); //Que 12
//        int[] arrbs = {1,5,7,12,19,21,25};
//        boolean ans = elembs(arrbs,0,6,25);
//        System.out.println(ans);
//        String [] spalin = {"a","c","b","b","c","a"}; //Que 13
//        boolean ans = ispalindrome(spalin,0,5);
//        System.out.println(ans);
//        towerofhanoi(1,"Object_Oriented_programming.S","H","D"); //Que 14
//        String crx = "abaaabbba"; //Que 15
//        fandloccu(crx,0,'b');









    }
        // Steps to solve a problem using recursion
// 1. Find a Base case (the best trick to find best case is to look for false conditions)
// 2. Finding how to call a method and what to do  with return value

        // Que 1 - wap to calculate factorial of number using recursion
//        static int fac(int x){
//        if(x==1){
//            return 1;
//        }
//        return x * fac(x-1);
//        }

        // Que 2 - wap to print fibonacci series using recursion
        static int fib(int x){
        if(x==1 || x==2){
            return x-1;
        }
        return fib(x-1) + fib(x-2);
        }

        // Que 3 - wap that prints no. till 0 eg - if input 3 , o/p - 3 2 1 0
//        static void till_0(int q){
//        if(q==0){
//            System.out.println(0);
//            return;
//        }
//            System.out.println(q);
//              till_0(q-1);
//
//        }

        // Que 4 - wap to reverse a string using recursion
         static void revstr(String rev, int ind){
         if(ind==0){
             System.out.println(rev.charAt(ind));
             return;
         }
             System.out.println(rev.charAt(ind));
             revstr(rev,ind-1);
         }

        // Que 5 - wap to reverse a number using recursion
//        static void reversenum(int []revnum ,int idx ){
//        if(idx==0){
//            System.out.print(revnum[0]);
//            return;
//        }
//            System.out.print(revnum[idx]);
//        reversenum(revnum,idx-1);

//        }

        // Que 6 - calculate power and base using recursive function
        static int calcpower(int b,int p){
        if(p==0){
            return 1;
        }
         return b * calcpower(b,p-1);
        }

        // Que 7 - find gcd/hcf of given two numbers using recursion
//        static int gcd(int x,int y){
//        if(x==0){   // 24%16 = (8,16) again func will call ,  now x=8 , y=16
//                    // 16%8 = (0,8) , according to Object_Oriented_programming.base condition x==0 , hence ans will be 8.
//            return y;
//        }
//        return gcd(y%x,x);
//        }


        // Que 8 - calculate the sum of n natural numbers
//       static int sum(int num){
//        if(num==0){
//            return 0;
//        }
//        else{
//          return num + sum(num-1);
//        }
//       }

//       static long steps(long f){
//        if(f<0){
//            return 0;
//        }
//        if(f==0){
//            return 1;
//        }
//         long ans =  steps(f-1) + steps(f-2);
//        return ans;
//}

        // Que 9 - print the int into words using recursion for eg- (123 - one two three)
//        static void countw(String[] word,int nm){
//         if(nm==0){
//             return;
//         }
//         int ld = nm%10;
//         nm = nm/10;
//         countw(word,nm);
//            System.out.println(word[ld]);
//        }



        // Que 10 - Check whether the array is sorted using recursive function
//       static boolean issorted(int[] arr , int idx){
//        if(idx== arr.length-1){
//            return true;
//        }
//        if(arr[idx]<arr[idx+1]){
//            return issorted(arr,idx+1);
//        }
//        else{
//            return false;
//        }
//       }

        //Que 11 - Check whether the element is present in the array or not (linear search)
//       static boolean elempres(int [] arr1,int x,int search){
//        if(x==arr1.length-1){
//            return false;
//        }
//        if(arr1[x]!=search){
//            return elempres(arr1,x+1,search);
//        }
//        else{
//            return true;
//        }
//
//       }

        // Que 12  check whether the element is present in the array or not (binary search)
//       static boolean elembs(int []arrbs , int s,int e,int find){
//        if(s>e){
//            return false;
//        }
//        int mid = (s+e)/2;
//        if(arrbs[mid] ==find){
//            return true;
//        }
//        if(arrbs[mid]<find){
//            return elembs(arrbs,mid+1,e,find);
//        }
//        else{
//            return elembs(arrbs,s,mid-1,find);
//        }
//       }

        //  que 13 - check the string is palindrome or not
//        static boolean ispalindrome(String []spalin,int s,int e){
//        if(s>e){
//            return true;
//        }
//        if(spalin[s]==spalin[e]){
//            return ispalindrome(spalin,s+1,e-1);
//        }
//        else{
//            return false;
//        }
//        }

        // Que 14 - Tower of hanoi
//        static void towerofhanoi(int n,String src,String helper,String dest){
//        if(n==1){
//            System.out.println("Transfer " + n + " From " + src + " to " + dest  +  1 );
//            return;
//        }
//        towerofhanoi(n-1,src,dest,helper);
//            System.out.println("Transfer " + n + " from " + src  + " to " + dest  +  2);
//            towerofhanoi(n-1,helper,src,dest);
//        }


        // Que 15 - Find first and last occurrence of the element in the given string
        static int first = -1;
        static int last = -1;
        static void fandloccu(String crx,int idx,char element){
            if(idx==crx.length()-1){
                System.out.println( "First occurence is at "+ first);
                System.out.println( "Last occurence is at  "+ last);
                return;
            }
            char currenchar = crx.charAt(idx);
            if(currenchar==element){
                if(first==-1){
                    first = idx;
                }
                else {
                    last = idx;
                }

            }
            fandloccu(crx,idx+1,element);
        }


}




































