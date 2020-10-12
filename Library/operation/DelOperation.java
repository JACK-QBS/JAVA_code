package Library.operation;


import Library.book.Book;
import Library.book.BookList;

import java.util.Scanner;

/**
 * 删除图书
 */
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int pos = -1;
        int i = 0;

        for(;i < bookList.getUsedSize();i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                pos = i; // 记录当前书籍的下标
                break;
            }
        }
        // 2、 (1)循环条件退出
        if(i >= bookList.getUsedSize()) {
            System.out.println("没有需要删除的书籍！");
            return;
        }
        // （2）查找到了
        int curSize = bookList.getUsedSize();
        for (int j = pos;j < bookList.getUsedSize()-1;j++) {
            Book book = bookList.getBook(i+1);
            bookList.setBooks(i,book);
        }
        bookList.setUsedSize(curSize-1);
        System.out.println("删除成功！");

    }
}
