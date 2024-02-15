import java.util.Scanner;
public class CH4_else_if {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("Enter your age");
        int a = age.nextInt();
        if(a>=50){
            System.out.println("You are experienced");
        }
        else if(a>=40)
        {
            System.out.println("You are semi-experienced");
        }
        else if (a>=30) {
            System.out.println("You are a fresher");
        }
        else{
            System.out.println("You are not eligible for this job");
        }


    }
    }

