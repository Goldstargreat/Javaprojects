package chapter06;

public class ForTest8 {
    public static void main(String[] args) {
        //단수별로 가로로 출력하는 구구단
        for (int i= 2; i <= 9; i++) {           // 곱하는 수 (1~9)
            for (int j = 1; j <= 9; j++) {       // 단 (2~9)
                System.out.printf("%d x %d = %d\t", i, j, i * j);
            }
            System.out.println(); // 한 줄 끝나면 줄 바꿈
        }
    }
}