package object;

public class test8 {
    /*public static void main(String[] args) {
        A a0 = new A();
        A a1 = new B();
        A a2 = new C();
    }*/


    public static void main(String[] args) {
        System.out.println(new B().getValue());
    }
    static class A{
        protected int value;
        public A(int v) {
            setValue(v);
        }
        public void setValue(int value) {
            this.value = value;
        }
        public int getValue() {
            try {
                value++;
                return value;
            } catch (Exception e) {
                System.out.println(e.toString());
            } finally {
                this.setValue(value);
                System.out.println(value);
            }
            return value;
        }
    }
    static class B extends A {
        public B(){
            super(5);
            setValue(getValue()-3);
        }
        public void setValue(int value) {
            super.setValue(2*value);
        }
    }


    /*static int cnt = 6;
    static{
        cnt += 9;
    }
    public static void main(String[] args){
        System.out.println("cnt=" +cnt);
    }
    static {
        cnt/=3;
    };*/


}


/*
class A {}
class B extends A {}
class C extends B {}*/
