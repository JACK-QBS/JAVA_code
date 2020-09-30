package test24;

import java.util.Arrays;

public class Array2 {

    /**
     * 交换两个数字得使用引用，若是基本数据类型，则改变形参的大小不能改变实参的大小
     * @param array 用来存放交换的两个基本类型的数组
     * @return
     */
    /*public static int[] swap (int[] array ) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
        return array;
    }
    public static void main(String[] args) {
        int[] array = {10,20};
        System.out.println(Arrays.toString(array));
        swap(array);
        System.out.println(Arrays.toString(array));
    }*/




    /**
     * 实现一个 Arrays.toString 的功能方法
     * 参数的判断是必不可少的
     * @param array
     * @return
     */
    /*public static String myString(int[] array) {
        if(array == null) {
            return null;
        }
        if(array.length == 0) {
            return "[]";
        }
        String ret = "[";
        for(int i = 0;i < array.length;i++) {
            if(i != array.length - 1){
                ret += array[i] + ", ";
            }else {
                ret += array[i]+"]";
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        //int[] array = {1,2,3,4,5};
        int[] array = null;
        String str = Arrays.toString(array);
        System.out.println(str);

        String ret = myString(array);
        System.out.println(ret);
    }*/




    /**
     * 数组拷贝
     * @param args
     */
    //方法1： for 循坏
    /*public static int[] copy1(int[] array) {
        int[] array2 = new int[array.length];
        System.out.println(Arrays.toString(array2));
        for(int i = 0;i< array2.length;i++) {
            array2[i] = array[i];
        }
        return array2;
    }*/
   /* public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        //方法 4
        int[] ret = array.clone();
        System.out.println(Arrays.toString(ret));


        //方法 3  最快
        *//**
         * public static native void arraycopy(Object var0, int var1, Object var2, int var3, int var4)
         * native : 说明此方法是一个本地方法
         * var0 : 源数组
         * var1 : 源数组的 1 位置开始拷贝
         * var2 : 拷贝到的目的数组
         * var3 : 拷贝到的目的数组的 1 位置
         * var4 : 拷贝多长
         *//*
        *//*int[] ret = new int[array.length];
        System.arraycopy(array,0,ret,0,array.length);
        System.out.println(Arrays.toString(ret));*//*

        // 方法2  要调用方法 3
        *//*int[] ret = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(ret));*//*

        *//* 方法1
        int[] ret = copy1(array);
        System.out.println(Arrays.toString(ret));*//*
    }
*/


    /**
     * 求数组中的最大值 、 平均值  、
     * @param args
     */
    public static int max(int[] array) {
        if(array == null || array.length == 0) {
            return -1;//标识的作用
        }
        int maxnum = 0;
        for(int i = 0;i < array.length;i++){
            //(maxnum < array[i]) ? (maxnum = array[i]) : maxnum;
            if(maxnum < array[i]) {
                maxnum = array[i];
            }
        }
        return maxnum;
    }
    public static double avg(int[] array) {
        if(array == null || array.length == 0) {
            return -1;//标识的作用
        }
        int sum = 0;
        for(int i = 0;i < array.length;i++) {
            sum += array[i];
        }
        return (double)(sum/array.length);
    }
    // 找出数组中的具体的某个数，并返回下标,
    //效率慢
    /*public static int findIndex(int[] array,int key) {
        if(array == null || array.length == 0) {
            return -1;
        }
        for(int i = 0;i < array.length;i++) {
            if(array[i] == key) {
                return i+1;
            }
        }
        return -1;// 表示没找到
    }*/
    // 二分算法 折半查找 适合顺序数组
    public static int findIndex(int[] array,int key) {
        if(array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length -1;
        while(left <= right) {
            int mid = (left+right)/2;
            if(key == array[mid]) {
                return mid;
            }
            if(key < array[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println("最大值是： "+max(array));
        System.out.println("平均值是： "+avg(array));
        int key = 4;
        int index = findIndex(array,key);
        System.out.println(index);
    }

}
