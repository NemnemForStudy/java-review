package poly.ex3;

public abstract class AbstractAnimal {
    // 반드시 오버라이딩 해야함.
    // 바디 부분이 없고 바디 부분을 만들면 에러가 남.
    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
