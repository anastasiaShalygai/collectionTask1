package demo;

import student.Student;

import java.util.Map;

/**
 * Created by Anastasiya on 15.02.2017.
 */
public class Implementation {

    public static void addStudent() {
        Student student1 = new Student("Катя", 1);
        Student student2 = new Student("Саша", 2);
        Student student3 = new Student("Женя", 1);

        printMap(Student.getStudents(Student.getStudent(), 1));
    }

    private static void printMap(Map students) {
        for (Object o : students.entrySet()) {
            Map.Entry value = (Map.Entry) o;
            System.out.println(value.getValue());
        }
    }
}
