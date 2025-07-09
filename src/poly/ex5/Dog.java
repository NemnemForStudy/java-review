package poly.ex5;

public class Dog implements InterfaceAnimal{
    @Override
    public void move() {
        System.out.println("망망이 이동");
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
