package Question;

public class Qeustion5 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        System.out.println("넓이 : " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이 : " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부 : " + rectangle.isSquare());

        // 아래처럼도 할 수 있고 위 처럼 할 수도 있다.
//        System.out.println("넓이 : " + rectangle.calculateArea());
//        System.out.println("둘레 길이 : " + rectangle.calculatePerimeter());
//        System.out.println("정사각형 여부 : " + rectangle.isSquare());
    }
}
