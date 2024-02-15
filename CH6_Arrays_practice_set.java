import java.util.Scanner;

public class CH6_Arrays_practice_set {
    public static void main(String[] args) {
        //Que 1 - Create an array of 5 floats and calculate their sum
//        float [] sum ;
//        sum = new float[5];
//        sum[0] = 30.0f;
//        sum[1] = 21.0f;
//        sum[2] = 65.0f;
//        sum[3] = 98.0f;
//        sum[4] = 45.0f;
//        float f = 0.0f;
//        for(int r = 0;r<sum.length;r++){
//            f = f + sum[r];
//        }
//        System.out.println(f);
//        float sum1 = 0f;
//        for(float element : sum){ //using for each loop
//            sum1 = sum1 + element;
//        }
//        System.out.println(sum1);

        // que 2
        int [] sum ;
        sum = new int[5];
        sum[0] = 30;
        sum[1] = 21;
        sum[2] = 65;
        sum[3] = 98;
        sum[4] = 40;
////
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a integer");
//        int a = in.nextInt();
//        int f = 0;
//        for(int element:sum){ // using for each loop
//            if(a==element){
//                f++;
//            }
//        }
//        if(f==1){
//            System.out.println("The Integer is present in the array");
//        }
//        else{
//            System.out.println("Integer is not present in an array");
//        }
//                int g = 0;
//        for(int i = 0;i< sum.length;i++) { // using for loop but , for each loop is much easier than for loop
//            if (a == sum[i]) {
//               g++;
//            }
//
//        }
//        if(g==1){
//            System.out.println("Element is present in the array");
//        }
//        else{
//            System.out.println("Element is not present in the array");
//        }
//

        // Que 3 -  calculate the average of marks in the array
//        double [] marks = {21.0,85,13.09,87.0,89,53};
//        double r = 0;
//        for(int i = 0;i< marks.length;i++){
//            r=r+marks[i];
//        }
//        System.out.println(r/ marks.length);
//
        // que 4 - Create a java program to add 2 matrices of 2x3
//        int[][] mat1 = {{1,2,3},// 0
//                        {4,5,6}};// 1
//
//        int [][] mat2 = {{2,6,13},
//                         {3,7,1}};
//
//        int [][] result = {{0,0,0},
//                           {0,0,0}};
//
//        for(int i = 0;i<mat1.length;i++){
//
//            for(int j = 0;j < mat1[i].length;j++){
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print( result[i][j] + " ");
//            }
//            System.out.println("");
//        }



        //Que 5 write a java program to reverse an array
//        int [] value = {1,2,3,4,5};
//        for (int i = value.length-1;i>=0;i--){
//            System.out.print(value[i] + " ");
//        }

        // Just swapping
//        int a = 2;
//        int b = 5;
//        int c;
//        c = a; // c = 2
//        a = b; // a = 5
//        b = c; // b = 2
//        System.out.print(a + " ");
//        System.out.println(b);

        //Que 6 -  write a java program to find maximum element in an array
//        int [] value = {49,86,02,84,21,883,-21000};
//        int max = Integer.MIN_VALUE;
//        for(int e:value ){
//            if(max<e){
//                max=e;
//            }
//        }
//        System.out.println("Maximum number in the Array is  " + max);
//        System.out.println(Integer.MAX_VALUE); // this function gives the max. value of integer can hold
//        System.out.println(Integer.MIN_VALUE); // min. value that integer can hold

        //Que 7 - write a java program to find minimum element in an array
//          int [] value = {49,86,02,84,21,883,-21000};
//          int x = Integer.MAX_VALUE;
//          for(int f:value){
//              if(x>f){
//                  x=f;
//              }
//          }System.out.println(x);

        //Que 8 -  write a program to check whether the array is sorted or not
//        Scanner cr = new Scanner(System.in);
//        System.out.print("Enter the size of the array : ");
//        int size = cr.nextInt();
//
//        int[] arr = new int[size];
//        for(int i=0;i<= arr.length-1;i++){
//            arr[i] = cr.nextInt();
//        }
//        boolean sorted = true;
//        for(int i=0;i< arr.length-1;i++){
//            if(arr[i]> arr[i+1]){
//                sorted = false;
//            }
//        }
//        if(sorted){
//            System.out.println("Array is sorted");
//        }
//        else {
//            System.out.println("Array is not sorted");
//        }

        //Que 9 - Check at which index the element is present in an array
//        Scanner sr = new Scanner(System.in);
//        System.out.print("Enter the size of the array : ");
//        int size = sr.nextInt();
//
//        int[] arr = new int[size];
//        for(int i=0;i< arr.length;i++) {
//            arr[i] = sr.nextInt();
//        }
//        int search = 3;
//
//            for(int j= 0;j< arr.length;j++){
//                if(arr[j]==search){
//                    System.out.println("Element is present at index " + j);
//                }
//            }
//        }

        //Que 10 - Take input as names in an array from user and display it
//        Scanner nm = new Scanner(System.in);
//        System.out.println("Enter size of the array : ");
//        int size = nm.nextInt();
//
//        String [] name = new String[size];
//        for(int i=0;i< name.length;i++){
//            name[i] = nm.next();
//        }
//
//        for(int j=0;j< name.length;j++){
//            System.out.println(name[j]);
//        }



        //Que 11 - Take input from user and make an 2D-array and display it again
//        Scanner cr = new Scanner(System.in);
//        System.out.print("Enter Row and Column : ");
//        int row = cr.nextByte();
//        int column = cr.nextByte();
//         int[][] arr = new int[row][column];
//
//         for(int i = 0;i<row;i++){
//             for(int j = 0;j<column;j++){
//                 arr[i][j] = cr.nextInt();
//             }
//             System.out.println();
//         }
//
//         for(int i = 0;i<row;i++){
//             for(int j = 0;j<column;j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }

         //Que 12 - Take a 2d-matrix as an input from user and search for a element and return its
        // rows and column position/location
//        Scanner sr = new Scanner(System.in);
//        System.out.println("Enter rows and column");
//        int rows = sr.nextByte();
//        int cols = sr.nextByte();
//
//        int[][] drr = new int[rows][cols];
//        for(int i = 0;i<rows;i++){
//            for(int j = 0;j<cols;j++){
//                drr[i][j] = sr.nextInt();
//            }
//            System.out.println();
//        }
//
//        int search = 5;
//        for(int i = 0;i<rows;i++){
//            for(int j = 0;j<cols;j++){
//                if(search==drr[i][j]){
//                    System.out.print(  i+" th " +"row "+ j +  " column");
//                }
//            }
//            System.out.println();
//        }






    }







    }

