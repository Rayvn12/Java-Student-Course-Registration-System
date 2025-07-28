import java.util.ArrayList;

// Course class to represent a course in the registration system
public class Course {
    // Fields for course details
    private String courseName;
    private String courseCode;
    private int capacity;
    private ArrayList<Student> enrolledStudents;

    // Constructor to initialize a course
    public Course(String courseName, String courseCode, int capacity) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }

    // Getter for course name
    public String getCourseName() {
        return courseName;
    }

    // Getter for course code
    public String getCourseCode() {
        return courseCode;
    }

    // Getter for course capacity
    public int getCapacity() {
        return capacity;
    }

    // Enroll a student in the course
    public void enrollStudent(Student student) {
        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(student);
            student.addCourse(courseCode);
        } else {
            System.out.println("Course is full. Cannot enroll student.");
        }
    }

    // Remove a student from the course
    public void removeStudent(Student student) {
        if (enrolledStudents.contains(student)) {
            enrolledStudents.remove(student);
            student.removeCourse(courseCode);
        } else {
            System.out.println("Student not enrolled in this course.");
        }
    }

    // Get list of enrolled students
    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    // Get number of available seats
    public int getAvailableSeats() {
        return capacity - enrolledStudents.size();
    }
}
