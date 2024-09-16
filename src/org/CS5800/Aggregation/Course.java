package org.CS5800.Aggregation;

// Course class which aggregates Instructor and Textbook
public class Course {
    private String courseName;
    private final Instructor instructor1;
    private final Instructor instructor2; // Support for two instructors
    private final Textbook textbook1;
    private final Textbook textbook2;     // Support for two textbooks

    public Course(String courseName, Instructor instructor1, Instructor instructor2, Textbook textbook1, Textbook textbook2) {
        this.courseName = courseName;
        this.instructor1 = instructor1;
        this.instructor2 = instructor2;
        this.textbook1 = textbook1;
        this.textbook2 = textbook2;
    }

    // Getters and Setters
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    // Print method to display the course info, instructors, and textbooks
    public void printCourseInfo() {
        System.out.println("Course: " + getCourseName());  // Use getter
        instructor1.printInstructorInfo();
        instructor2.printInstructorInfo();
        textbook1.printTextbookInfo();
        textbook2.printTextbookInfo();
    }
}