package 十月;

/**
 * 异常
 * 1、编译时异常    受查异常
 * 2、运行时期异常  非受查异常
 * finally 与是否异常无关，一定会被执行，主要用来释放资源，关闭文件，关闭socket链接(不建议 finally 中写return)
 */
public class abnormity {

    // 程序员手动抛出异常
    public static void testThrow(int a) throws RuntimeException,ArithmeticException { // 声明异常
        if(a == 10) {
            throw new RuntimeException("a==10");
        }
    }
    public static void main(String[] args) {
        try {
            testFinally();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("you are cool!");
    }


    public static int testFinally() {
        int a = 10;
        try {
            return 4;
        } catch(ArithmeticException e) {
            e.printStackTrace();
        } finally {
            // 不建议 finally 中写return，因为 Finally 一定会被执行，是用来释放资源的
            return a;
        }
    }
    public static void main3(String[] args) {
        int[] array = {1,2,3};
        try {
            System.out.println(array[5]);
            System.out.println("继续执行！");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("数组越界异常！");
        } finally {
            // finally 与是否异常无关，一定会被执行，主要用来释放资源，关闭文件，关闭socket链接
            System.out.println("哈哈哈");
        }
        System.out.println(testFinally());
    }

    public static void main2(String[] args) {
        int[] arr = {1,2,3};
        try {
            System.out.println("before");
            System.out.println(arr[100]);
            System.out.println("after"); // 不会被打印
        } catch (ArrayIndexOutOfBoundsException e) {
            // 打印出现异常调用栈
            e.printStackTrace();
        }
        System.out.println("after try catch");
    }

    public static void main1(String[] args) {
        try {
            System.out.println(10/0);
        } catch (ArithmeticException  | NullPointerException e) {
            System.out.println("捕获到了 算数/空指针 异常！");
        }
        System.out.println("哈哈哈");
    }

}

