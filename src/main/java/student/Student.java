package student;

import java.util.*;

/**
 * Created by Anastasiya on 15.02.2017.
 */
public class Student {
    private String name;
    private int course;
    private static List<Student> students = new ArrayList<Student>();

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
        students.add(Student.this);
    }

    private int getCourse() {
        return course;
    }

    private String getName() {
        return name;
    }

    public static List<Student> getStudent() {
        return students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + course;
        return result;
    }

    public static Map getStudents(List students, int course) {
        Map<Student, String> mapStudents = new HashMap<Student, String>();
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student temp = iterator.next();
            if (temp.getCourse() == course) {
                mapStudents.put(temp, temp.getName());
            }
        }
        return mapStudents;
    }
}
