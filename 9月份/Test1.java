package test24;

public class Test1 {
    public static void main(String[] args) {
        int a = 10;
        String str = a+" ";
        System.out.println(str);
        String str2 = String.valueOf(a);
        System.out.println(str2);
        //字符串转换成整型
        String num = "123";
        int ret = Integer.parseInt(num);
        System.out.println(ret);
    }

    public static void main6(String[] args) {
        /*int a = 1;
        long b = 20;
        int c = (int) (a+b); // a提升为long 结果也是long 类型
        System.out.println(c);*/

        byte a = 10;
        byte b = 20;
        byte c =(byte) (a+b);// CPU为了存取数据的速度，他的取值是四个字节四个字节的取
        System.out.println(c);
    }
    /**
     * int 和 Boolean 之间
     * 或者其他数据类型和Boolean之间
     * 都是不可以进行相互转换的
     * @param args
     */
    public static void main5(String[] args) {
        int a = 1;
        boolean flg = true;
        // a = flg;  boolean只有两个值
        System.out.println(a);
    }

    public static void main4(String[] args) {
        int a = 10;
        double d = 12.5;
        a = (int) d;//强制类型转换
        d = a;
        System.out.println(a);
    }

    /**
     * 整型int 和长整型long 之间的类型转换
     * @param args [description]
     */
    public static void main3(String[] args) {
        int a = 10;
        long b = 20;
        b = a;
        //a = b;// 大类型给小类型是不允许的
        System.out.println(b);
    }

    public static void main2(String[] args) {
        final int b;
        b = 1;
        int d = b+89;
        System.out.println("d的值是："+d);

    }

    public static void main1(String[] args) {
        int a = 10;// 变量
        a = 80;
        int c = a+20;
        System.out.println("c的值"+c);
        final int b = 20;//定义b为常量
        // b = 11
        int d = b+89;
    }
}
