import com.sun.source.doctree.EscapeTree;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class CH5_loop_practice_set {
    public static void main(String[] args) {
//        Scanner eve = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int x = eve.nextInt();
//
//       for(int a = 1;a<=x;a++){
//           if(a%2==0){
//               System.out.println(a);
//           }
//       }


//       int a =1;
//       for(int i =1;i<=6;i++){
//           a=a*i;
//           System.out.println(a);
//       }

//        for(int a = 10;a>0;a--){
//            System.out.println(10 + "*" + a + "=" + 10*a);
//
//        }
//        Scanner tab = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int a = tab.nextInt();
//        int f;
//        for (f = 1; f<= 10; f++) {
//        System.out.println(a + "*" + f + "=" + a * f);
//        }

//        Scanner cr = new Scanner(System.in);
//        System.out.println("Enter a number ");
//        int num = cr.nextInt();
//        for(int a = 1 ; a <= 5 ; a++){
//             num=num*a;
//            System.out.println(num);
//
//            }
//        }

//        Scanner sr = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int ab = sr.nextInt();
//        int a = 1;
//        while(a<=5){
//            System.out.println(ab=ab*a);
//            a++;
//        }

//        int a = 1;
//        for(int i = 1;i<5;i++){
//            System.out.println(a=a+i);
//        }

        // multiplication tables using loops
         /*int a = 2;
         int i;
         for(i = 1;i<=10;i++){
             System.out.println(a*i);
         }*/

         /*int c = 3;
         int j = 1;
         while(j<=10){
             System.out.println(c*j);
             j++;
         }*/
        /*int l = 5;
        int k = 1;
        do{
            System.out.println(l*k);
            k++;
        }while (k<=10);*/

        // - print number from 1 to 10
//        for (int i = 0; i<=10;i++){
//            System.out.println(i);
//        }

        // wap to print number from 1 to 10
//        for(int a = 1;a<=10;a++){
//            System.out.println(a);
//        }

        //wap to calculate sum of first 10 natural numbers
//        int z = 0;
//        int i;
//        for(i=1;i<=10;i++){
//            z=z+i;
//        }
//        System.out.println(z);

        //wap to print the multiplication table of the number entered by the user
//        Scanner tab = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int a = tab.nextInt();
//        for(int i=1;i<=10;i++){
//            System.out.println(a*i);
//        }

        // find the factorial of the number entered by user
//        Scanner fac = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int a = fac.nextInt();
//        int f=1;
//        int i;
//        for(i=1;i<=a;i++){
//            f=f*i;
//        }
//        System.out.println(f);

        // Object_Oriented_programming.power and Object_Oriented_programming.base problem
//        Scanner num  = new Scanner(System.in);
//        System.out.println("Enter Object_Oriented_programming.base number");
//        int Object_Oriented_programming.base = num.nextInt();
//        System.out.println("Enter Object_Oriented_programming.power of the Object_Oriented_programming.base");
//        int Object_Oriented_programming.power = num.nextInt();
//        int f = 1;
//        int i;
//        for (i=1;i<=Object_Oriented_programming.power;i++){
//            f=f*Object_Oriented_programming.base;
//        }
//        System.out.println(f);

        //Reverse a digit entered by user
//        Scanner num = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int numb = num.nextInt();
//        int ld;
//        int reverse = 0;
//        int i;
//        while(numb>0){
//            ld=numb%10; //153%10=3
//            reverse=reverse*10+ld; //3
//            numb=numb/10;//153/10=15
//        }
//        System.out.println(reverse);

        //wap that reads set of integers and print the sum of even and odd integers
//        Scanner cr = new Scanner(System.in);
//        System.out.print("Enter   number : ");
//        int num = cr.nextInt();
//        int i;
//        int even = 0;
//        int odd = 0;
//        for(i=1;i<=10;i++){
//            if(i%num==0){
//               even=even+i;
//            }
//            else {
//                odd=odd+i;
//            }
//        }
//        System.out.println(even);
//        System.out.println(odd);

        // wap to check if the number is prime entered by user
//        Scanner pr = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num = pr.nextInt();
//        int i;
//        int count = 0;
//        int f;
//        for (i = 1; i <= num; i++) {
//
//            if (num%i == 0) {
//                count++;
//            }
//            }
//        if (count == 2) {
//
//         System.out.println("It is a prime number");}
//        else {
//
//        System.out.println("Not a prime number");}

        //calculate highest common factor of the entered number
//        Scanner hcf = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int a = hcf.nextInt();
//        System.out.println("Enter second number");
//        int b = hcf.nextInt();
//        int g = 0;
//        for(int i=1;i<=a;i++){
//            if(a%i==0 && b%i==0){
//                g=i;
//            }
//        }
//        System.out.println(g);

        // print the sum of two numbers entered by user and the loop should continue
        // till the user wants else it should terminate
//        Scanner sum = new Scanner(System.in);
//        char ch;
//        do {
//            System.out.println("Enter first number ");
//            int a = sum.nextInt();
//            System.out.println("Enter Second number");
//            int b = sum.nextInt();
//            int c = (a+b)/2;
//            System.out.println(c);
//            System.out.println("Do you want to perform operation again press y or n accordingly");
//            Scanner ch1 = new Scanner(System.in);
//             ch = ch1.next().charAt(0);
//        }while (ch=='y');

        //wap to that counts the number of positive's , negative's and zero's entered by user
//        Scanner num = new Scanner(System.in);
//        System.out.println("Enter 10 numbers");
//        int i;
//        int pos = 0;
//        int neg = 0;
//        int zero = 0;
//
//        for(i=1;i<=10;i++){
//            int a = num.nextInt();
//            if(a>0){
//                pos++;
//            }
//            else if(a<0){
//                neg++;
//            }
//            else{
//                zero++;
//            }
//        }
//        System.out.println(pos + " Positive numbers");
//        System.out.println(neg + " Negative numbers");
//        System.out.println(zero + " Zeros");

        //wap to check  the armstrong number entered by the user
//        Scanner num = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int a = num.nextInt();
//        int g=a;
//        int f=0;
//        int armst = 0;
//        while(a>0){
//           f=a%10;
//           armst = (f*f*f)+armst;
//           a=a/10;
//        }
//        if(armst==g){
//            System.out.println("It is an armstrong number");
//        }
//        else{
//            System.out.println("Not an armstrong number");
//        }

        // wap to print fibonacci series
//        int f = 0;
//        int g = 1;
//        int h = 0;
//        int i;
//        for(i = 1;i<=10;i++){
//            System.out.println(f);
//            h=f+g;
//            f=g;
//            g=h;
//        }

        //wap that generates random number and user should guess the random number
//        Scanner cr = new Scanner(System.in);
//        Random rn = new Random();
//        int a,b;
//        do {
//            System.out.println("Enter a number");
//             a = rn.nextInt(1,5);
//             b = cr.nextInt();
//            if(a<b){
//                System.out.println("Too high , Try again " + a);
//            }
//            else if(a>b){
//                System.out.println("Too low , Try again " + a);
//            }
//            else if(a==b){
//                System.out.println("Your guess is correct " + a);
//                break;
//            }
//
//        }while(a!=b);

        /* print **********
                 **********
                 **********
                 **********
         */
//        int r,c;
//        for(c=1;c<=4;c++){
//
//            for(r=1;r<=10;r++){
//                System.out.print("*");
//            }
//
//            System.out.print("\n");
//        }

        /* print *
                 **
                 ***
                 ****
                 *****
               c=column r=space x=row
         */
        int c,r,x;
        for(c=1;c<=3;c++){

            for(r=3;r>c;r--){
                System.out.print(" ");
            }
            for(x=1;x<=c;x++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // print * Pyramid
        int f,g,h;
        for(f=1;f<=7;f++){

            for(g=7;g>f;g--){
                System.out.print(" ");
            }
            for(h=1;h<=f;h++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        //print number pyramid
//        int f,g,h;
//        for(f=1;f<=50;f++){
//
//            for(g=50;g>f;g--){
//                System.out.print(" ");
//            }
//            for(h=1;h<=f;h++){
//                System.out.print(f + " ");
//            }
//            System.out.print("\n");
//        }







    }
}





























