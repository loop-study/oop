package oo;

public class Object {
    /**
     * 챕터2, 객체 지향
     */
    public static void main(String[] args) {
        Car car = new Car("아반떼", 100);
        car.move();
    }
}

/**
 * 객체(Object)란?
 * 데이터와 데이터를 연산하는 프로시저를 함께 묶은 단위.
 *
 * 클래스가 객체라 생각할 수 있는데, 객체는 개념이고 클래스는 그 객체를 표현한 방법이다.
 */
class Car {
    String modelName;   // <-- 데이터
    int maxSpeed;       // <-- 데이터

    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    public void move() { // <-- 프로시저
        System.out.println(modelName + "가 시속 " + maxSpeed + "km로 달립니다.");
        // 프로시저는 해당 객체의 데이터에 접근이 가능하지 다른 객체의 데이터에는 접근할 수가 없다
        // 말로 설명하자면 다른 사람이 지식을 늘리기 위해 공부를 하거나, 체중감량을 위해 다이어트 해야하는데 내가 대신 해줄 순 없지 않는가.
//        System.out.println("나의 이름은 " + name);
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}


/**
 * 절차지향은 객체지향과 다르게 데이터를 다루는 프로시저가 따로 분리되어있다.
 * 데이터를 가져다와 사용한다.
 */
//class Member {
//    private String name;
//    private String benefit;
//    private Date lastLoginDate;
//
//    public Member(String name, String benefit, Date lastLoginDate) {
//        this.name = name;
//        this.benefit = benefit;
//        this.lastLoginDate = lastLoginDate;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getBenefit() {
//        return benefit;
//    }
//
//    public void setBenefit(String benefit) {
//        this.benefit = benefit;
//    }
//}
//
//// 데이터를 가져와 사용하는 모습
//class Order {
//    public void order(Member member) {
//        if ("VIP".equals(member.getBenefit())) {
//            System.out.println("배송비 3000원");
//        } else {
//            System.out.println("배송무료");
//        }
//    }
//}
//
//class Coupon {
//    public void xxCoupon(Member member) {
//        if ("VIP".equals(member.getBenefit())) {
//            System.out.println("쿠폰 2배 발급");
//        } else {
//            System.out.println("쿠폰 발급");
//        }
//    }
//}

// 위의 방식을 이제 객체지향방식으로 변경해보자.
//class Member {
//    private String name;
//    private String benefit;
//    private String address;
//
//    public Member(String name, String benefit, String address) {
//        this.name = name;
//        this.benefit = benefit;
//        this.address = address;
//    }
//
//    // ... 생략
//
//    public boolean isVip() {
//        return "VIP".equals(benefit)
//                || "서울".equals(address);
//    }
//}
//
//// 캡슐화된 기능을 호출하는 모습
//// 이전과 다르게 VIP 조건이 변경되어도 수정할 일이 없다.
//class Order {
//    public void order(Member member) {
//        if (member.isVip()) {
//            System.out.println("배송비 3000원");
//        } else {
//            System.out.println("배송무료");
//        }
//    }
//}
//
//class Coupon {
//    public void xxCoupon(Member member) {
//        if (member.isVip()) {
//            System.out.println("쿠폰 2배 발급");
//        } else {
//            System.out.println("쿠폰 발급");
//        }
//    }
//}