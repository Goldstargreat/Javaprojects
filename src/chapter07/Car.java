package chapter07;

public class Car {
        // 속성, 기능 (추상화)
        // 속성 => 필드로 표현
        // 기능 => 메서드로 표현

        // 속성
        private String name;
        private String product;
        private int price;
        private int year;
        private int cc;

        // 필드(속성) 값을 설정
        public void setName(String name){
            this.name = name;
        }
        //필드 값을 반환
        public String getName() {
            return name;
        }
        public void setProduct(String name) {
            this.product = product;
        }
        public void setCc(String name){
            this.cc = cc;
    }
    //메서드(기능)
    public void start() {
        System.out.println("시동을 건다.");
    }
    public void drive() {
        System.out.println("시속 " + speed + "로 달린다");
    }
    public void forward() {
        System.out.println("전진한다.");
    }
    public void backward() {
        System.out.println("후진한다.");
    }
    public void stop() {
        System.out.println("정차한다.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", product='" + product + '\'' +
                ", price='" + price +
                ", year=" + year +
                ", cc=" + cc +
                '}';
    }
}

