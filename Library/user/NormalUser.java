package Library.user;


import Library.operation.*;

import java.util.Scanner;

/**
 * 普通用户
 */
public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.iOperations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    @Override
    // 重写菜单
    public int menu() {
        System.out.println("========================");
        System.out.println("hello "+this.name+" 欢迎来到图书系统");
        System.out.println("1、查找图书");
        System.out.println("2、借阅图书");
        System.out.println("3、归还图书");
        System.out.println("0.退出系统");
        System.out.println("=========================");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }
}
