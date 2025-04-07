package chapter03;

import java.util.Scanner;

public class Code3_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double pound;
        double kg;

        System.out.print("Enter pound.(파운드를 입력하세요.): ");
        pound = s.nextDouble();
        kg = pound * 0.45;
        System.out.printf(pound + "파운드(lb)는 " + kg + "kg입니다.\n");

        System.out.print("Enter kg.(킬로그램을 입력하세요.): ");
        pound = s.nextDouble();
        kg = pound * 0.45;
        System.out.printf(pound + "킬로그램(kg)은 " + kg + "kg입니다.");

        s.close();
    }
}
