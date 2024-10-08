package org.CS5800.Aggregation;

// Textbook class
public class Textbook {
    private String title;
    private String author;
    private String publisher;

    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    // Print method to display textbook info
    public void printTextbookInfo() {
        System.out.println("Textbook: " + getTitle() + " by " + getAuthor() + ", Publisher: " + getPublisher());  // Use getters
    }
}
