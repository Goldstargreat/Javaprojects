package chapter03;
import java.util.Scanner;

public class BMI_Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("\n===== bmi(체질량지수) Program =====");
        System.out.println("몸무게를 입력하십시오.: ");
        double weight = s.nextDouble();

        System.out.println("* 키(cm) 입력: ");
        double height = s.nextDouble();

       double bmi = weight/Math.pow(height/100, 2);

        System.out.printf("당신은 체중이 %.2f kg이고, 키는 %.2f cm이므로, bmi 지수는 %.2f(kg/m^2)입니다.\n", weight, height, bmi);
        s.close();
    }
}
