import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Course {
    private String courseCode;
    private String title;
    private String description;
    private int capacity;
    private int enrolledStudents;

    public Course(String courseCode, String title, String description, int capacity) {
        this.courseCode = courseCode;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.enrolledStudents = 0;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAvailableSlots() {
        return capacity - enrolledStudents;
    }

    public boolean registerStudent() {
        if (enrolledStudents < capacity) {
            enrolledStudents++;
            return true;
        }
        return false;
    }

    public void removeStudent() {
        if (enrolledStudents > 0) {
            enrolledStudents--;
        }
    }

    @Override
    public String toString() {
        return String.format("Code: %s, Title: %s, Description: %s, Available Slots: %d",
                courseCode, title, description, getAvailableSlots());
    }
}

class Student {
    private String studentId;
    private String name;
    private List<Course> registeredCourses;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public boolean registerCourse(Course course) {
        if (course.registerStudent()) {
            registeredCourses.add(course);
            return true;
        }
        return false;
    }

    public boolean dropCourse(Course course) {
        if (registeredCourses.remove(course)) {
            course.removeStudent();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Registered Courses: %s",
                studentId, name, registeredCourses);
    }
}

public class CourseManagementSystem {
    private Map<String, Course> courseDatabase;
    private Map<String, Student> studentDatabase;
    private Scanner scanner;

    public CourseManagementSystem() {
        courseDatabase = new HashMap<>();
        studentDatabase = new HashMap<>();
        scanner = new Scanner(System.in);
        initializeData();
    }

    private void initializeData() {
        // Sample data
        courseDatabase.put("CS101", new Course("CS101", "Intro to Computer Science", "Basic course on computer science", 30));
        courseDatabase.put("MATH101", new Course("MATH101", "Calculus I", "Introduction to calculus", 25));

        studentDatabase.put("S001", new Student("S001", "John Doe"));
        studentDatabase.put("S002", new Student("S002", "Jane Smith"));
    }

    private void displayCourses() {
        System.out.println("Available Courses:");
        for (Course course : courseDatabase.values()) {
            System.out.println(course);
        }
    }

    private void registerStudent() {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        Student student = studentDatabase.get(studentId);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();
        Course course = courseDatabase.get(courseCode);
        if (course == null) {
            System.out.println("Course not found.");
            return;
        }

        if (student.registerCourse(course)) {
            System.out.println("Successfully registered for " + course.getTitle());
        } else {
            System.out.println("Failed to register for course. It might be full.");
        }
    }

    private void dropCourse() {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        Student student = studentDatabase.get(studentId);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter Course Code to Drop: ");
        String courseCode = scanner.nextLine();
        Course course = courseDatabase.get(courseCode);
        if (course == null) {
            System.out.println("Course not found.");
            return;
        }

        if (student.dropCourse(course)) {
            System.out.println("Successfully dropped " + course.getTitle());
        } else {
            System.out.println("Failed to drop course. You might not be registered for it.");
        }
    }

    private void run() {
        while (true) {
            System.out.println("\n1. Display Courses");
            System.out.println("2. Register for a Course");
            System.out.println("3. Drop a Course");
            System.out.println("4. Exit");

            System.out.println("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    displayCourses();
                    break;
                case "2":
                    registerStudent();
                    break;
                case "3":
                    dropCourse();
                    break;
                case "4":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        CourseManagementSystem system = new CourseManagementSystem();
        system.run();
    }
}

