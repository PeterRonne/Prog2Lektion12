package opgave03;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student student;
    private College college;

    @BeforeEach
    void setUp() {
        college = new College("Eaaa");
        student = new Student(1,"Peter", college);
        student.addGrade(7);
        student.addGrade(4);
        student.addGrade(12);
    }

    @Test
    void getAvgGrade() {
        //Arrange
        double expected = 7.6;
        //Act
        double actual = student.getAvgGrade();

        //Assert
        assertEquals(expected, actual, 0.1);
    }

    @Test
    void setGroup() {
        //Arrange
        Student newStudent = new Student(1, "Hans Hansen", null);
        College Eaaa = new College("Eaaa");
        //Act
        newStudent.setGroup(Eaaa);
        //Assert
        assertTrue(Eaaa.getStudents().contains(newStudent));
        assertEquals(Eaaa, newStudent.getCollege());
    }

    @Test
    void addGrade() {
        //Arrange
        int expected = student.getGrades().size() + 1;
        //Act
        student.addGrade(10);
        int actual = student.getGrades().size();
        //Assert
        assertEquals(expected, actual);
        student.removeGrade(student.getGrades().size() - 1);
    }

    @Test
    void equals() {
        //Arrange
        Student student1 = new Student(1,"Peter2", college);
        Student student2 = new Student(2,"Simon", college);

        //Act
        boolean studentEqualsTrue = this.student.equals(student1);
        boolean studentEqualsFalse = this.student.equals(student2);

        //Assert
        assertTrue(studentEqualsTrue);
        assertFalse(studentEqualsFalse);
    }
}