import java.util.Scanner;
public class EXE1_percentage_calculator {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("Enter Subject 1 marks");
        float a = cr.nextInt();

        System.out.println("Enter Subject 2 marks");
        float b = cr.nextInt();

        System.out.println("Enter Subject 3 marks");
        float c = cr.nextInt();

        System.out.println("Enter Subject 4 marks");
        float d = cr.nextInt();

        System.out.println("Enter Subject 5 marks");
        float e = cr.nextInt();

        float sum = (a + b + c + d + e*5 )/100;
        System.out.println("Your total percentage is :");
        System.out.println(sum);
    }
}
