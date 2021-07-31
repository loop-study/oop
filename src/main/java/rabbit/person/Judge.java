package rabbit.person;

import rabbit.person.Witness;

// 재판을 제어한다.
public class Judge {
    private Witness witness;

    public Judge(Witness witness) {
        this.witness = witness;
    }

    public void changeWitness(Witness witness) {
        this.witness = witness;
    };

    public void process() {
        System.out.println("왕 : 증언하라!");
        witness.talk();
    }
}
