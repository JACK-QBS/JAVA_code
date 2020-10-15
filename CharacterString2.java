package 十月;

public class CharacterString2 {


    // 逆序字符串
    public static String reverse(String str,int begin,int end) {
        char[] data = str.toCharArray(); // 字符串转字符数组
        while(begin < end) {
            char temp = data[begin];
            data[begin] = data[end];
            data[end] = temp;
            begin++;
            end--;
        }
        str = new String(data); // 字符数组转字符串
        return str;
    }
    public static void main(String[] args) {
        String str = "abcde";
        String ret = reverse(str,0,str.length()-1);
        System.out.println(ret);
    }
}
