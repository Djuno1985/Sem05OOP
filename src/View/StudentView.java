package View;

import Data.Student;

import java.util.ArrayList;

public class StudentView {
    public static void displayStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
