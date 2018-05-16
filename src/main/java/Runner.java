import db.DBCourse;
import db.DBHelper;
import models.Course;
import models.CourseLevel;
import models.Student;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Course course = new Course("Time Based Art", CourseLevel.BSC);
        DBHelper.save(course);

        Student student = new Student("Bob", 18, 256, course);
        DBHelper.save(student);

        List<Student> studentsOnCourse = DBCourse.getStudents(course);
    }
}
