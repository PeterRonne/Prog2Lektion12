package opgave03;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CollegeTest {
    private College Eaaa;

    @BeforeAll
    void setUp() {
        Eaaa = new College("Eaaa");
        Student peter = new Student(1,"Peter", Eaaa);
        peter.addGrade(10);
        peter.addGrade(12);
        peter.addGrade(2);
        Eaaa.addStudent(peter);

        Student hans = new Student(2,"Hans", Eaaa);
        hans.addGrade(10);
        hans.addGrade(7);
        Eaaa.addStudent(hans);

        Student gert = new Student(3,"Gert", Eaaa);
        gert.addGrade(2);
        Eaaa.addStudent(gert);
    }

    @Test
    void addStudent() {
        // Arrange
        Student student = new Student(4,"Simon" , null);
        int expected = Eaaa.getStudents().size() + 1;

        //Act
        Eaaa.addStudent(student);
        int actual = Eaaa.getStudents().size();
        //Assert
        assertTrue(Eaaa.getStudents().containsValue(student));
        assertEquals(expected, actual);
        assertEquals(Eaaa, student.getCollege());

        Eaaa.removeStudent(student);
        assertEquals(null, student.getCollege());
    }

    @Test
    void removeStudent() {
        // Arrange
        College Eaaa = new College("Eaaa");
        Student student = new Student(1, "Jens", Eaaa);

        // Act
        Eaaa.removeStudent(student);
        // Assert
        assertFalse(Eaaa.getStudents().containsValue(student));
        assertEquals(null, student.getCollege());
    }

    @Test
    void calcAvg() {
        //Arrange
        double expected = 6.166;
        //Act
        double actual = Eaaa.calculateAvg();
        //Assert
        assertEquals(expected,actual, 0.001);
    }

    @Test
    void findStudent() {
        // Arrange
        Student magnus = new Student(4, "Magnus", Eaaa);
        Eaaa.addStudent(magnus);
        // Act
        Student student = Eaaa.findStudent(4);
        // Assert
        assertEquals(magnus, student);

        Eaaa.removeStudent(magnus);
    }
}