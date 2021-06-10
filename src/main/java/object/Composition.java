package object;

import java.util.EmptyStackException;
import java.util.Vector;

public class Composition {

    // 상속 대신 합성이지
}
//
//class Stack<E> extends Vector {
//
//}

//class Stack<E> {
//    private Vector<E> elements = new Vector<>();
//
//    public E push(E item) {
//        elements.addElement(item);
//        return item;
//    }
//
//    public E pop() {
//        if (elements.isEmpty()) {
//            throw new EmptyStackException();
//        }
//        return elements.remove(elements.size() - 1);
//    }
//}

// 믹스인
abstract class Run {
    public abstract void run();
}

interface Move {
    void move();
}

interface fly {
    void fly();
}

class Mixin extends Run implements Move, fly  {

    @Override
    public void run() {

    }

    @Override
    public void move() {

    }

    @Override
    public void fly() {

    }
}

interface Test extends Move, fly {
    @Override
    void move();

    @Override
    void fly();
}