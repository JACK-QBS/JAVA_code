package test24;


/**
 * 定义一个类 （模板）
 * class 类名 {
 * 属性/字段 ： 年龄，姓名
 * 行为/方法：
 * }
 * 1、实例化一个对象： new Person();
 * 2、一个类可以产生/实例化多个对象
 * 3、字段 ； 类里面，方法外定义的变量 ，叫做字段，成员变量，成员属性
 * 4、基本数据类型的默认值 。引用类型默认值是 null， 简单类型：对应的0值
 * 5、访问成员变量： 对象的引用，访问成员变量
 * 6、方法也叫 成员方法
 * 7、静态
 *注意：
 * 1、静态方法内 不能调用非静态方法 相反可以
 * 2、静态方法内 不能访问非静态的成员变量
 */
class Person {
    public int age;
    public String name;
    public static int count; // 静态成员变量，不属于对象 存放在方法区
    public void eat() {
        System.out.println("吃饭");
    }
    public void sleep() {
        System.out.println("睡觉");
    }
}
public class object {
    public static void main(String[] args) {
        Person person = new Person();

        Person person1 = new Person();
        person1.count++;
        System.out.println(person1.count);

        person1.count++;
        System.out.println(person1.count);

        System.out.println(person.age);
        System.out.println(person.name);
        System.out.println(Person.count);
        person.eat();
        person.sleep();

    }
    public static void main1(String[] args) {
        Person person = new Person(); //new 实例化一个对象，创建一个对象
        int b = 10;
    }

}
