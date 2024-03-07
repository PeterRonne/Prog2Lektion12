package opgave03;

import java.util.ArrayList;
import java.util.List;

public class College {
    private String name;
    private final List<Student> students = new ArrayList<>();


    public College(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.setGroup(this);
        }
    }

    public void removeStudent(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            student.setGroup(null);
        }
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public double calcAvg() {
        double sum = 0;
        int studentsWithValidGrades = 0;
        for (Student student : students) {
            double studentAvg = student.getAvgGrade();
            if (studentAvg != 0) {
                sum += student.getAvgGrade();
                studentsWithValidGrades++;
            }
        }
        return sum / studentsWithValidGrades;
    }

    public Student findStudent(int studentNo) {
        for (Student student : students) {
            if (student.getStudentNo() == studentNo) {
                return student;
            }
        }
        return null;
    }
}
