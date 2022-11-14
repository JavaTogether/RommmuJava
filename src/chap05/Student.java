package chap05;

public class Student {
    int studentId;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo() {
        System.out.println(studentName + ", " + address);
    }

    /*public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        studentLee.address = "경기도 고양시";

        studentLee.showStudentInfo();
    }*/
}

