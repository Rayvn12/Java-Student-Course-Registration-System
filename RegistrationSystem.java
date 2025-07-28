import java.util.ArrayList;

/**
 * RegistrationSystem class manages all students and courses in the system.
 * Provides methods to add students/courses and retrieve current records.
 */
public class RegistrationSystem {
    // List to store all students in the system
    private ArrayList<Student> students;

    // List to store all courses in the system
    private ArrayList<Course> courses;

    /**
     * Constructor initializes empty lists for students and courses.
     */
    public RegistrationSystem() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    /**
     * Adds a new student to the registration system.
     * @param student The student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Adds a new course to the registration system.
     * @param course The course to be added
     */
    public void addCourse(Course course) {
        courses.add(course);
    }

    /**
     * Retrieves the list of all registered students.
     * @return List of students
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * Retrieves the list of all available courses.
     * @return List of courses
     */
    public ArrayList<Course> getCourses() {
        return courses;
    }
}

