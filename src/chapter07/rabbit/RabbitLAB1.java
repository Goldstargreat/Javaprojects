package chapter07.rabbit;

import java.util.Scanner;

public class RabbitLAB1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Rabbit rabbit = new Rabbit();
        int x = 0; int y = 0;

        while (true) {
            System.out.print("토끼가 이동할 X 좌표를 입력하시오.");
            x = s1.nextInt();
            System.out.print("토끼가 이동할 Y 좌표를 입력하시오.");
            y = s1.nextInt();

            rabbit.setPostion(x, y);
            rabbit.move();

        }
    }
}
