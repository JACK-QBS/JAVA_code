package ML;

import java.util.Scanner;

public class Input {
    Scanner sc = new Scanner(System.in);
    int n1,n2;
    int []available;
    int [][]Max;
    int [][]Allocation;
    int [][]Need;
    public void input(){
        System.out.println("请输入【进程数】");
        n1 = sc.nextInt();//进程数量，分配表的行数
        System.out.println("请输入【资源种类数】");
        n2 = sc.nextInt();//资源种类数，每一项分配表的列数

        //-----------------available--------------------
        available = new int[n2];//
        System.out.println("请输入每一种资源当前可支配的数量！");
        for(int i =0; i < n2;i++){
            int a = 65+i;
            char b =(char) a;
            System.out.println("资源"+b+"：");
            available[i] = sc.nextInt();
        }
        //--------------max------------------------------
        Max = new int[n1][n2];
        System.out.println("请根据提示输入进程所需要的最大资源数！");
        for(int i = 0 ;i < n1;i++){
            System.out.println("请输入进程p【"+i+"】所需要的最大资源数");
            for(int j = 0;j < n2; j++){
                int a = 65+j;
                char b =(char) a;
                System.out.println("资源"+b+"：");
                Max[i][j] = sc.nextInt();
            }
        }
        //------------------Allocation----------------------
        Allocation= new int[n1][n2];
        System.out.println("请根据提示输入进程已分配资源！");
        for(int i = 0 ;i < n1;i++){
            System.out.println("请输入进程p【"+i+"】已分配资源");
            for(int j = 0;j < n2; j++){
                int a = 65+j;
                char b =(char) a;
                System.out.println("资源"+b+"：");
                Allocation[i][j] = sc.nextInt();
            }
        }
        //-----------------Need----------------------------
        Need= new int[n1][n2];
        for(int i = 0;i < n1;i++){
            for(int j = 0;j < n2;j++){
                Need[i][j] = Max[i][j] -Allocation[i][j];
            }
        }
        System.out.println("系统初始化完成！");
    }
    public void output(){
        System.out.println("当前系统资源情况：");
        System.out.println("-----------------------------------------------------------------------------------------");
        //打印第一行 各个矩阵的名称
        System.out.print("    "+"\t");
        System.out.print(String.format("%6s","Max"));
        for(int i =0;i<4*(n2-1)-2;i++){
            System.out.print(" ");
        }
        System.out.print("\t");
        System.out.print(String.format("%13s","Allocation"));
        for(int i =0;i<4*(n2-2)-1;i++){
            System.out.print(" ");
        }
        System.out.print(String.format("%7s","Need"));
        for(int i =0;i<4*(n2-1)-1;i++){
            System.out.print(" ");
        }
        System.out.print("\t");
        System.out.print(String.format("%12s","Available"));
        System.out.println();
        //打印第二行 资源名称 A B C D ……
        System.out.print("    " + "\t");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < n2; i++) {
                int a = 65 + i;
                char b = (char) a;
                System.out.print(String.format("%4c", b));
            }
            System.out.print("\t");
        }
        //打印资源情况
        System.out.println();
        for(int i = 0;i < n1;i++){
            System.out.print("p【"+i+"】"+"\t");
            for(int j = 0;j < n2; j++){
                System.out.print(String.format("%4d",Max[i][j]));
            }
            System.out.print("\t");
            for (int j = 0;j < n2;j++){
                System.out.print(String.format("%4d",Allocation[i][j]));
            }
            System.out.print("\t");
            for (int j = 0;j < n2;j++){
                System.out.print(String.format("%4d",Need[i][j]));
            }
            System.out.print("\t");
            if(i ==0) {
                for (int j = 0; j < n2; j++) {
                    System.out.print(String.format("%4d",available[j]));
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("资源分配表打印完成！");
        System.out.println();
    }
}
