package com.company;

import java.sql.SQLException;

public class test {
    public static void main(String[] args) {
        System.out.println(test1(1));
    }

    public static int test1(int i) {
        try {
            if (i == 0)
                throw new SQLException();
            if (i == 1)
                return 1;
            if (i == 2)
                throw new ArrayIndexOutOfBoundsException();

        } catch (SQLException e) {
            throw new RuntimeException("1");
        } catch (Exception e) {
            throw new RuntimeException("2");
        } finally {
            // 这里一般不写 return 
            //return 2;
        }
        return 0;// 不管 return 还是抛异常，方法有返回值，一定要把所有逻辑分支覆盖完整
    }
}
