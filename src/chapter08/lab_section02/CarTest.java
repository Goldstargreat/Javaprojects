package chapter08.lab_section02;
import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int axelSpeed = 0;
    SchoolBus schoolBus = new SchoolBus();
    SportsCar sportsCar = new SportsCar();

    while(true){
        System.out.println("Enter axel Speed(-1: quit) : ");
        axelSpeed = s.nextInt();
        //입력값이 -1이 입력되면 반복문을 탈출한다.
        if(axelSpeed == -1){
            System.out.println("자동차가 멈춥니다.");
            break;
          }
        schoolBus.upSpeed(axelSpeed);
        sportsCar.upSpeed(axelSpeed);

        System.out.println("** 스쿨 버스의 현재 속도: " + schoolBus.getSpeed());
        System.out.println("** 스포츠카의 현재 속도: " + sportsCar.getSpeed());
        }
    }
}
