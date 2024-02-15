public class CH6_Multidimensional_array {
    public static void main(String[] args) {
                        int [] [] flats = new int[2][3]; //taking example of flats ie - There are 2 floors , each
        // floor has 3 flats , here 0 and 1 are floors and  0 1 2 are the flats
                        flats[0][0] = 101;
                        flats[0][1] = 102;
                        flats[0][2] = 103;
                        flats[1][0] = 101;
                        flats[1][1] = 102;
                        flats[1][2] = 103;

        int i,j; //i for floor and j for flats
        for(i=0;i< flats.length;i++){

            for(j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
