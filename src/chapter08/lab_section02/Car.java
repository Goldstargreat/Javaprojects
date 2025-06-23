package chapter08.lab_section02;

public class Car {
     private int speed;

     public int getSpeed(){
         return speed; // 현재 속도를 가져온다.
     }
     public void setSpeed(int speed){
         this.speed = speed; //속도를 설정한다.
     }
     public  void upSpeed(int speed){
         this.speed = this.speed + speed; //가속 페달을 밟는다.
     }
}
