package extends1.super1;

public class Child extends Parent{
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    // this 는 자신의 타입에서 찾는거, super는 부모에서 찾는거
    public void call() {
        System.out.println("this value : " + this.value); // this 생략 가능
        System.out.println("super value : " + super.value);

        this.hello();
        super.hello();
    }
}
