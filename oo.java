package test24;


/**
 * 继承:（java 单继承）
 *
 * 面试： 子类继承了父类的什么？
 * 除了构造方法外的所有东西。。。
 * （子类需要去帮助父类构造方法，即访问父类构造方法）
 */


/**
 *  多态
 *
 *  1、向上转型表现形式：
 *  ①直接赋值  ②方法的传参  ③返回值
 *
 *  动态绑定：
 *  1、父类的引用，引用子类的对象（向上转型）
 *  2、通过父类的引用，调用子类和父类重写的那个方法
 *
 */

class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(this.name + "正在吃！");
    }
}

class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void Jump() {
        System.out.println("正在挑！");
    }
    //重写
    public void eat() {
        System.out.println(this.name+"正在吃猫粮");
    }

}

class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    public void Fly() {
        System.out.println("正在飞！");
    }
}
public class oo {
    public static void func(Animal animal) {
        animal.eat();
    }
    public static Animal func2() {
        Cat cat = new Cat("mimi");
        // ③ 返回值
        return cat;

    }

    public static void main(String[] args) {
/*        java.util.Date date = new java.util.Date();
        //得到一个毫秒级别的时间戳
        System.out.println(date.getTime())*/;

        // ① 直接赋值
        Animal animal = new Cat("咪咪"); // 父类的引用，引用子类对象 ①
        // ② 方法的传参
        /*Cat cat = new Cat("mimi");
        func(cat);*/

        //Cat cat = new Cat("咪咪");
        //cat.eat();

        animal.eat(); // 此时，当cat 也重写了cat()方法之中，产生效果
    }


}
