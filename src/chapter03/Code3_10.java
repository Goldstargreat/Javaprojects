package chapter03;

import java.util.Scanner;

public class Code3_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //점수 입력
        System.out.println("\n====== 운전자 합격 조회 프로그램 ======\n");

        System.out.print("운전자 점수 입력");
         // 점수는 정수 형태
        int score = s.nextInt();
        String result = "";
        if (score >= 70) {
            result = "합격";
        } else  {
            result = "불합격";
        }

        System.out.println("현재 성적을 입력한 운전자는 " + result + "입니다.");//입력 받은 점수가 합격인지 불합격인지 판단

        s.close();
    }
}
