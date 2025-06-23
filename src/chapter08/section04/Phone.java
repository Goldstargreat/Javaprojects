package chapter08.section04;
//<인터페이스>
//new 연산자로 객체 생성 불가능
// 필드: 상수, 메서드: 추상메서드(예외적으로 default 키워드를 붙여서 메서드를 구현할 수도 있다.)
// 인터페이스와 용도:
// -약속(추상메서드)을 정해놓고 약속을 지킨 클라스만 만들 수 있다.
// - 공동작업으로 프로젝트 시행 시 사용 빈도가 높다. : 메서드 이름, 반환형, 매개변수 중간에 수정이나 삭제를 함부로 하지
// 못하게 하려는 것이다.
// 인터페이스를 상속 받은 클래스는 추상 메서드 이외에 일반적인 다른 메서드도 구현할 수 있다.

public interface Phone {
    //인터페이스의 필드는 상수로만 사용이 가능하다; 항상 같은 값을 갖는 필드
    // Static final 키워드가 생략이 가능하다.
    String name = "phone";
    //인터페이스는 public과 abstract를 생략할 수 있다.
    void callPhone(String phoneNumber);
    public abstract void receivePhone(String phoneNumber);
}
