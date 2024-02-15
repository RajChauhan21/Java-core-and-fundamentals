
import java.util.Scanner;
public class CH1_takinginput {
    public static void main(String[] args) {
//        System.out.println("Taking input from user");
        Scanner cr = new Scanner(System.in);
        System.out.println("Enter no.1");
//        float a = cr.nextFloat();
        int a = cr.nextInt();
        System.out.println("Enter no. 2");
        int b = cr.nextInt();
//        float b = cr.nextFloat();
        int add = (a + b) / 2 ;
//        System.out.println("Sum of the numbers are :");
//        System.out.println(add);
//        boolean rc = cr.hasNextInt();
//        System.out.println(rc);
        String str = cr.next();
//        String str = cr.nextLine();
        System.out.println(str);

    }
}
