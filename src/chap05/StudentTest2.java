package chap05;

public class StudentTest2 {
    public static void main(String[] args) {
        Student2 studentJames = new Student2(100, "James");
        studentJames.setKorea("국어", 100);
        studentJames.setMath("수학", 100);

        Student2 studentTomas = new Student2(101, "Tomas");
        studentJames.setKorea("국어", 80);
        studentJames.setMath("수학", 70);

        studentJames.showStudentInfo();
        studentTomas.showStudentInfo();

    }
}
