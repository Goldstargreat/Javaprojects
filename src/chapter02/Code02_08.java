package chapter02;

import java.sql.SQLOutput;

public class Code02_08 {
    public static void main(String[] args) {
        String str1 = "난생처음";
        String str2 = "자바";

        System.out.print(str1);
        System.out.println(str2);

        System.out.println(str1 + str2);

        String result = str1 + str2;

        System.out.println(result);
    }
}
