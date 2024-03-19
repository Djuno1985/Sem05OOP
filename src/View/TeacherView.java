package View;

import Data.Teacher;

import java.util.ArrayList;

public class TeacherView {
    public static void displayTeachers(ArrayList<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
