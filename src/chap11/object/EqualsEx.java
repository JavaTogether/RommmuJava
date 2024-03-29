package chap11.object;

import java.util.Objects;

class Student {
    int studentID;
    String studentName;

    Student (int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student)obj;
            if (studentID == std.studentID) return true;
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentID;
    }
}
public class EqualsEx {
    public static void main(String[] args) {
        String str1 = new String("test");
        String str2 = new String("test");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        Student std1 = new Student(10000, "Tomas");
        Student std2 = new Student(10000, "Tomas");

        System.out.println(std1 == std2);
        System.out.println(std1.equals(std2));

        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str1));
    }
}
