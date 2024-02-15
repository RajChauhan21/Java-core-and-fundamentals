import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class CH4_practice_set {
    public static void main(String[] args) {
        //Que 1
//        int a = 10;
//            if (a==11) {
//                System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am not 11");
//        }

        // Que 2
//        Scanner sr = new Scanner(System.in);
//        System.out.println("Enter Physics marks");
//        int phy = sr.nextInt();
//
//        System.out.println("Enter chemistry marks");
//        int chem = sr.nextInt();
//
//        System.out.println("Enter maths Marks");
//        int mth = sr.nextInt();
//
//        int avg = (phy+chem+mth)/3;
//        if(avg>40 && phy>33 && chem>33 && mth>33){
//            System.out.println("Congratulations you are passed!");
//        }
//        else{
//            System.out.println("Congratulations you are fail!");
//        }

        //Que 3
        Scanner tax = new Scanner(System.in);
        System.out.println("Enter your salary");
        int a = tax.nextInt();
        if(25000<a && 50000>a){
            float sal = (a*0.10f);
            System.out.println( " Your salary is  " + a + " And your tax is " + sal);

        }
        else if (50000<a && 100000>a) {
             float sal1 = (a*0.20f);
            System.out.println("Your salary is " + a + " And your tax is " + sal1);
        }
        else if (a>100000) {
            float sal2 = (a*0.30f);
            System.out.println("Your salary is " + a + " And your tax is " + sal2);
        }

        }

        //Que 4
//        Scanner wr = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int week = wr.nextInt();
//        switch (week){
//            case 1:
//                System.out.println("It's monday");
//                break;
//
//            case 2:
//                System.out.println("It's Tuesday");
//                break;
//
//            case 3:
//                System.out.println("It's wednesday");
//                break;
//
//            case 4 :
//                System.out.println("It's Thursday");
//                break;
//
//            case 5:
//                System.out.println("It's Friday");
//                break;
//        }

        // Que 5
//        Scanner leap = new Scanner(System.in);
//        System.out.println("Enter a year");
//        int year = leap.nextInt();
//         boolean x = year % 4 == 0;
//         if(x){
//             System.out.println("It is a leap year");
//         }
//         else{
//             System.out.println("It is not a leap year");
//         }

        //Que 6
//        Scanner web = new Scanner(System.in);
//        System.out.println("Enter a website name ");
//        String site = web.next();
//        if(site.endsWith(".org")){
//            System.out.println("It is an organizational website");
//        }
//        else if(site.endsWith(".com"))  {
//            System.out.println("It is a commercial Website");
//        }
//
//        else if(site.endsWith(".in")){
//            System.out.println("It is an indian website");
//        }

        // que 7
//        Scanner bo = new Scanner(System.in);
//        System.out.println("Enter your service yrs");
//        int years = bo.nextInt();
//        System.out.println("Enter your salary");
//        int sal = bo.nextInt();
//        float bonus;
//
//        if(years>5){
//            bonus=0.10f*sal;
//            System.out.println("You will get bonus of "+ bonus);
//        }
//        else{
//            System.out.println("You are not Experienced enough to get this bonus ");
//        }

        //Que 8
//        Scanner gr = new Scanner(System.in);
//        System.out.println("Enter first number ");
//        int a = gr.nextInt();
//        System.out.println("Enter second number");
//        int b = gr.nextInt();
//         if(a>b){
//             System.out.println(a + " is greater");
//         }
//         else if(a<b){
//             System.out.println(b + " is greater");
//         }
//         else{
//             System.out.println("Both are equal");
//         }

        //Que 9
//         Scanner dis = new Scanner(System.in);
//        System.out.println("Enter your purchased Quantity");
//        int purc = dis.nextInt();
//        int total = purc*100;
//        float discount;
//        if(total>=1000){
//            discount =total*0.10f;
//            System.out.println( "Your discount is "+discount + " and your Total price will be " + (total-discount) );
//        }
//        else if (total<1000) {
//            System.out.println("Sorry no discount for you!");
//        }

        //Que 10
//        Scanner gr = new Scanner(System.in);
//        System.out.println("Enter your marks");
//        int marks = gr.nextInt();
//        if(marks<25){
//            System.out.println("Tu fail hai bhai");
//        }
//        else if(marks>25 && marks<45){
//            System.out.println("Tera Grade \"E\" hai "  );
//        }
//        else if(marks>45 && marks<50){
//            System.out.println("Tera Grade \"D\" hai");
//        }
//        else if (marks>50 && marks<60) {
//            System.out.println("Tera Grade \"C\" hai");
//        }
//        else if (marks>60 && marks<80) {
//            System.out.println("Tera Grade \"Object_Oriented_programming.B\" hai");
//        }
//        else if (marks>80) {
//            System.out.println("Congratulations for the \"Object_Oriented_programming.A\" grade");
//        }

        //Que 11
//        Scanner us = new Scanner(System.in);
//        System.out.println("\"Hello\" Raj Enter  your Age ");
//        int raj = us.nextInt();
//        System.out.println("\"Hi\" Ram enter your Age ");
//        int ram = us.nextInt();
//        System.out.println("\"Hello\" Bob Please Enter your Age ");
//        int bob = us.nextInt();
//
//         if(raj>ram && raj<bob){
//            System.out.println("Raj is older than Ram but youger than Bob ");
//        }
//        else if (ram>raj && ram<bob) {
//            System.out.println("Ram is older than Raj but younger than bob");
//        }
//        else if(bob>ram && bob<raj){
//            System.out.println("Bob is older than Ram but younger than Raj");
//        }
//        else if(bob>raj && bob<ram){
//            System.out.println("Bob is older than Raj but younger than Ram");
//        }

        //Que 12
//        Scanner dr = new Scanner(System.in);
//        System.out.println("Enter number of classes held");
//        int c_held = dr.nextInt();
//        System.out.println("Enter number of classes Attended");
//        int c_atten = dr.nextInt();
//        double atte = (c_atten/c_held*100);
//
//        if(atte<75.0){
//            System.out.println("You cannot sit in Exams , do you have any medical leave press \"y\" ");
//            char d = dr.next().charAt(0);
//            if(d=='y');{
//                System.out.println("You can sit in exams");
//            }
//        }
//        else{
//            System.out.println("You can sit in exams");
//        }

        // Que 13
//        int x = 2;
//        int y = 5;
//        int z = 0;
//        System.out.println(x==2);
//        System.out.println(x!=5);
//        System.out.println(x!=5 && y>=5);
//        System.out.println(z!=0 || x==2);
//        System.out.println(!(y<10));

//        Scanner sr = new Scanner(System.in);
//        System.out.println("Enter a Character");
//        char a = sr.next().charAt(0);
//        if(a>='a' && a<='z'){
//            System.out.println("It is a lower case Character");
//        }
//        else{
//            System.out.println("It is Upper case Character");
//        }
//        int a = 536;
//        int b = 7;
//        if(a>b){
//            System.out.println(a + " is greater");
//        }
//        else{
//            System.out.println(b + " is greater");
//        }




    }


