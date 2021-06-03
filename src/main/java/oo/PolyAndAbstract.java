package oo;

public class PolyAndAbstract {

    /**
     * 챕터3, 다형성과 추상 타입
     */
    // 상속은 한 타입을 그대로 사용하면서 구현을 추가해주는 방법을 제공
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        eagle.fly();

        Tiger tiger = new Tiger();
        tiger.move();
    }
}

/**
 * 상속은 2가지로 구분
 */

// 1. 인터페이스 상속
interface Bird {
    void fly();
}

class Eagle implements Bird {
    @Override
    public void fly() {
        System.out.println("독수리가 날다");
    }
}

// 2. 구현 상속
class Animal {
    public void move() {
        System.out.println("동물이 움직인다");
    }
}

class Tiger extends Animal {

}


/**
 * 챕터4, 재사용 : 상속보단 조립
 */
class Point {
    private int point;

    public Point(int point) {
        this.point = point;
    }

    public boolean isPointDiscount(Product product) {
        return (product.getPrice() / 10) >= point;
    }
}

class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class Order {
    private Point point;
    private Product product;

    public void order() {

        if (point.isPointDiscount(product)) {

        };
    }
}

