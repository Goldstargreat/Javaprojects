package chapter07.rabbit;

public class Rabbit {
    //속성 모양, x, y
    String shape;
    private int x;
    private int y;

    public Rabbit(){
        shape = "기본 토끼";
        x = 30;
        y = 30;
    }
    public Rabbit(String shape, int x, int y){
        this.shape = shape;
        this.x = x;
        this.y = y;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPostion(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //이동하는 기능 추가
    public void move() {
        System.out.println("토끼가 (" + x + "," + y + ") 좌표로 이동합니다.");
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "shape='" + shape + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
