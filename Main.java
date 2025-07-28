import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistrationSystem system = new RegistrationSystem();

        while (true) {
            System.out.println("\n==== Course Registration System ====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll Student in Course");
            System.out.println("4. Drop Student from Course");
            System.out.println("5. View All Students");
            System.out.println("6. View All Courses");
            System.out.println("7. View Courses of a Student");
            System.out.println("8. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter student email: ");
                    String email = scanner.nextLine();
                    Student newStudent = new Student(name, id, email);
                    system.addStudent(newStudent);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter course name: ");
                    String courseName = scanner.nextLine();
                    System.out.print("Enter course code: ");
                    String courseCode = scanner.nextLine();
                    System.out.print("Enter course capacity: ");
                    int capacity = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    Course newCourse = new Course(courseName, courseCode, capacity);
                    system.addCourse(newCourse);
                    System.out.println("Course added successfully.");
                    break;

                case 3:
                    System.out.print("Enter student ID to enroll: ");
                    String enrollId = scanner.nextLine();
                    System.out.print("Enter course code: ");
                    String enrollCode = scanner.nextLine();
                    Student studentToEnroll = findStudentById(system.getStudents(), enrollId);
                    Course courseToEnroll = findCourseByCode(system.getCourses(), enrollCode);
                    if (studentToEnroll != null && courseToEnroll != null) {
                        courseToEnroll.enrollStudent(studentToEnroll);
                    } else {
                        System.out.println("Invalid student ID or course code.");
                    }
                    break;

                case 4:
                    System.out.print("Enter student ID to drop: ");
                    String dropId = scanner.nextLine();
                    System.out.print("Enter course code: ");
                    String dropCode = scanner.nextLine();
                    Student studentToDrop = findStudentById(system.getStudents(), dropId);
                    Course courseToDrop = findCourseByCode(system.getCourses(), dropCode);
                    if (studentToDrop != null && courseToDrop != null) {
                        courseToDrop.removeStudent(studentToDrop);
                    } else {
                        System.out.println("Invalid student ID or course code.");
                    }
                    break;

                case 5:
                    System.out.println("All Students:");
                    for (Student s : system.getStudents()) {
                        System.out.println("- " + s.getName() + " (ID: " + s.getId() + ")");
                    }
                    break;

                case 6:
                    System.out.println("All Courses:");
                    for (Course c : system.getCourses()) {
                        System.out.println("- " + c.getCourseName() + " (" + c.getCourseCode() + "), Available Seats: " + c.getAvailableSeats());
                    }
                    break;

                case 7:
                    System.out.print("Enter student ID: ");
                    String lookupId = scanner.nextLine();
                    Student targetStudent = findStudentById(system.getStudents(), lookupId);
                    if (targetStudent != null) {
                        System.out.println(targetStudent.getName() + " is enrolled in:");
                        for (String course : targetStudent.getCourses()) {
                            System.out.println("- " + course);
                        }
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 8:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Helper method to find a student by ID
    public static Student findStudentById(ArrayList<Student> students, String id) {
        for (Student s : students) {
            if (s.getId().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }

    // Helper method to find a course by course code
    public static Course findCourseByCode(ArrayList<Course> courses, String code) {
        for (Course c : courses) {
            if (c.getCourseCode().equalsIgnoreCase(code)) {
                return c;
            }
        }
        return null;
    }
}

