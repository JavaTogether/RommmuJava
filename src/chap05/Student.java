package chap05;

public class Student {
    int studentId;
    String studentName;
    int grade;
    String address;

    public Student() {

    }
    public Student(int id, String name) {
        studentId = id;
        studentName = name;
    }

    public void showStudentInfo() {
        System.out.println(studentName + ", " + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        studentLee.studentId = 100;
        studentLee.address = "여의도";
        studentLee.showStudentInfo();

        Student studentJoo = new Student();
        studentJoo.studentName = "주영빈";
        studentJoo.studentId = 101;
        studentJoo.address = "경기도 고양시";
        studentJoo.showStudentInfo();

        System.out.println(studentLee);
        System.out.println(studentJoo);
    }
}

