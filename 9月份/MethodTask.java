package test24;

import java.util.Scanner;

public class MethodTask {

    /*public static int fac(int m){
        int ret = 1;
        for(int i = 1;i <= m;i++){
            ret *= i;
        }
        return ret;
    }
    public static int facSum (int n) {
        int sum = 0;
        for(int i = 1;i <= n;i++){
            sum += fac(i);
        }
        return sum;
    }*/


    /*public static int Fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }*/


    /*public static int singleNumber(int nums){
        int num = 0;
        for(int i = 0;i < nums.length;i++){
            num ^= nums[i];
        }
        return num;
    }*/



    /*public static int max2(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }
    public static int max3(int c, int ret){
        return max2(c,ret);
    }*/



    public static void main(String[] args) {

        int []arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0;i < 10;i++){
            for(int j = i + 1; j < 10;j++){
                if(arr[j] % 2 != 0){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
            System.out.print(arr[i]+" ");
        }


        /*System.out.println("请输入两个数： ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int ret = max2(a,b);
        System.out.println("这两个数中的最大值是： "+ret);
        System.out.println("请在输入一个数： ");
        int c = input.nextInt();
        System.out.println("这三个数中的最大值是： "+max3(c,ret));*/



        /*int[] nums = new int[]{1,2,4,5,3,3,4,1,2};
        System.out.println(singleNumber(nums));*/


        /*Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ret = Fibonacci(n);
        System.out.println("斐波那契数列第"+n+"项的值为："+ret);*/



        /*int sum = facSum(n);
        System.out.println(n+"的阶乘和为"+sum);*/
    }

}
