package test24;

/**
 * 抽象类：被 abstract 所修饰的类 （包含抽象方法）
 * 1、抽象类是不可以直接被实例化的
 * 2、抽象类和普通方法的区别是： 多了一个抽象方法
 * 3、如果一个普通类继承了一个抽象类，那么这个普通类一定要重写抽象类但好在的抽象方法
 * 4、抽象方法一定是要重写的
 * 5、如果一个类继承了抽象类，且不想重写抽象类的方法，那么这个类就只能是抽象类了。
 * 最后，一旦如果有其他类继承了这个抽象类，那么一定要重写这个抽象方法
 * 6、抽象类的出现，其实也是更方便程序员进行检查代码
 *
 */
/*abstract class shape {
    // 抽象方法： 被 abstract 所修饰的方法（抽象方法是没有实现的）
    protected abstract void draw();
    public String name;
    public int a;
    public void func(){
        System.out.println("shape::fun()");
    }
}
class Student1 extends shape {
    @Override
    public void draw() {
        System.out.println(this.name+"student");
    }
}

class Cycle2 extends shape {
    @Override
    public void draw() {
        System.out.println(" 菱形 ");
    }
}
public class oo3 {
    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape = new Cycle();
        drawMap(shape);
    }

}*/

import java.util.Arrays;

/**
 * 接口：interface  里面不能有具体实现的方法
 * 1、所有的方法默认是 public abstract （不写都是默认的）
 * 2、所有的成员变量一定是 public static final的（不写都是默认的）
 * 3、接口也不能被实例化
 * 4、接口也可以发生向上转型
 * 5、类和接口的关系：implements
 * 6、一个类可以实现多个接口
 * 7、接口的出现弥补了Java 不能多继承的问题
 */

interface Shape3 {
    int COUNT = 10;
    void draw();
    // JDK 1.8 的新特性
    default void func() {
        System.out.println("default::func");
    }
    default void func2() {
        System.out.println("default::dunc2");
    }
}

/*
interface IA {
    void funcA();
}
interface IB{
    void funcB();
}
// extends 不是继承，而是扩展,此时ID同时拥有了IA，IB两个接口的功能
interface ID extends IA,IB {
    void funcD();
}
class Demo2 implements ID{

    @Override
    public void funcA() {
    }

    @Override
    public void funcB() {
    }

    @Override
    public void funcD() {
    }
}

class Demo implements IA,IB {

    @Override
    public void funcA() {
    }

    @Override
    public void funcB() {
    }
}*/


// 只有实现了该接口，才能进行比较大小
class student implements Comparable<student>{
    public String name;
    public int age;
    public double score;

    public student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(student o) {
        if(this.age > o.age) {
            return 1; // 当前的年龄大于年龄 o
        } else if(this.age == o.age) {
            return 0;
        } else {
            return -1;
        }
    }
}
public class oo3 {
    public static void main(String[] args) {
        student[] students = new student[3];
        students[0] = new student("qbs",21,99);
        students[1] = new student("hrr",18,98);
        students[2] = new student("oyn",20,96);

        System.out.println("排序之前");
        System.out.println(Arrays.toString(students));
        System.out.println("排序之后");
        Arrays.sort(students); // 排序
        System.out.println(Arrays.toString(students));
    }
}





