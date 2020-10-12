package Library.book;

import Library.book.Book;

public class BookList {
    private Book[] books = new Book[10];
    private int usedSize;

    public BookList() {
        books[0] = new Book("三国演义","罗贯中",12,"小说");
        books[1] = new Book("西游记","吴承恩",32,"小说");
        books[2] = new Book("水浒传","施耐庵",6,"小说");
        this.usedSize = 3;

    }

    // 在 pos 位置 放 Library.book 这本书
    public void setBooks(int pos,Book book) {
        this.books[pos] = book;
    }
    // 返回 pos 位置的这本书
    public Book getBook(int pos) {
        return this.books[pos];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
