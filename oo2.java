package test24;


/**
 * 多态
 */
class Shape {
    public void draw() {
    }
}
class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个⚪圈!");
    }
}
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}

public class oo2 {
    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new Rect();
        drawMap(shape1);
        drawMap(shape2);
    }
}



/*class Animal1 {
    protected String name;
    public Animal1(String name) {
        this.name = name;
    }
    public void eat1() {
        System.out.println(this.name+"吃饭");
    }
}
class cat1 extends Animal1{
    public cat1(String name) {
        super(name);
    }
    public void eat1() {
        System.out.println(this.name+"吃猫粮");
    }
}
class bird1 extends Animal1{
    public bird1(String name) {
        super(name);
    }
    public void fly1() {
        System.out.println(this.name+"会飞");
    }
}


public class oo2 {
    public static void main(String[] args) {
        Animal1 animal1 = new bird1("八哥");
        // 向下转型
        bird1 bird1 = (bird1) animal1;
        bird1.fly1();
        Animal1 animal12 = new cat1("咪咪");
        animal12.eat1();
        //如果要向下转型，一定要判断animal2是否可以转换为bird
        if(animal12 instanceof bird1) {
            bird1 bird12 = (bird1) animal12;
            bird12.fly1();
        }
    }
}*/
