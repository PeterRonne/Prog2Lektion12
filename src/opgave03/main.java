package opgave03;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        College eaaa = new College("Eaaa");
        Student anders = new Student(5,"Anders", eaaa);
        Student simon = new Student(6,"Simon", eaaa);
        Student jakob = new Student(4,"Jakob", eaaa);
        Student rasmus = new Student(3,"Rasmus", eaaa);
        Student hans = new Student(2,"Hans", eaaa);
        Student lasse = new Student(1,"Lasse", eaaa);

        Map<Integer, Student> studentRegister = eaaa.getStudents();

        StudentComparator studentComparator = new StudentComparator();
        studentComparator.compare(jakob, anders);

        Map<Integer, Student> sortedStudentRegister = new TreeMap<>();
        sortedStudentRegister.putAll(studentRegister);
        System.out.println(studentRegister);

    }
}
