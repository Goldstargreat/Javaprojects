package chapter06;

public class ForTest9 {
    public static void main(String[] args) {
// 단수별로 세로로 출력하는 구구단
        for (int j = 1; j <= 9; j++) {        // 곱해지는 수 (행 1~9)
            for (int i = 2; i <= 9; i++) {    // 단 (열 2~9)
                System.out.printf("%d x %d = %d\t", j, i, i * j);
            }
            System.out.println(); // 각 줄 끝에서 줄 바꿈
        }
    }
}



