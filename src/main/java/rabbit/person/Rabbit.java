package rabbit.person;

public class Rabbit implements Witness{
    @Override
    public void talk() {
        System.out.println("나는 Rabbit~ 증인으로 왔다.");
    }
}
