package opgave03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private int studentNo;
    private String name;
    private final List<Integer> grades = new ArrayList<>();
    private College college;

    public Student(int studentNo, String name, College college) {
        this.studentNo = studentNo;
        this.name = name;
        this.setGroup(college);
    }

    public double getAvgGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void setGroup(College college) {
        if (this.college != college) {
            College oldCollege = this.college;
            if (oldCollege != null) {
                oldCollege.removeStudent(this);
            }
            this.college = college;
            if (college != null) {
                college.addStudent(this);
            }
        }
    }

    public int getStudentNo() {
        return studentNo;
    }

    public College getCollege() {
        return college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public void removeGrade(int index) {
        grades.remove(index);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return studentNo + ", " + name;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.studentNo, o.studentNo);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return studentNo == student.studentNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNo);
    }
}
