package test24;

import java.util.Random;
import java.util.Scanner;

public class Tesk {
    /*public static void output(int num) {
        if(num > 9){
            output(num / 10);
        }
        System.out.printf("%d  ",num % 10);
    }*/
    public static void main(String[] args) {

        //输出n*n的乘法口诀表，n由用户输入。
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数，表示是 n*n 的乘法口诀表： ");
        int num = input.nextInt();
        for (int i = 1;i <= num;i++)
        {
            for (int j = 1;j <=i;j++)
            {
                System.out.print(i+" * "+j+" = "+(i*j) +"    ");
            }
            System.out.println("\n");
        }




        //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
        /*Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        output(num);*/



        //编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误，
        // 可以重新输入，最多输入三次。三次均错，则提示退出程序
        /*Scanner input = new Scanner(System.in);
        int count = 3;
        while(count > 0){
            System.out.println("请输入密码：");
            String PassWord = input.next();
            if(PassWord.equals("123456")){
                System.out.println("登录成功！！");
                break;
            } else {
                System.out.println("密码不正确，请重新输入，你还有"+(count-1)+"次机会");
                count--;
            }
        }*/




            //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
            /*Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            for (int i = 31; i >= 1; i -= 2)
            {
                System.out.print((num >> i) & 1);
            }
            System.out.println("\n");
            for (int i = 30; i >= 0; i -= 2)
            {
                System.out.print((num >> i) & 1);
            }
            System.out.println("\n");*/





        //求一个整数，在内存当中存储时，二进制1的个数。
        /*Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        for(int i = 0;i < 32;i++){
            if(((num>>i) & 1) == 1){
                count ++;
            }
        }
        System.out.println("1的个数是："+count);*/




        //求两个正整数的最大公约数
        /*Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int r = 1;
        if(a == 0 || b == 0){
            System.out.print(a == 0 ? b : a);//a,b其中有0的情况
        }
        else{
            for ( int i = 2; i <= a && i <= b;i++){
                if(a % i == 0 && b % i == 0){
                    r = i;
                }
            }
            System.out.print(r);
        }*/





        // 1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
        /*double sum = 0;
        int flag = 1;
        for(int i = 1;i <= 100;i++){
            sum += (1.0/i) * flag;
            flag = -flag;
        }
        System.out.println("求解结果为： "+sum);*/




        //0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身
        // 如；153＝1＋5＋3?，则153是一个“水仙花数“。）
        /*int a = 0,b = 0, c = 0;
        for(a = 0;a < 10;a++){
            for(b = 0; b< 10;b++){
                for(c = 0;c < 10;c++){
                    int num = 100*a + 10*b + c;
                    int sum = (int)Math.pow(a,3) + (int)Math.pow(b,3) + (int)Math.pow(c,3);
                    if(num == sum){
                        System.out.println(num+"是水仙花数");
                    }
                }
            }
        }
*/




        //完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
        /*Scanner b = new Scanner(System.in);
        Random a = new Random();
        int random = a.nextInt(100);
        while(true){
            System.out.println("请输入一个数字： ");
            int num = b.nextInt();
            if(num > random) {
                System.out.println("大了");
            } else if (num < random){
                System.out.println("小了");
            } else {
                System.out.println("猜对了！");
            }
        }
*/



            // 根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
            /*Scanner a = new Scanner(System.in);
            int age = a.nextInt();
            if(age <= 18){
                System.out.println("少年");
            } else if (age >= 19 && age <= 28){
                System.out.println("青年");
            } else if (age >= 29 && age <= 55){
                System.out.println("中年");
            } else if (age <= 56){
                System.out.println("老年");
            }*/




        //给一个数，判断是不是素数
      /*  Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        boolean flag = true;
        for(int i = 2;i < num;i++) {
            if(num % i == 0){
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println(num+"是素数");
        } else {
            System.out.println(num+"不是素数");
        }*/




        //1-100 之间的素数
        /*for(int a = 2;a <= 100;a++){
            boolean flag = true;
            for(int b = 2;b < a;b++){
                if(a % b == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(a+"是素数");
            }
        }*/




        //打印1000-2000之间的闰年
        /*for(int year = 1000;year <= 2000;year++){
            if(((year%4==0)&&(year%100!=0))||(year%400==0)){
                System.out.println(year+"是闰年");
            }
        }*/




        /*int count = 0;    //1-100之间出现9的个数
        int i = 0;
        int j = 0;
        int sum = 10 * i + j;
        for (i = 0;i < 10;i++) {
            for (j = 0;j < 10;j++) {
                if (9 == j)
                    count++;//个位是9
            }
            if (9 == i)
                count+=10;//十位是9
        }
        System.out.println("1-100的整数中出现了 "+count +"个9");*/
    }
}
