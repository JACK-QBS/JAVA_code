package test24;

import java.util.Scanner;

public class method {
    /**
     * 求两个数的和
     * @param a
     * @param b
     * @return
     */
    public static int Add(int a,int b){
        return a+b;
    }

    /**
     * 计算阶乘的和
     * @param num
     * @return
     */
    public static int facSum(int num){
        int sum = 0;
        for(int i = 1;i <= num;i++){
            int ret = 1;
            for(int j = 1;j <= i;j++){
                ret *= j;
            }
            sum += ret;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = facSum(num);
        System.out.println(sum);



        /*int a= input.nextInt();
        int b= input.nextInt();

        int sum = Add(a,b);
        System.out.println(sum);*/



        /*System.out.println("请输入一个数： ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        while(num != 0){
            count++;
            num = num & (num - 1);
        }
        System.out.println("该数的二进制中共有"+count+"个1");*/


        /*Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = 2;
        for(;i < Math.sqrt(num);i++){
            if(num % i == 0){
                break;
            }
        }
        if(i > Math.sqrt(num)){
            System.out.println(num+"是素数");
        }*/


        /*for(int i = 0;i < args.length;i++){
            System.out.println(args[i]);
        }
        System.out.println("cool");*/
    }
}
