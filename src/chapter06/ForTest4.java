package chapter06;

public class ForTest4 {
    public static void main(String[] args) {
        int n = 1000;
        int sum =0;
        String oddEven = "";
        for(int i = 1; i<=10; i++) {
            if (i % 2 != 0) {
                sum += i;  //복합대입연산자를 쓰는 게 더 빠를 수 있다.
                oddEven = "홀수";
            }
        }
//        System.out.println("1~" + n + "까지의 합계는 " + sum + "이다.");
        System.out.println("1~" + n + "까지의 " + oddEven + "의 합계는 " + sum + "이다.");
    }
}
