package 十月;

public class StringWork {

    // 实现按照字典序比较字符串大小
    public static void main(String[] args) {
        String str1 = "You is very cool!";
        String str2 = "This girl is very beautiful";
        System.out.println(str1.compareTo(str2));

    }


    // 判定字符串中是否包含子串
    public static void main5(String[] args) {
        String str = "This girl is beautiful!";
        System.out.println(str.contains("girl"));
    }

    // 找出字符串子串存在的位置
    public static void main4(String[] args) {
        String str = "You is very cool!";
        System.out.println(str.indexOf("cool"));
        if (str.indexOf("cool") == -1) {
            System.out.println("没有要找的子字符串！");
        }
    }


    // 替换字符串中的某个部分
    public static void main3(String[] args) {
        String str = "This girl is beautiful!";
        System.out.println(str.replaceAll("This","Every"));
    }

    // 将字符串拆分成字符串数组
    public static void main2(String[] args) {
        String str = "You are very cool!";
        String[] ret = str.split(" "); // 按空格分割
        for(String s: ret) {
            System.out.println(s);
        }

    }

    
    String str = new String("good");
    char[ ] ch = { 'a' , 'b' , 'c' };
    public void change(String str,char ch[ ]){
        str = "test ok";
        ch[0] = 'g';
    }

    public static boolean isAdmin(String userId){
        return userId.toLowerCase()=="admin";
    }

    public static void main1(String[] args) {
        StringWork ex = new StringWork();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);

        System.out.println(isAdmin("Admin"));

        String s1="abc"+"def";//1
        String s2=new String(s1);//2
        if(s1.equals(s2))//3
            System.out.println(".equals succeeded");//4
        if(s1==s2)//5
            System.out.println("==succeeded");//6

        String str1 = "abcd";
        String[] s = str1.split(" ");
    }

}


