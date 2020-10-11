package test24;

/*class A{}
class B extends A{}
class C extends B{}*/


/*class Base {
    Base() {
        System.out.print("Base");
    }
}*/


/*class Base{
    public Base(String s){
        System.out.print("B");
    }
}*/


/*class X{
    Y y=new Y();
    public X(){
        System.out.print("X");
    }
}
class Y{
    public Y(){
        System.out.print("Y");
    }
}*/


class B {
    public int Func() {
        System.out.print("B");
        return 0;
    }
}
class D extends B {
    @Override
    public int Func() {
        System.out.print("D");
        return 0;
    }
}

public class ooTest {
    /*public ooTest (String s) {
        super("C");
        System.out.print("D");
    }*/


    /*Y y=new Y();
    public ooTest(){
        System.out.print("Z");
    }*/

    public static void main(String[] args) {

        B a = new B();
        B b = new D();
        a.Func();
        b.Func();

//        new ooTest();

//        new ooTest("C");


        /*new ooTest();
        //调用父类无参的构造方法
        new Base();*/

        /*A a0=new A();
        A a1=new B();
        A a2=new C();*/
    }
}
