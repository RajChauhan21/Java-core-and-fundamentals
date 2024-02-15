import java.util.Scanner;

public class Basic_Fundamentals {
    public static void main(String[] args) {
        // CH1 VARIABLES AND DATATYPES
        // Que 1 - wap to sum three numbers in java
//        int a = 5;
//        int b = 2;
//        int c = 7;
//        System.out.println(a+b+c);

        //Que 2 - wap to calculate cgpa of marks of 3 subjects out of 100
//        int sub1 = 82;
//        int sub2 = 100;
//        int sub3 = 89;
//        float cgpa = (sub1+sub2+sub3)/30;
//        System.out.println(cgpa);

        //Que 3 - wap that asks user to enter his name and greets with (have a good day)
//        Scanner name = new Scanner(System.in);
//        System.out.println("Enter your name ");
//        String n = name.next();
//        System.out.println( "Hello " + n + " Have good day!" );

        //Que 4 - wap to convert kilometers to miles
//        int kilom = 3;
//        System.out.println(kilom/1.609);

        //Que 5 - wap to detect whether the number entered by user is integer or not
//        Scanner num = new Scanner(System.in);
//        System.out.println("Enter a number");
//        boolean number = num.hasNextInt();
//        System.out.println(number);

        //CH2 OPERATORS AND EXPRESSIONS
        //Que 1 - What will be the result of following expression
//        float a = 7/4 * 9/2;
//        System.out.println(a);

        //Que 2 - wap to increment a grade by 8 and decrement to show the original one
//        char grade = 'Object_Oriented_programming.A';
//        grade = (char) ( grade + 8);
//        System.out.println( "Grade after incrementing "+ grade);
//
//        grade = (char) (grade-8);
//        System.out.println( "Grade before incrementing "+ grade);

        //Que 3 - use comparison opreators to check whether the given number is greater
        // than the user entered number or not
//        Scanner num = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int a = num.nextInt();
//        boolean result = a<5;
//        System.out.println(result);

        //Que 4 - write a following expression in java program
        //v^2-u^2/2*a*s
//        int v = 2;
//        int u = 4;
//        int a = 8;
//        int s = 5;
//        System.out.println((v*v-u*u)/2*a*s);

        //Que 5 - Evaluate following expression
//        int x = 7;
//        int a = 7*49/7+35/7;
//        System.out.println(a);

        //CH3 STRINGS
        //Que 1 - wap to convert a string into lower case
//        String line = "RAJ";
//        System.out.println(line.toLowerCase());

        //Que 2 - wap to replace spaces with underscores
//        String lin = "Hello Raj sir how are you!";
//        System.out.println(lin.replace( " ","_"));

        //Que 3 - wap to fill in a letter template
//        String letter = "Dear <|name|> ,Thanks a lot ";
//        System.out.println(letter.replace("<|name|>" , "Raj"));

        //Que 4 - wap to detect double and triple spaces in a string
//        String space = "Hey you  What   happen ";
//        System.out.println(space.indexOf("  "));
//        System.out.println(space.indexOf("   "));

        //Que 5 - wap to format the following letter using escape sequence
//        String letter = "Dear Raj , you are hired as a Quantitative decision maker Thanks";
//        String letter_format = "Dear Raj,\n you are hired as a Quantitative decision maker,\n Thanks!";
//        System.out.println(letter_format);

        //CH4 CONDITIONALS
        //Que 1 - what will be the output of the program
//        int a = 10;
//        if(a==11){
//            System.out.println("I am 11");
//        }
//        else{
//            System.out.println("I am not 11");
//        }

        //Que 2 - wap to check if the Object_Oriented_programming.student is pass or fail it requires total 40% and atleast
        // 33% percent in each subject to pass , Assume 3 subjects and take marks as an input
//        Scanner marksum = new Scanner(System.in);
//        System.out.println("Enter subject 1 marks");
//        int sub1 = marksum.nextInt();

//        System.out.println("Enter subject 2 marks");
//        int sub2 = marksum.nextInt();

//        System.out.println("Enter subject 3 marks");
//        int sub3 = marksum.nextInt();

//        float sum = (sub1+sub2+sub3)/3;
//        System.out.println(sum);

//        if(sum>=40.0 || sum == 33.0 ){
//            System.out.println("You are pass !");
//        }
//        else{
//            System.out.println("Tu fail ho gaya bhai !");
//        }

        //Que 3 - calculate the income tax paid by an Object_Oriented_programming.employee to the goverment as per the given
        // slabs
        // 2.5l to 5.0l - 5%
        // 5.0l to 10.0l - 20%
        // Above 10.0l - 30%
//         Scanner cr = new Scanner(System.in);
//        System.out.println("Enter your salary");
//        int sal = cr.nextInt();
//        if(sal>=25000 && sal<=50000 ){
//            float tax = (sal*0.5f);
//            System.out.println("Your salary is " + sal  + " and your tax is " + tax );
//        }
//        else if (sal>=50000 && sal<=100000) {
//            float tax1 = (sal*0.20f);
//            System.out.println("Your salary is " + sal +  " and your tax is " + tax1 );
//        }
//        else if (sal>=100000) {
//            float tax2 = (sal*0.30f);
//            System.out.println("Your salary is " + sal +  " and your tax is " + tax2 );
//        }

        //Que 4 - wap to find out the days of week given the number (1 for monday , 2 for tuesday..)
//        Scanner sr = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int num = sr.nextInt();
//        switch (num){
//            case 1:
//                System.out.println("Hello! monday");
//                break;
//            case 2:
//                System.out.println("tough! Tuesday");
//                break;
//            case 3:
//                System.out.println("Wiser! Wednesday");
//                break;
//            case 4:
//                System.out.println("Wonderful! Thursday");
//                break;
//            case 5:
//                System.out.println("FUnky! Friday");
//                break;
//            case 6:
//                System.out.println("Silent! Saturday");
//                break;
//            case 7:
//                System.out.println("Rest on Sunday!");
//                break;
//        }
        //Que 5 - wap to find whether the year entered by the user is leap year or not
//        Scanner crx = new Scanner(System.in);
//        System.out.println("Enter a year");
//        int year = crx.nextInt();
//        if(year%4==0){
//            System.out.println("It is a leap year");
//        }
//        else{
//            System.out.println("It is not a leap year");
//        }

        //Que 6 - wap to find the type of website from the url
//        Scanner sr = new Scanner(System.in);
//        System.out.println("Enter the name of website");
//        String site = sr.next();
//        if(site.endsWith(".com")){
//            System.out.println("It is a commercial website");
//        }
//        else if(site.endsWith(".org")){
//            System.out.println("It is an Organizational website");
//        }
//        else if(site.endsWith(".in")){
//            System.out.println("It is an Indian website");
//        }
//        else{
//            System.out.println("Sorry unable to read or wrong input , f you!");
//        }

        //CH5 LOOPS
        //Que 1 - print following pattern (stars from decreasing order)
//        for(int i = 1;i<=4;i++){
//
//            for(int j = 4;j>=i;j--){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        //Que 2 - wap to sum first n even numbers using while loop
//        int f = 0;
//        int i = 1;
//        while( i<=10){
//            if(i%2==0) {
//                f = f + i;
//            }
//            i++;
//            System.out.println(f);
//        }

        //Que 3 - wap to print multiplication table of number n
//        for(int i = 1;i<=10;i++){
//            System.out.println(i*8);
//        }

        //Que 4 -  wap to print multiplication table of number n in reverse order
//        for(int i = 10;i>=1;i--){
//            System.out.println(i*2);
//        }

        //Que 5 - wap to find factorial using for loop
//        int f = 1;
//        for(int i=1;i<=6;i++){
//            f = f * i;
//        }
//        System.out.println(f);

        //Que 6 - repeat que 5 using while loop
//        int g = 1;
//        int i = 1;
//        while(i<=6){
//            g = g * i;
//            i++;
//        }
//        System.out.println(g);

        //Que 7 - repeat Que 1 using while loop
//        int i = 1;
//        int j = 4;
//        while(i<=4){
//
//            while (j>=i){
//                System.out.println("*");
//                j--;
//            }
//            System.out.println("\n");
//            i++;
//        }

        //Que 9 - wap to calculate sum of the numbers in the mul table of 8
//        int multiply = 0;
//        for(int i = 1;i<=10;i++){
//             multiply = i*8 + multiply;
//        }
//        System.out.println(multiply);

        // Que 10 - repeat que 2 using for loop
//        int sum = 0;
//        for(int i = 1;i<=10;i++){
//            if(i%2==0){
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);

