import java.util.ArrayList;

/**
 * Student class represents a student in the registration system.
 * Each student has a name, ID, email, and a list of enrolled courses.
 */
public class Student {
    // Student's full name
    private String name;

    // Unique student ID
    private String id;

    // Student's email address
    private String email;

    // List of course codes the student is enrolled in
    private ArrayList<String> courses;

    /**
     * Constructor to initialize student information.
     * @param name  The student's name
     * @param id    The student's unique ID
     * @param email The student's email
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.courses = new ArrayList<>();
    }

    /**
     * Retrieves the student's ID.
     * @return The student ID
     */
    public String getId() {
        return id;
    }

    /**
     * Retrieves the student's email.
     * @return The student email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Retrieves the student's name.
     * @return The student name
     */
    public String getName() {
        return name;
    }

    /**
     * Adds a course to the student's list of enrolled courses.
     * @param course The course code to add
     */
    public void addCourse(String course) {
        courses.add(course);
    }

    /**
     * Removes a course from the student's list of enrolled courses.
     * @param course The course code to remove
     */
    public void removeCourse(String course) {
        courses.remove(course);
    }

    /**
     * Retrieves the list of courses the student is enrolled in.
     * @return List of course codes
     */
    public ArrayList<String> getCourses() {
        return courses;
    }
}
