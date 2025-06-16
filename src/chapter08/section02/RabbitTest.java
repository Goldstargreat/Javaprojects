package chapter08.section02;

public class RabbitTest {
    public static void main(String[] args) {
        HouseRabbit h1 = new HouseRabbit();
        MountainRabbit m1 = new MountainRabbit();

        h1.ownerName = "오폴리";
        // shape 필드와 move() 메소드에 private 접근제한자로 인해 서브클라스가 접근을 할 수 없음
        // super 클래스와 sub 클래스가 [같은 패키지] 내에 있을 때 접근하려면: public, default, protected 가능
        // super 클래스와 sub 클래스가 [다른 패키지] 내에 있을 때 접근하려면: public, protected 가능
        h1.shape = "그라미";
        h1.move(50,70);
        h1.eatFeed();

        m1.mountainName = "남산";
        m1.shape = "네모";
        m1.move(200,700 );
        m1.eatWildgrass();

    }
}
