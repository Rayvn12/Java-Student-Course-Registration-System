import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private String email;
    private ArrayList<String> courses;

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.courses = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public ArrayList<String> getCourses() {
        return courses;
    }
}


