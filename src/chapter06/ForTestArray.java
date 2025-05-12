package chapter06;

public class ForTestArray {
    public static void main(String[] args) {
        String[][] teamNames = {{"김나현", "김예진", "김재영", "김지혁"}, {"김해민", "김호석", "도경진"}, {"박경구", "박준범", "박찬웅"}};

        for(int i = 0; i < teamNames.length; i++){
            System.out.print(i + 1 + "팀: ");
            for(int j = 0; i< teamNames.length; i++){
                System.out.printf("%s\t", teamNames[i][j]);
            }
            System.out.println();
        }
    }
}
