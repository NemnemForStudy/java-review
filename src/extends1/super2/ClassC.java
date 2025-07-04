package extends1.super2;

public class ClassC extends ClassB{
    public ClassC() {
        super(10, 20); // B는 생성자를 직접 정의했기 때문에 불가함. 그래서 직접 정의해야함.
        System.out.println("ClassC 생성자");
    }
}
