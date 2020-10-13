package Library;

import Library.book.BookList;
import Library.user.AdminUser;
import Library.user.NormalUser;
import Library.user.User;

import java.util.Scanner;

public class Main {

    // 登录
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名： ");
        String name =  scanner.next();
        System.out.println("请输入你的身份：   1: 管理员     0：普通用户");
        int n = scanner.nextInt();
        if(n == 1) {
            return new AdminUser(name);
        } else {
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login(); // 向上转型
        while(true) {
            // choice 代表你的选择
            int choice = user.menu(); // 动态绑定
            user.doOperation(choice,bookList);
        }


    }

}
