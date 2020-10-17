package 十月;


/**
 * 自定义异常
 */

// 运行时异常
class MyException extends RuntimeException {
    public MyException(String str) {
        super(str);
    }
}

public class abnormity2 {
    public static void func() throws MyException {
        throw new MyException("ajcj");
    }
    public static void main(String[] args) {

        throw new NullPointerException("空指针异常！");

        /*try {
            func();
        } catch(MyException e) {
            System.out.println("捕获了MyException");
        } finally {
            System.out.println("finally");
        }
    }*/
}
}
