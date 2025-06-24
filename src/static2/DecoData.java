package static2;

public class DecoData {
    private int instanceValue; // static X
    private static int staticValue;

    public static void staticCall() {
        //instanceValue++; // 인스턴스 변수 접근, 에러
        //instanceMethod(); // 인스턴스 메서드 접근, 에러

        // 같은 클래스에 있기 때문에 호출 가능(private이어도)
        staticValue++; // 정적 변수에 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue : " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue : " + staticValue);
    }
}
