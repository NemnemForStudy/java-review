package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        // 단 자식 기능 호출 X, 컴파일 오류 발생

        // 다운캐스팅(부모 타입 -> 자식 타입)
        // Child child = (Child) poly;
        // child.childMethod();

        // 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod(); // 다운캐스팅을 통해 부모타입을 자식 타입으로 변환 후 기능을 호출
    }
}
