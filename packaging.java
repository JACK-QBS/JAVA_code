package test24;


/**
 * 封装：
 */

/**
 * 一个对象的产生：
 * 1、为对象分配内存
 * 2、调用合适的构造方法
 */
class Student {
    private String name;
    private int age;

    /**
     * 构造方法： 没有返回类型 ，且与类名一样
     * 调用完构造方法后，对象才真正的存在了
     */
    public Student() {
        System.out.println("Student!!!");
    }
    public Student(String name) {
        this.name = name;
        System.out.println("Student is cool !!!");
    }
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student(String) !!!");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;//this 表示
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("我叫： "+this.name+"年龄： "+this.age);
    }

    @Override //注解：代表当前方法是重写的
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class packaging {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student("qbs");
        System.out.println(student2);
        Student student3 = new Student("qbs",20);
        System.out.println(student3);

        /*student.setName("qbs");
        System.out.println(student.getName());
        System.out.println(student);*/

    }

}
