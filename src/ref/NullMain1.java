package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data : " + data); // null
        data = new Data();
        System.out.println("2. data : " + data); // 이러면 참조값이 생겨서 참조값이 나온다.(new를 했기 때문)
        data = null;
        System.out.println("3. data : " + data); // null
    }
}