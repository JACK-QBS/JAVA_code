package test24;

import java.util.Arrays;

/**
 * 数组： 存放一组相同数据类型的集合
 * java 中的数组不管咋写 都是在堆上开辟内存
 */
public class Array {


    /*public static void print (int[] array1) {
        for(int i = 0;i < array1.length;i++){
            array1 [0] = 999;
            System.out.print(array1[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        print(array1);
        for(int i = 0;i < array1.length;i++) {
            System.out.print(array1[i]+" ");
        }
*/


//        int[] array2 = new int[4];  // 动态定义
//        int[] array3 = new int[]{1,2,3,4};
        /*for(int i = 0;i < array1.length;i++){  //  1、 for 类型
            System.out.print(array1[i]+" ");
    }
        System.out.println();

        for (int x: array1) {  //  2、 foreach 结构
            System.out.print(x +" ");
        }
        System.out.println();

        //  3、 将数组以字符串的形式输出
        *//*String str = Arrays.toString(array1);
        System.out.println(str);*//*
        System.out.println(Arrays.toString(array1));
*/

    //异常处理：
       /* for(int i = 0;i < array1.length;i++) { //  i <= array1.length   边界溢出
            System.out.print(array1[i]+" ");
        }
        array1 = null; // 空指针异常
                       //当至为空的时候，原来的对象就会被GC自动回收
        System.out.println(array1.length);*/

    //}


    public static int[] compute(int[] array) {
        /*for (int x:array) {
            x *= 2;
        }*/
        int[] temp = new int[array.length];
        for(int i = 0;i < array.length;i++) {

            temp[i] = array[i] * 2;

        }
        return temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] temp = compute(array);
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(array));
    }

}
