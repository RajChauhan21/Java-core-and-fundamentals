import java.util.Random;
import java.util.Scanner;

public class EXE2_Stone_Paper_ScissorGame {
    public static void main(String[] args) {
        // FOR USER
        char ch = 'y';
        while (ch=='y') {
            Scanner cr = new Scanner(System.in);
            System.out.println("Choose\n" + "1.Stone\n" + "2.Paper\n" + "3.Scissor");
            int a = cr.nextInt();
            if (a == 1) {
                System.out.println("You have choosed Stone");
            }
            if (a == 2) {
                System.out.println("You have choosed Paper");
            } else if (a == 3) {
                System.out.println("You have choosed Scissor");
            }

            // FOR COMPUTER
            Random rn = new Random();
            int b = rn.nextInt(1, 4);
            switch (b) {
                case 1:
                    System.out.println("Pc Chooses Stone");
                    break;

                case 2:
                    System.out.println("Pc Chooses Paper");
                    break;

                case 3:
                    System.out.println("Pc Chooses Scissor");
                    break;
            }

            // Winner Declaration
            if (a == 1 && b == 1) {
                System.out.println("Game is draw");
            } else if (a == 1 && b == 2) {
                System.out.println("Computer wins");
            } else if (a == 1 && b == 3) {
                System.out.println("User wins");
            } else if (a == 2 && b == 1) {
                System.out.println("User wins");
            } else if (a == 2 && b == 2) {
                System.out.println("Game is draw");

            } else if (a == 2 && b == 3) {
                System.out.println("Computer wins");
            } else if (a == 3 && b == 1) {
                System.out.println("Computer wins");
            } else if (a == 3 && b == 2) {
                System.out.println("User wins");
            } else if (a == 3 && b == 3) {
                System.out.println("Game is Draw");
            }
            System.out.println("Do you want to play again press y or n accordingly");
             ch = cr.next().charAt(0);


        }
    }
}
