package chapter06;

//주사위 게임
//세 개의 주사위의 숫자를 무작위로 구하여 주사위 세 개의 숫자가 같으면 반복문을 멈추고 같은 숫자를 출력하고
// 몇 회 수행했는 지 반복횟수 출력
public class DiceGame {
    public static void main(String[] args) {
        //지역변수를 선언한다.
        int count = 0;
        int dice1;
        int dice2;
        int dice3;

        //무한루프, 반복횟수를 저장하는 변수를 1씩 증가시킨다.
        while(true){
            count++;
            // 1부터 6까지의 임의의 숫자를 생성하여 주사위 변수에 값을 하나씩 할당한다.
            // 3개의 값이 같은 지 비교한다. 같으면 반복문을 탈출한다.
            dice1 = (int)(Math.random()*6 + 1);
            dice2 = (int)(Math.random()*6 + 1);
            dice3 = (int)(Math.random()*6 + 1);

            if((dice1 == dice2) && ((dice2 == dice3)))
                break;
        }
        // 3개의 주사위의 같은 숫자, 반복횟수
        System.out.printf("3개의 주사위는 모두 숫자 %d입니다.\n", dice1); //주사위는 아무거나 넣어되 됨
        System.out.printf("3개의 주사위가 같은 숫자가 나올 때까지 %d번 던졌습니다.\n", count);


    }
}
