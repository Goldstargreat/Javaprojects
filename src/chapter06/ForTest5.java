package chapter06;

public class ForTest5 {
    //500에서 1000 사이의 짝수의 합계를 구하시오.
    public static void main(String[] args) {
        int n = 1000;
        int sum = 0;
        String number = "짝수";
//        for(int i = 500; i<=1000; i++) {
//            if (i % 2 == 0) {
//                sum += i;  //복합대입연산자를 쓰는 게 더 빠를 수 있다.
//                number = "짝수";
//            }
//        }
        for (int i = 500; i <= n; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }

        System.out.println("1~" + n + "까지의 " + number + "의 합계는 " + sum + "이다.");
    }
}
