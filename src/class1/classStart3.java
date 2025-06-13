package class1;

public class classStart3 {

    public static void main(String[] args) {
        Student student1;

        // 학생을 실제 메모리에 만듦.
        student1 = new Student();
        student1.name = "Nemnem";
        student1.age = 28;
        student1.grade = 30;

        Student student2  = new Student();
        student2.name = "haha";
        student2.age = 20;
        student2.grade = 10;

        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.grade);
    }
}
