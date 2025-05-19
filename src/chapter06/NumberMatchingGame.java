package chapter06;

import java.util.Scanner;

public class NumberMatchingGame {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int computerNum = 0;
        int userNum = 0;

        for(int i =1; i<=10; i++){
            computerNum = (int)(Math.random()*5 +1);
            System.out.print("게임 " + (i+1) + " 회: ");
            System.out.printf("1~5 사이의 숫자를 입력하세요. ");
            userNum = s.nextInt();

            if(computerNum == userNum)
            {
                System.out.println("축하합니다. 컴퓨터의 숫자와 일치합니다.");
                break;
            }
            else  {
                System.out.printf("컴퓨터가 생각한 숫자는 %d(이)였습니다. 다시해보세요.\n", computerNum);
                continue;
            }
        }

        System.out.println("Game over");
        s.close();
    }
}
