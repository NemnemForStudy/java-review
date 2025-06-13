package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        // 다른 위치에 있는 것을 사용하기 위한다면
        pack.a.User user = new pack.a.User();
    }
}
