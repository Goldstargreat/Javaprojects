package chapter06;

public class ForTest {
    public static void main(String[] args) {
        String[] names = {"소원", "예린", "유주", "은하", "신비", "엄지", "gfriend"}; //구성원의 수가 늘어나도 변함없음

       for(int i=0; i< names.length; i++){
           System.out.println(names[i] + ": 서울정수캠퍼스 인공지능소프트웨어");
       }
    }
}
