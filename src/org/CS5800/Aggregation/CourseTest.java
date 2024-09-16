package org.CS5800.Aggregation;

// Driver Program
class CourseTest {
    public static void main(String[] args) {
        // Creating Instructor and Textbook objects
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("Jane", "Doe", "4-1010"); // Additional Instructor
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Design Patterns", "Erich Gamma", "Addison-Wesley"); // Additional Textbook

        // Creating Course object with multiple instructors and textbooks
        Course course = new Course("CS5800", instructor1, instructor2, textbook1, textbook2);

        // Print the course information
        course.printCourseInfo();
    }
}
