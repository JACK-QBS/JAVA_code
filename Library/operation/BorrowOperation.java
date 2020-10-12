package Library.operation;

import Library.book.Book;
import Library.book.BookList;

import java.util.Scanner;

/**
 * 借阅书籍
 */
public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("借阅图书");
        System.out.println("请输入所要借阅图书的名称：");
        String name = scanner.next();

        for(int i = 0;i < bookList.getUsedSize();i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                System.out.println("找到了这本书！");
                System.out.println(book);
                book.setBorrowed(true); // 借阅书籍
                System.out.println("借阅成功！");
                return;
            }
        }
        System.out.println("没有这本书！");

    }
}
