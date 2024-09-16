package org.CS5800.Composition;

// Driver Program
public class FileSystemTest {
    public static void main(String[] args) {
        // Create folders and files
        Folder phpDemo1 = new Folder("php_demo1");
        Folder sourceFiles = new Folder("Source Files");
        Folder publicFolder = new Folder("public");
        Folder appFolder = new Folder("app");

        File indexPhp = new File("index.php");
        File readmeMd = new File("README.md");
        File configPhp = new File("config.php");

        // Build the folder structure
        phpDemo1.addFile(indexPhp);
        phpDemo1.addFile(readmeMd);
        phpDemo1.addSubFolder(sourceFiles);
        sourceFiles.addFile(configPhp);
        phpDemo1.addSubFolder(publicFolder);
        phpDemo1.addSubFolder(appFolder);

        // Print initial folder structure
        System.out.println("Initial Folder Structure:");
        phpDemo1.print();

        // Delete app folder and print structure again
        phpDemo1.deleteFolder(appFolder);
        System.out.println("\nAfter Deleting 'app' Folder:");
        phpDemo1.print();

        // Delete public folder and print structure again
        phpDemo1.deleteFolder(publicFolder);
        System.out.println("\nAfter Deleting 'public' Folder:");
        phpDemo1.print();
    }
}
