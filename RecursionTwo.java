package test24;

import java.util.Arrays;
import java.util.Scanner;

public class RecursionTwo {

    /**
     *
     * 递归求 1 + 2 + 3 + ... + 10
     */
    public static int add (int num) {
        if(num > 0) {
            return num + add(num - 1);
        }
        return 0;
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(add(num));
    }



    /**
     *递归打印数字的每一位
     *按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
     */
    /*public static void print(int n) {
        if(n > 9) {
            print(n / 10);
        }
        System.out.print(n % 10 + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("请输入一个非负整数： ");
        print(n);
        System.out.println();
    }*/





    /**
     * 返回的数字之和
     * 写一个递归方法，输入一个非负整数，返回组成它的数字之和
     */
    /*public static int addSum(int n) {
        if(n < 9) {
            return n;
        }
        return n % 10 + addSum(n / 10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("请输入一个非负整数： ");
        System.out.println(addSum(n));
    }*/




    /**
     * 递归求斐波那契数列的第 N 项
     */
    /*public static int fib (int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(fib(n));
    }
*/





    /**
     * 递归求 N 的阶乘
     */
    /*public static int fac (int n) {
        if(n == 1) {
            return 1;
        }
        return n * fac(n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(fac(n));
    }
*/




    /**
     * 求和的重载
     * 在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
     */
    /*public static int add (int a,int b) {
        return a + b;
    }
    public static double add (double a,double b,double c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println("两个整数的和为： "+add(a,b));
        double c = 2.3;
        double d = 3.2;
        double e = 5.3;
        System.out.println("三个小数的和为： "+add(c,d,e));
    }*/





    /**
     *求最大值方法的重载
     *在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
     * 还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
     */
    /*public static int compute (int a,int b) {
        return a > b ? a : b;
    }
    public static double compute (double a,double b) {
        return a > b ? a : b;
    }
    public static double compute (int i,double j,double k) {
        double temp=i>j?i:j;//求i和j中较大的
        double max=temp>k?temp:k;//求最大值；
        double temp1=i<j?i:j;//求i和j中较小的；
        double min=temp1<k?temp1:k;//求最小值
        double mid=(k+j+i*1.0)-max-min;
        System.out.print("两小数和一个整数的大小关系："+max+">"+mid+">"+min);
        return 0;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println("两整数的最大值是 " + compute(a,b));
        double c = 2.3;
        double d = 4.3;
        System.out.println("两小数的最大值是 "+ compute(c,d));
        compute(a,c,d);
    }
*/



    /**
     * 汉诺塔
     *
     */
   /* public static void main(String[] args) {

    }*/





    /**
     * 斐波那契数列  递归的形式
     * @param num
     * @return
     */
    /*public static int fib(int num) {
        if(num == 1 || num == 2) {
            return 1;
        }
        return fib(num - 1) + fib(num - 2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(fib(num));
    }*/


}
