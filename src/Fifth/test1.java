package Fifth;

// 문제 1. Vehicle 클래스를 만든다.
//        그리고 Airplane과 Car 클래스를 만든다.
//        이때 Airplane과 Car는 Vehicle을 상속받는다.
//        내부 변수들을 출력할 수 있게 만들도록 한다.

class Vehicle {
    private int speed;
    private String color;

    public Vehicle(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public int getSpeed() {

        return speed;
    }

    public String getColor() {
        return color;
    }
}

class Airplane extends Vehicle {
    boolean boost;

    public Airplane(int speed, String color, boolean boost) {
        super(speed, color);
        this.boost = boost;
    }

    public void setBoost(boolean deter) {
        boost = deter;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "speed=" + getSpeed() +
                ",color=" + getColor() +
                "boost=" + boost +
                '}';
    }
}

class Car1 extends Vehicle {
    boolean boost;

    public Car1(int speed, String color, boolean boost) {
        super(speed, color);
        this.boost = boost;
    }

    public void setBoost(boolean deter) {
        boost = deter;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "speed=" + getSpeed() +
                ",color=" + getColor() +
                "boost=" + boost +
                '}';
    }
}

// 문제 2. 일반 학사와 석사 학생의 성적 관리 프로그램을 작성한다.
//        성적 관리시 평균과 표준편차를 계산하도록 한다.
class Score {

    private int av;
    private int de;

    int sum;

    int a [] = {30, 20, 10, 40, 50};

    public Score(int av, int de) {
        for(int cnt = 0; cnt < a[cnt]; cnt++) {
            sum = sum + a[cnt];
        }
        av = sum / 5;
        this.av = av;
        this.de = de;
        String str = String.valueOf(av);
        String str1 = String.valueOf(de);
    }

    public int getAv() {
        return av;
    }

    public int getDe() {
        return de;
    }
}


class graduate extends Score{
    boolean boost;

    public graduate(int av, int de, boolean boost) {
        super(av, de);
        this.boost = boost;
    }

    public void setBoost(boolean deter) {
        boost = deter;
    }

    @Override
    public String toString() {
        return "석사{" +
                "평균=" + getAv() +
                ", 표준편차=" + getDe() +
                "boost=" + boost +
                '}';
    }
}


public class test1 {
    public static void main(String[] args) {
        Airplane ap = new Airplane(
              200, "Black", true
        );
        System.out.println(ap);

        Car1 c1 = new Car1(
                    150, "Red", true
        );
        System.out.println(c1);

//        graduate gd = new graduate(av, "0", true
//        );
    }
}





