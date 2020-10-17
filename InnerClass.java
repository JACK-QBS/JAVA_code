package 十月;

/**
 * 内部类：
 * 1、静态内部类
 * 2、实例内部类
 * 3、本地内部类： 方法内部的类（基本不会使用）
 * 4、匿名内部类
 */

class OuterClass2 {
    public int data1 = 999;
    private int data2;
    public static int data3;
    /**
     * ① 静态内部类：静态的数据成员
     * （1）如何实例化静态内部类对象
     * OuterClass2.InnerClass2 innerClass2 = new OuterClass2.InnerClass2();
     * （2）静态内部类是不能够访问 外部类的实例数据成员的
     * 非要访问 ： 只要提供给他外部类的对象的引用就好
     */
    static public class InnerClass2 {
        public int data4;
        private int data5;
        public static int data6;
        OuterClass2 out;
        public InnerClass2(OuterClass2 o) {
            this.out = o;
        }
        public void func() {
            System.out.println(data4);
            System.out.println(this.out.data1);
            System.out.println("静态内部类： func()");
        }
    }
}

class OuterClass {
    public int data1 = 99;
    public int data2;
    public int data3;
    /**
     * ②实例内部类：你可以把他看成是外部类的实例的成员/方法
     * （1）实例内部类当中，是不可以定义静态的成员变量的
     *   但是，如果非要定义，那么只有一个办法（加 final，给初始值）
     * （2）如何实例化内部对象？
     * OuterClass.innerclass2 innerclass = outerClass.new innerclass2();
     * （3）如何访问和外部类同名的属性？
     * 面试问题： 实例内部类，是否有额外的开销？
     * 实例内部类当中 ， 包含了外部类的 this 引用
     * OuterClass.this.data1--> 其实 this 这个东西是一个静态的引用
     * （4）命名： 外部类$内部类.class
     */
    class innerclass1 {
        public int data1 = 100;
        public int data5;
        public static final int data6 = 10;
        public void func() {
            System.out.println(this.data1);
            System.out.println(OuterClass.this.data1);
        }
    }
}

// 匿名内部类
class OuterClass3 {
    public void func() {
        System.out.println("OuterClass3 的 func");
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.innerclass1 innerclass = outerClass.new innerclass1();

        OuterClass2.InnerClass2 innerClass2 = new OuterClass2.InnerClass2(new OuterClass2());

        new OuterClass3(){
            // 类内部的内容
            public int data1;
            public void func() {
                System.out.println("我重写了func");
            }
        }.func();

    }
}
