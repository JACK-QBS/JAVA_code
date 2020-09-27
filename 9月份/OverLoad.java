package test24;

/**
 * 方法的重载
 */
public class OverLoad {
    /**
     * 1、个数不同
     */
    /*public static int add (int a,int b) {
        return a + b;
    }
    public static int add (int a,int b,int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(add(a,b));
        int c = 12;
        System.out.println(add(a,b,c));
    }*/


    /**
     *2、类型不同
     */
        /*public static int add (int a,int b) {
            return a + b;
        }
        public static double add (double x,double y) {
            return x + y;
        }
        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            System.out.println(add(a,b));
            double c = 12.5;
            double d = 13.5;
            System.out.println(add(c,d));
        }*/


    /**
     * 3、顺序不同
     */
    public static double add (double a,int b) {
        return a + b;
    }
    public static double add (int x,double y) {
        return x + y;
    }
    public static void main(String[] args) {
        double a = 10.7;
        int b = 20;
        System.out.println(add(a,b));
        int c = 12;
        double d = 13.5;
        System.out.println(add(c,d));
    }


}
