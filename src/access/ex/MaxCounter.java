package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    // 다른 패키지에서 사용 가능하게 public 사용
    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if(count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    public int getCount() {
       return count;
    }
}