        //CH6 ARRAYS
        //Que 1 - Create an array of 5 floats and calculate thier sum
//        float[] sum = {20.0f,34.0f,45.0f,59.0f,95.0f,75.0f};
//        float add = 0;
//        for(float element : sum){
//            add = add + element;
//        }
//        System.out.println(add);

        //Que 2 - wap to find whether the int is present in the array or not
//        int[] arr ;
//        arr = new int[6];
//        arr[0] = 90;
//        arr[1] = 70;
//        arr[2] = 74;
//        arr[3] = 21;
//        arr[4] = 12;
//        arr[5] = 43;
//
//        int search = 40;
//        int f = 0;
//        for(int find:arr){
//            if(search==find){
//                f++;
//            }
//        }
//        if(f==1){
//            System.out.println("Element is present");
//        }
//        else{
//            System.out.println("Element is not present ");
//        }

        //Que 3 - calculate average marks from an array containing marks of all students
        // using for each loop
//        int f  = 0;
//        int [] sum = {78,68,92,81,95};
//        for(int marks:sum){
//            f = f + marks;
//        }
//        System.out.println(f/5.0+"%");

        //Que 4 - wap to add 2 matrices of size 2X3
//        int[][] mat1 = {{5,7,1},
//                        {3,9,2}};
//        int[][] mat2 = {{3,4,6},
//                        {1,9,6}};
//        int[][] ans = {{0,0,0},
//                       {0,0,0}};
//        for(int i=0;i< mat1.length;i++){
//            for(int j=0;j< mat1[i].length;j++){
//                ans [i][j]  = mat1[i][j] +  mat2[i][j];
//                System.out.print(ans[i][j] + " ");
//            }
//            System.out.println();
//        }

