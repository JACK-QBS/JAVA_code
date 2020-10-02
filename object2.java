package test24;



//交换两个数字
class MyValue {
    public int val;
}
public class object2 {
    public static void swap(MyValue a,MyValue b) {
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
    }
    public static void main(String[] args) {
        MyValue myValue1 = new MyValue();
        myValue1.val = 10;

        MyValue myValue2 = new MyValue();
        myValue2.val = 20;

        System.out.println(myValue1.val);
        System.out.println(myValue2.val);

        swap(myValue1,myValue2);
        System.out.println("======================");
        System.out.println(myValue1.val);
        System.out.println(myValue2.val);
    }


}




/*class Person1 {
    public int age;
    public String name;

    public static int count;
    public final int size1 = 100; //普通的成员变量  对象
    public static int size2 = 999; //地址存放在方法区

    public void eat() {
        final int size3 = 10; // 局部变量存放在栈上
        System.out.println("吃饭！");
    }
    public void show() {
        System.out.println("我叫 "+ name + "年龄： " +age);
    }
    public static void func() {
        System.out.println("静态方法！");
    }
}
public class object2 {
    public static void main(String[] args) {
        Person1 person = new Person1();
        person.name = "qbs";
        person.age = 20;
    }
}*/
