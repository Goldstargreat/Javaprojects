package chapter08.section03;

public class RabbitTest {
    public static void main(String[] args) {
//        Rabbit rabbit = new Rabbit();  //추상클래스는 new 연산자 안 됨.
        HouseRabbit h = new HouseRabbit();
        MountainRabbit m = new MountainRabbit();

        h.move(10 , 20);
        m.move(1000 , 2000);

        m.run();
        h.play();

        h.eat("grass");
        m.eat("fruits");

    }
}
