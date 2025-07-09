package poly.ex4;

public class Dog extends AbstractAnimal {

    // 불안정한 메서드를 자식이 구현했음.
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("망망이 이동");
    }
}
