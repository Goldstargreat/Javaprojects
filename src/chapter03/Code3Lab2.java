package chapter03;
public class Code3Lab2 {
    public static void main(String[] args) {
        int total = 0;

        total -= 900 * 10; // 삼각김밥 10개 매입
        total -= 3500 * 5; //도시락 5개 매입

        total += 1800 * 2; // 바나나맛 우유 2개 판매
        total += 4000 * 4; // 도시락 4개 판매
        total += 1500 * 1; // 콜라 1개 판매
        total += 2000 * 4; // 새우깡 4개 판매
        total += 1800 * 5; // 캔커피 5개 판매

        System.out.println("자바 편의점의 금일 총 매출액은 " + total + "원입니다.");
    }
}
