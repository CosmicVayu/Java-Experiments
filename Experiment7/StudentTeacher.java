class Teacher {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void displayTeacherInfo() {
        System.out.println("Teacher Name: " + name + ", Subject: " + subject);
    }
}

class Student extends Teacher {
    int studentID;
    String grade;

    Student(String name, String subject, int studentID, String grade) {
        super(name, subject);
        this.studentID = studentID;
        this.grade = grade;
    }

    void displayStudentInfo() {
        displayTeacherInfo();
        System.out.println("Student ID: " + studentID + ", Grade: " + grade);
    }
}

public class StudentTeacher {

    public static void main(String[] args) {
        Student student = new Student("Alice", "Mathematics", 123, "A");
        student.displayStudentInfo();
    }
}
