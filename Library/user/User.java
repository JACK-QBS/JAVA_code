package Library.user;


import Library.book.BookList;
import Library.operation.IOperation;

/**
 * 用户的共同属性 （图书管理员 和 普通用户 都是用户）
 */
public abstract class User {
    protected String name; // 用户姓名
    IOperation[] iOperations; // 存储当前对象 所对应的所有的方法操作

    public User(String name) {
        this.name = name;
    }

    // 菜单
    public abstract int menu();

    public void doOperation(int choice, BookList bookList) {
        this.iOperations[choice].work(bookList);
    }

}

