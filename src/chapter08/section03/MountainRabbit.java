package chapter08.section03;

public class MountainRabbit extends Rabbit{
    public MountainRabbit() {
        this.shape = "Sharp";
    }// 생성자에서 shape 설정


    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void run(){
        System.out.println("Mountain Rabbit이 이 산 저 산 뛰어다닌다.");
    }
}