        // Que 5 - write a java program to reverse an array
//        int [] reverse = {7,1,2,4,3,8,1,2,3,9};
//        for(int i = reverse.length-1;i>=0;i--){
//            System.out.print(reverse[i] + " ");
//        }

        //Que 6 - wap to find maximum element in an array
//        int[] max = {5,2,1,21,42,97};
//        int maximus = Integer.MIN_VALUE;
//        for(int i =0;i<max.length;i++){
//            if(maximus<max[i]){
//                      maximus=max[i];
//            }
//
//        } System.out.println( "Maximum element is "+ maximus );

        //Que 7 - wap to find minimum element in an array
//       int[] mini = {2,6,4,9,5,-21};
//       int minimus = Integer.MAX_VALUE;
//       for(int i = 0;i<mini.length;i++){
//           if(minimus>mini[i]){
//               minimus=mini[i];
//           }
//       }
//        System.out.println("Minimum element is " + minimus);

        //Que 8 - wap to check whether the array is sorted or not
Scanner cr = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size = cr.nextInt();

        int[] arr = new int[size];
        for(int i = 0;i< size;i++){
            arr[i] = cr.nextInt();
        }
        boolean sorted = true;
        for(int i=0;i< size-1;i++){
            if(arr[i]>arr[i+1]){
                sorted = false;
            }
        }
        if(sorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }

//        multiply(2); //Que 1
//        star(10); //Que 2
//        System.out.println(sum(10)); //Que 3
//        starp2(50); //Que 4
//        System.out.println( "Your nth term of fibonacci is "+ fib(10)); //Que 5
//        System.out.println(avg(12,10,32,121,43)); //Que 6
//        starp2(10); //Que 7
//        starrec(5); //Que 8
//        System.out.println(conversion(21) + "Object_Oriented_programming.F"); //Que 9
//        System.out.println(sumit(20));



    }
    //CH7 METHODS IN JAVA
    //Que 1 - write a java method to print multiplication table
//    static void multiply(int x){
//        for(int i = 1;i<=10;i++ ){
//            System.out.println(i*x);
//        }
//    }

    //Que 2 - Write a function to print the following star pattern (from 1 to 4 increasing order)
//    static void star(int str){
//        for(int i = 1;i<=str;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("RAJ" + " ");
//            }
//            System.out.println();
//        }

    //Que 3 - write a recursive function to calc sum of n numbers
//    static int sum(int c){
//        if(c==0){
//            return 0;
//        }
//        return c + sum(c-1);
//    }

    //Que 4  - write a function to print star pattern (from 4 to 1 decreasing order)
//    static void starp2(int xs){
//        for(int i = xs;i>=1;i--){
//            for(int j =i;j>=1;j--){
//                System.out.print("$");
//            }
//            System.out.println("");
//        }

    //Que 5 - write a function to print nth term of fibonacci series
//    static int fib(int f){
//        if(f==1 || f==2){
//            return f-1;
//        }
//        return fib(f-1) + fib(f-2);
//    }

    //Que 6 - write a function to find average of set of numbers passed as arguments
//    static int avg(int...arr){
//        int f = 0;
//        for(int average:arr){
//            f = (average + f);
//        }
//        return f/arr.length;
//    }

    //Que 7 - repeat Que 4 using recursion

//    static void starp2(int xs) {
//        if(xs>=0){
//            for(int i=xs;i>=1;i--){
//                System.out.print("*");
//            }
//            System.out.println("");
//            starp2(xs-1);
//        }

    //Que 8 - repeat Que 2 using recursion
//    static void starrec(int lm){
//        if(lm>0){
//            starrec(lm-1);
//            for(int i = 1;i<=lm;i++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //Que 9 - write a function to convert temperature into fahrenhiet
//    static int conversion(int temp){
//        int fahrenhiet = (temp*9/5) + 32;
//        return fahrenhiet;
//    }

    //Que 10 - Repeat Que 3 using iterative approach
    static int sumit(int sum){
        int a = 0;
        for(int i=1;i<=sum;i++){
            a = a + i;
        }
        return a;
    }




    }












