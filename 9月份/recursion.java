package test24;

import java.util.Scanner;

public class recursion {
    /*public static int fac(int n) {
        if(n == 1){
            return 1;
        }
        return n * fac(n-1);
    }*/


    /*public static void outPut (int num) {
        if(num > 9){
            outPut(num / 10);
        }
            System.out.print(num % 10+" ");

    }*/



    /*public static int add(int num) {
        if (num == 1){
            return 1;
        }
        return num + add(num-1);
    }*/


    public static int addOnes (int num) {
        if(num / 10 == 0){
            return num;
        }
        return ((num % 10) + addOnes(num / 10));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(addOnes(num));


//        System.out.println(add(num));

//        outPut(num);

//        System.out.println(fac(5));
    }
}
