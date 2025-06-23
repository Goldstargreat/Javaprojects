package chapter08.section03;

//추상클래스
//추상클래스는 new 연산자를 이용한 객체 생성이 불가능
//추상클래스가 객체화(메모리에 할당)되어서 필드, 메서드를 사용하려면 서브클래스를 이용한다.
//sub(자녀)클래스를 통하여 객체화해서 사용한다.
//추상클라스의 용도:
// -자녀 클라스에게 특정 기능을 표준화(약속을 정함)
// -약속을 지킨 sub클라스는 부모 클라스의 필드와 메서드를 사용할 수  있음.
// 약속을 정하는 메소드: 추상메서드(abstract)
abstract public class Rabbit {
    String shape;
    int x;
    int y;

    abstract public void move(int x, int y); //추상 메서드

    public void eat(String food){
        System.out.println(shape + "Rabbit " + "eats " + food);
    }
}


