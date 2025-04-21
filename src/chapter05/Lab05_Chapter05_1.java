package chapter05;

import java.util.Calendar;
import java.util.Scanner;

public class Lab05_Chapter05_1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("****** PC방 출입 시간 제한 제어 ******* ");
        System.out.println("* 출생연도 입력(4자리 정수로): ");
        int birthYear = s1.nextInt();

        Calendar calendar = Calendar.getInstance();
        int nowyear = calendar.get(Calendar.YEAR);
        int age = nowyear - birthYear;
        String resultStr = "";

        if(age >= 18) {
        resultStr = "즐거운 시간 보내세요.";
        }else {
            resultStr = "집에 가실 시간입니다.";
        }
        System.out.println("귀하의 나이는 " + age + "세이므로 " + resultStr);
        System.out.println("협조해주어서 감사합니다.");

        s1.close();
    }
}
