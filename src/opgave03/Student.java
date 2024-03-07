package opgave03;

import java.util.ArrayList;
import java.util.List;

public class Student {
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
        return "Student{" + "StudentNo=" + studentNo + ", name='" + name + '\'' + ", grades=" + grades + '}';
    }


}
