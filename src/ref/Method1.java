package ref;

public class Method1 {
    public static void main(String[] args) {
        Student st1 = createStudent("학생1", 15, 90);
        Student st2 = createStudent("학생2", 16, 80);

        printStudent(st1);
        printStudent(st2);
    }

    // 메소드를 호출하면 student를 만들고 만들어진 name, age, grade 값을 세팅 후 참조값 반환.
    static Student createStudent(String name, int age, int grade) {
        Student st = new Student();
        st.name = name;
        st.age = age;
        st.grade = grade;
        return st;
    }

    static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
    }
}
