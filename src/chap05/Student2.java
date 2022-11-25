package chap05;

public class Student2 {
    int studentID;
    String studentName;

//    int koreaScore;
//    int mathScore;
//    String koreaSubject;
//    String matchSubject;

    Subject korea;
    Subject math;

    public Student2() {
        korea = new Subject();
        math = new Subject();
    }

    public Student2(int id, String name) {
        studentID = id;
        studentName = name;
        korea = new Subject();
        math = new Subject();
    }

    public void setKorea(String name, int score) {
        korea.setSubjectName((name));
        korea.setScore((score));

        korea.subjectName = name;
        korea.score = score;
    }

    public void setMath(String name, int score) {
        math.setSubjectName((name));
        math.setScore((score));

        math.subjectName = name;
        math.score = score;
    }

    public void showStudentInfo() {
        int total = korea.getScore() + math.getScore();
        System.out.println(total);
    }
}
