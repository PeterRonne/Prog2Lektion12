package opgave03;

import java.util.*;

public class College {
    private String name;
    private final Map<Integer,Student> students = new LinkedHashMap<>();


    public College(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        if (!students.containsValue(student)) {
            students.put(student.getStudentNo(), student);
            student.setGroup(this);
        }
    }

    public void removeStudent(Student student) {
        if (students.containsValue(student)) {
            students.remove(student.getStudentNo());
            student.setGroup(null);
        }
    }

    public String getName() {
        return name;
    }

    public Map<Integer, Student> getStudents() {
        return students;
    }

    public double calculateAvg() {
        double sum = 0;
        int studentsWithValidGrades = 0;
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            Student student = entry.getValue();
            double studentAvg = student.getAvgGrade();
            if (studentAvg != 0) {
                sum += studentAvg;
                studentsWithValidGrades++;
            }
        }
        return sum / studentsWithValidGrades;
    }

    public Student findStudent(int studentNo) {
        return students.get(studentNo);
    }
}
