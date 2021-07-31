package rabbit;

import rabbit.person.Alice;
import rabbit.person.Judge;
import rabbit.person.Rabbit;

public class Judgment {

    public static void main(String[] args) {
        Judge judge = new Judge(new Rabbit());
        judge.process();

        judge.changeWitness(new Alice());
        judge.process();
    }
}
