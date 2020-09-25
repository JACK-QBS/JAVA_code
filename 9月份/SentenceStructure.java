package test24;
import java.util.Random;
import java.util.Scanner;

public class SentenceStructure {
    /**
     * 逻辑控制 语句结构
     * 任何程序都是有由顺序结构、选择结构、循环结构组成
     *
     * @param args
     */
    public static void main1(String[] args){
        int a = 10;
        // if(boolean表达式)
        if(a != 10) {
            System.out.println("abc");
        } else if(a == 10){
            System.out.println("123");
        } else {
            System.out.println("456");
        }
    }

    // 判断语句
    public static void main2(String[] args){
        /*//int num = 8;
        Scanner scan =  new Scanner(System.in);//从键盘输入
        int num = scan.nextInt();
        if(num % 2 == 0) {
            System.out.println(num+ "是偶数");
        } else {
            System.out.println(num+ "是奇数");
        }*/

        /*Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num > 0) {
            System.out.println(num + "是正数");
        } else if(num < 0) {
            System.out.println(num + "是负数");
        } else {
            System.out.println(num + "既不是负数，也不是正数");
        }*/

        /*Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(((num % 4 == 0) && (num % 100 != 0)) || (num % 400 == 0)){
            System.out.println(num + "是闰年");
        } else {
            System.out.println(num + "不是闰年");
        }*/


        //一般分支大于3个， 采用switch 语句
        int a = 10;
        //byte a = 10;
        //short a = 10;
        //long a = 10L;  不行
        //float a = 12.5f;  不行
        //double a = 12.4;  不行
        //char a = 'g';
        //boolean a = true;   不行
        switch (a) {
            case 1:
                System.out.println("1");
                break; //如果没有break 就会执行下一条语句，直到遇到下个break
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("不是1 也不是2");
                break;
        }

    }

    //循环结构
    public static void main4(String[] args) {
        /*int num = 10;
        while(num > 0){
            System.out.println(num+"");
            num --;
        }*/

        /*int num = 100;
        int i = 1;
        int add_j = 0;
        int add_o = 0;
        while(i <= num) {
            add_j += i;
            i += 2;
        }
        System.out.println("奇数的和是"+add_j);
        i = 2;
        while(i <= num) {
            add_o += i;
            i += 2;
        }
        System.out.println("偶数的和是"+add_o);
        int sum = 0;
        while(num > 0) {
            sum += num;
            num --;
        }
        System.out.println("1-100的和是"+sum);*/

        /*System.out.println("请输入一个数字,表示 1!+2!+3!+…… 加到几：");
        Scanner scan = new Scanner(System.in);// 从键盘输入
        int num = scan.nextInt();
        int sum = 0;// 用来存放阶乘的和（1!+2!+3!+……）
        int a = 1;
        while(a <= num){
            int ret = 1; //用来存放单个数字阶乘的值（5!）
            int b = 1;
            while(b <= a) {
                ret *= b;
                b++;
            }
            sum += ret;
            a++;
            a++;
            a++;
        }
        System.out.println("待求的阶乘和为： "+sum);*/

       /* while(true) {
            System.out.println("hello");
        }*/

        System.out.println("请输入一个数字,表示 1!+2!+3!+…… 加到几：");
        Scanner scan = new Scanner(System.in);// 从键盘输入
        int num = scan.nextInt();
        int sum = 0;// 用来存放阶乘的和（1!+2!+3!+……）
        for (int a = 1;a <= num;a++){
            int ret = 1; //用来存放单个数字阶乘的值（5!）
            for(int b = 1;b <= a;b++) {
                ret *= b;
            }
            sum += ret;
        }
        System.out.println("待求的阶乘和为： "+sum);

    }


    //猜数字
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int random = rnd.nextInt(100)+1;//设置一个随机数
        while(true){
            System.out.println("请输入你想猜的数字： ");
            int n = scan.nextInt();
            if(n < random){
                System.out.println("猜小了！");
            }else if (n > random) {
                System.out.println("猜大了！");
            }else {
                System.out.println("猜对了！");
            }
        }

    }





}
