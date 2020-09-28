package test24;

import java.util.Arrays;

public class ArrayExercises {

    /**
     * 求数组的平均值
     * 实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
     */
    /*public static double avg (int[] array) {
        double sum = 0;
        for(int i = 0;i < array.length;i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(avg(array));
    }*/


    /**
     * 数组所有元素之和
     * 实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
     */
    /*public static int sum (int[] array) {
        int sum = 0;
        for (int x:array) {
            sum += x;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(sum(array));
    }*/


    /**
     * 改变原有数组元素的值
     * 实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
     * 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
     */
    /*public static int[] transform(int[] array) {
        for (int i = 0;i< array.length;i++) {
            array[i] *= 2;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3};
        transform(array);
        System.out.println(Arrays.toString(array));
    }*/


    /**
     * 打印数组
     * 实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
     */
    /*public static void printArray (int[] array) {
        for(int x:array) {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3};
        printArray(array);
    }*/


    /**
     * 创建的数组，并且赋初始值
     * 创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
     */
    public static int[] setNum (int[] array) {
        for(int i = 0;i < array.length;i++) {
            array[i] = i+1;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = new int[100];
        setNum(array);
        System.out.println(Arrays.toString(array));
    }


}
