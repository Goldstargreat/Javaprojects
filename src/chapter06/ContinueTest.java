package chapter06;

public class ContinueTest {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 5 == 0){  //5의 배수를 제외하고 합계를 구하시오.
                continue;
            }
            sum += i;
        }
        System.out.println("1~100까지의 합계(5의 배수를 제외): " + sum);
    }
}
