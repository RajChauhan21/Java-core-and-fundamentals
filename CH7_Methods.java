

public class CH7_Methods {

       static int logic(int x , int y){

        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x + y)*5;
        }
        return z;

    }
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        int c;
        // Method calling using object creation
//        CH6_Methods func = new CH6_Methods();
//      c = func.logic(a,b);
        c = logic(a,b);
        System.out.println(c);


//        int f = 5;
//        int g = 12;
//        int h;
//        h = logic(f,g);
//        System.out.println(h);

    }
}
