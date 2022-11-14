package chap05;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        studentLee.address = "경기도 고양시";

        studentLee.showStudentInfo();
    }
}
