package poly.basic;

// Upcasting VS downCasting
public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = child; // 업캐스팅은 (Parent) 생략이 가능, 생략 권장함.
        Parent parent2 = child; // 업캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
