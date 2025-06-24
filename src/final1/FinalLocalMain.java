package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능. 이후에 할당하면 에러

        // final 지역 변수2
        final int data2 = 10;
//        data2 = 20; 컴파일 오류 남.
        method(10);
    }

    static void method(final int parameter) {
//        parameter = 20; // 이 값도 못 바꿈.
    }
}
