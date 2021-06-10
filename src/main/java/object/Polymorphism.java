package object;

public class Polymorphism {
    // 12장_ 다형성
    public static void main(String[] args) {
        // 강제 다형성
        int amount = 10 + 10;
        String text = 1000 + "원";

        Lecture parent = new GradeLecture();
        GradeLecture child = new GradeLecture();
        child.run();
    }
}

// 오버로딩 다형성
//class Money {
//    public Money plus(Money amount) {...};
//    public Money plus(BigDecimal amount) {...};
//    public Money plus(long amount) {...};
//}

class Lecture {
    public void run() {
        System.out.println("부모");
    }
}

class GradeLecture extends Lecture {

    public void run2() {
        super.run();
    }
}