package test24;


import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

/**
 * 交换两个整型数组的内容
 */
public class packageExercise {
    public static void swap(int[] a,int[] b) {
        for(int i = 0;i < a.length;i++) {
            int temp = a[i];
            a[i] = b[i];
            b[i] = temp;

        }
        System.out.println("交换后：");
        System.out.println("a[]: "+Arrays.toString(a));
        System.out.println("b[]: "+Arrays.toString(b));
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {6,4,32,34,6};
        System.out.println("交换前：");
        System.out.println("a[]: "+Arrays.toString(a));
        System.out.println("b[]: "+Arrays.toString(b));
        swap(a,b);
    }
}





/**
 * 把所有的奇数放在偶数后面
 */
/*public class packageExercise {
    public static int[] swap(int[] array) {
        int left = 0;
        int right = array.length-1;
        while(left < right) {
            while(left < right && array[left] % 2 == 0) {
                left++;
            }
            while(left < right && array[right] % 2 != 0) {
                right--;
            }
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = swap(array);
        System.out.println(Arrays.toString(ret));
    }
}*/


/*public class Person{
    private String name = "Person";
    int age=0;
}
public class packageExercise extends Person{
    public String grade;
    public static void main(String[] args){
        Person p = new packageExercise();
        System.out.println(p.name);
    }
}*/


/*
class Test{
    public String toString() {
        System.out.print("aaa");
        return "bbb";
    }
}
public class packageExercise {
    public static void main(String[] args) {
        System.out.println(new Test());
    }
*/



    /*static int cnt = 6;
    static{
        cnt += 9;
    }
    public static void main(String[] args){
        System.out.println("cnt =" + cnt);
    }
    static{
        cnt /=3;
    }*/



    /*private int count;
    public static void main(String[] args) {
        packageExercise test=new packageExercise(88);
        System.out.println(test.count);
    }
    packageExercise(int a) {
        count=a;
    }*/



    /*private static int x = 100;
    public static void main(String[] args) {
        packageExercise hsl = new packageExercise();// 4
        hsl.x++;
        packageExercise hs2 = new packageExercise();// 6
        hs2.x++;
        hsl = new packageExercise();// 8
        hsl.x++;// 9
        packageExercise.x--;
        System.out.println(" x=" + x);
    }*/
//}