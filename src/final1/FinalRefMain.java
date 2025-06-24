package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // final을 참조형으로 써서 한번만 사용 가능
        // data = new Data();

        // 참조 대상 값은 변경 가능.
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);

    }
}
