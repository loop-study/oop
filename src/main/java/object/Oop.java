package object;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Oop {
    /**
     * 2장 객체지향 프로그래밍 (OOP)
     */
}

//public class Screening {
//    private Movie movie;
//    private int sequence;
//    private LocalDateTime localDateTime;
//
//    public Screening(Movie movie, int sequence, LocalDateTime localDateTime) {
//        this.movie = movie;
//        this.sequence = sequence;
//        this.localDateTime = localDateTime;
//    }
//
//    public LocalDateTime getStartTime() {
//        return localDateTime;
//    }
//
//    public boolean isSequence(int sequence) {
//        return this.sequence == sequence;
//    }
//
//    public Money getMovieFee() {
//        return movie.getFee();
//    }
//}

//public class Movie {
//    private Money fee;
//    private DiscountPolicy discountPolicy;
//
//    public Movie(Money fee, DiscountPolicy discountPolicy) {
//        this.fee = fee;
//        this.discountPolicy = discountPolicy;
//    }
//
//    public Money getFee() {
//        return fee;
//    }
//
//    public Money calculateDiscountFee(Screening screening) {
//        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
//    }
//}


// 할인 정책은 추상화를 이용하여 구현해본다.
//public abstract class DiscountPolicy {
//    private List<DiscountCondition> conditions = new ArrayList<>();
//
//    public DiscountPolicy(DiscountCondition ... conditions) {
//        this.conditions = Arrays.asList(conditions);
//    }
//
//    public Money calculateDiscountAmount(Screening screening) {
//        for(DiscountCondition each : conditions) {
//            if (each.isSatisfiedBy(screening)) {
//                return getDiscountAmount(screening);
//            }
//        }
//
//        return Money.ZERO;
//    }
//
//    abstract protected Money getDiscountAmount(Screening screening);
//}


//public class AmountDiscountPolicy extends DiscountPolicy {
//    private Money discountAmount;
//
//    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
//        super(conditions);
//        this.discountAmount = discountAmount;
//    }
//
//    @Override
//    protected Money getDiscountAmount(Screening screening) {
//        return discountAmount;
//    }
//}

// 할인 조건은 인터페이스를 사용
//public interface DiscountCondition {
//    boolean isSatisfiedBy(Screening screening);
//}
//
//public class SequenceCondition implements DiscountCondition {
//    private int sequence;
//
//    public SequenceCondition(int sequence) {
//        this.sequence = sequence;
//    }
//
//    @Override
//    public boolean isSatisfiedBy(Screening screening) {
//        return screening.isSequence(sequence);
//    }
//}
//
//public class PeriodCondition implements DiscountCondition {
//    ...
//}