public class CH2_Operators {
    public static void main(String[] args) {
        int a  = 4;
        int b = 5;
        int sum = a + b;
        System.out.println(sum); //ARITHMETIC OPERATORS
//        4.8%1.1 ----> Returns decimal Remainder
        int c = 3;
        c *= 5;
        System.out.println(c); //ASSIGNMENT OPERATORS

//        System.out.println(4==4);
//        System.out.println(67<=76); //COMPARISON OPERATORS
//        System.out.println(5>=6);

        System.out.println(5>1 && 7<0);
        System.out.println(7>2 && 2<9); //LOGICAL OPERATORS    and(&) or(||)
        System.out.println(9<2 || 6<0);

        // BITWISE OPERATORS and(&) or(|)
        System.out.println(2|6);
        System.out.println(4&2);

    }
}
