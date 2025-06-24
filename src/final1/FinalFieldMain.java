package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);

        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FIeldInit fIeldInit1 = new FIeldInit();
        FIeldInit fIeldInit2 = new FIeldInit();
        FIeldInit fIeldInit3 = new FIeldInit();
        System.out.println(fIeldInit1.value);
        System.out.println(fIeldInit2.value);
        System.out.println(fIeldInit3.value);

        // 상수에 접근
        System.out.println("상수");
        System.out.println(FIeldInit.CONST_VALUE);
    }
}
