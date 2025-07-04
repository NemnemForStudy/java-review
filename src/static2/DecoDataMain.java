package static2;

import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData decoData1 = new DecoData();
        decoData1.instanceCall();

        System.out.println("2. 인스턴스 호출2");
        DecoData decoData2 = new DecoData();
        decoData2.instanceCall();

        // 추가
        // 인스턴스를 통한 접근
        DecoData decoData3 = new DecoData();
        decoData3.staticCall();

        // 클래스를 통한 접근
        staticCall();
    }
}
