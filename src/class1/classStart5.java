package class1;

public class classStart5 {

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

        Student[] students = new Student[] {student1, student2};

        for(int i = 0; i < students.length; i++) {
            System.out.println("이름 : " + students[i].name + " 나이 : " + students[i].age + " 성적 : " + students[i].grade);
        }

        for(int i = 0; i < students.length; i++) {
            // 변수명을 줄여주는 거임.
            Student s = students[i];
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }

        // for - each 문.
        for(Student s : students) {
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }
    }
}
