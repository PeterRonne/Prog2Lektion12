package opgave03;

import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {

        College eaaa = new College("Eaaa");

        Student anders = new Student(5, "Anders Andersen", eaaa);
        Student hans = new Student(2, "Hans Hansen", eaaa);
        Student simon = new Student(3, "Simon Hansen", eaaa);
        Student freya = new Student(9, "Freya Thorsdatter", eaaa);
        Student peter = new Student(4, "Peter Rønne", eaaa);
        Student rasmus = new Student(1, "Rasmus Skov", eaaa);
        Student gert = new Student(7, "Gert Sørensen", eaaa);
        Student emilie = new Student(8, "Emilie Petersen", eaaa);
        Student rune = new Student(6, "Rune Rask", eaaa);

        List<Student> students = eaaa.getStudents();

        System.out.println(students);

        Collections.sort(students);

        System.out.println(students);

        Collections.sort(students, new StudentComparator());

        System.out.println(students);

    }

}
