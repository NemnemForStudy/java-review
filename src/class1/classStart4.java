package class1;

public class classStart4 {

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

        // 배열 몇개 만들지 정해줘야함.
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;
        
        System.out.println("이름 : " + students[0].name + " 나이 : " + students[0].age + " 성적 : " + students[0].grade);
        System.out.println("이름 : " + students[1].name + " 나이 : " + students[1].age + " 성적 : " + students[1].grade);
    }
}
