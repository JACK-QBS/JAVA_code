package 十月;


import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 带双引号的 放在字符串常量池
 */
public class CharacterString {

    // 字符串拆分
    public static void main(String[] args) {
        String str = "1999-07-19";
        String[] strings = str.split("-"); // 将字符串全部拆分
        for(int i = 0;i < strings.length;i++) {
            System.out.println(strings[i]);
        }

        String str2 = "hello world hello young girl";
        String[] result = str2.split(" ",4); // 以空格分割，分为4行
        for(String s:result) {
            System.out.println(s);
        }

        String str3 = "JAVA 30-split#girl";
        String[] result1 = str3.split(" |-|#"); // 用 | 来分开分割符
        for(String s:result) {
            System.out.println(s);
        }

    }

    // 字符串替换
    public static void main6(String[] args) {
        String str = "abcdeab";
        String ret = str.replaceAll("ab","gg"); // 替换所有指定内容
        System.out.println(ret);

        ret = str.replaceFirst("ab","gg"); // 替换首个内容
        System.out.println(ret);
    }


    // 字符串比较
    public static void main5(String[] args) {
        String str1 = "abcde";
        String str2 = "ABCDE";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2)); // 忽略大小写
    }


    // 字节 和 字符串 之间的转换
    public static void main4(String[] args) {
        byte[] bytes = {97,98,99,100};
        String str = new String(bytes);
        System.out.println(str);

        String str2 = "abcd";
        byte[] bytes1 = str2.getBytes();
        System.out.println(Arrays.toString(bytes1));

    }


    // 判断一个字符串中是否全部由数字组成!
    public static boolean isNumber(String str) {
        for(int i = 0; i < str.length();i++) {
            char ch = str.charAt(i);
            if(ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
    public static void main3(String[] args) {
        /*String str1 = "012345";
        String str2 = "012sdh";*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入所要判断的字符串！");
        String str = scanner.next();
        System.out.println(isNumber(str));

    }

    // 字符 和 字符串 之间的转换
    public static void main2(String[] args) {
        char[] value = {'a','b','c','d'};
        // 字符串 -》字符
        String str = new String(value);
        System.out.println("字符串： " +str);
        // offset(从哪个位置) count(偏移多少)
        String str2 = new String(value,1,2);
        System.out.println(str2);

        // 字符 - 》字符
        String str3 = "hello";
        char ch = str3.charAt(0); // 单个字符
        System.out.println(ch);
        char[] chars = str3.toCharArray(); // 整个字符串
        System.out.println(Arrays.toString(chars));

    }

    public static void main1(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // 创建字符串
        // 第一种方式：
        /*String str1 = "hello";
        String str4 = "hello";*/
        // 第二种方式：
//        String str2 = new String("hello");
        // 第三种方式：
        /*char[] value = {'a','b','c','d'};
        String str3 = new String(value);*/

        // 判断两个字符串是否相等
        // str1 的值（引用） 和 str2 的值是否一样
       /* System.out.println(str1 == str2);
        System.out.println(str1 == str4);*/
        // str1 这个引用指向的对象，和 str3 这个引用指向的对象内容 是否相同
        /*System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str2));

        String a1 = "abcdef";
        String a2 = "abefrd";*/
        // 让 a1 和 a2 比较大小
//        System.out.println(a1.compareTo(a2));

        // 字符串本身是不可修改的， 要想修改字符串只能通过反射来实现
        String str = "abcdef";
        //1、获取Class对象
        Class c1 = String.class;
        // 2、获取 value 字段
        Field field = c1.getDeclaredField("value");
        // 3、将这个字段的访问属性设为 true
        field.setAccessible(true);
        // 4、把 str 种的value 属性获取到
        char[] value = (char[]) field.get(str);
        // 5、修改 value 的值
        value[0] = 'g';
        System.out.println(str);

    }
}
