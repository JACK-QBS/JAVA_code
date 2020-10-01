package test24;

import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

public class ArrayWork {

    /**
     * 给定一个整型数组, 实现冒泡排序(升序排序)
     * @param args
     */
   /* public static int[] sort(int[] array) {
        for(int i = 0;i < array.length -1;i++) {
            if(array[i] > array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {31,23,235,43,36};
        int[] ret = sort(array);
        System.out.println(Arrays.toString(ret));
    }*/




    /**
     * 给定一个整型数组, 判定数组是否有序（递增）
     * @param args
     */
    /*public static void decide(int[] array) {
        int ret = 1;
        for(int i = 0;i < array.length-1;i++) {
            if(array[i] > array[i+1]) {
                System.out.println("该数组不是有序的");
                ret = -1;
                break;
            }
        }
        if(ret == 1) {
            System.out.println("该数组是有序的,且是递增的");
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,7,4,5};
        decide(array);
    }*/




    /**
     * 给定一个有序整型数组, 实现二分查找
     * @param args
     */
    /*public static int find(int[] array,int key) {
        if(array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length-1;
        while(left <= right) {
            int mid = (left+right)/2;
            if(key == array[mid]) {
                return mid+1;
            }
            if(key < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int key = 3;
        if(find(array,key) != -1) {
            System.out.println("要查找的数字在第 " + find(array, key) + " 位");
        } else {
            System.out.println("所给数组有问题，或者是数组中找不到所要找的数字");
        }
    }*/





    /**
     * 实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
     * @param args
     */
    /*public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(ret));
    }*/




    /**
     * 实现一个方法 toString, 把一个整型数组转换成字符串.
     * 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
     * @param args
     */
    public static String myString(int[] array) {
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
        int[] array = {1,2,3,4,5};
        String ret = myString(array);
        System.out.println(ret);
    }

}
