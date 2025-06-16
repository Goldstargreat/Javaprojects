package chapter08.section02;

public class MountainRabbit extends Rabbit{
    String mountainName;

    public MountainRabbit() {
        super();
        System.out.println("2. MountainRabbit의 생성자가 실행됨.");
    }
    void eatWildgrass(){
        System.out.println("산토끼는 풀을 먹는다.");
    }
    void printInfo() {
        System.out.println("산의 이름: " + mountainName);
        System.out.println("토끼의 모양: " + shape);
    }
}
