package rabbit.person;

public class Alice implements Witness{
    @Override
    public void talk() {
        System.out.println("나는 Alice~ 증인으로 왔다.");
    }
}
