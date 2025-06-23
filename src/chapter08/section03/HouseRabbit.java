package chapter08.section03;

public class HouseRabbit extends Rabbit{
    public HouseRabbit() {
        this.shape = "Round";
    }// 생성자에서 shape 설정

    @Override
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void play() {
        System.out.println("House Rabbit이 울타리 안에서 깡충깡충 뛰어다닌다.");
    }
}
