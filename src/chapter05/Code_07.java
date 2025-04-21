package chapter05;

import java.util.Scanner;

public class Code_07 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("****** 학점 프로그램 *****");

        int score = s1.nextInt();
        String resultStr = "";

        if (score >= 90)
            resultStr = "A";
        else if (score >= 80) {
            resultStr = "B";
        } else if (score >= 70) {
            resultStr = "C";
        } else if (score >= 60) {
            resultStr = "D";
        }
        else
            resultStr= "F";

        System.out.printf("%d점은 %s 학점입니다.\n", score, resultStr);
        s1.close();
    }
}
