package org.CS5800.Composition;

import java.util.ArrayList;
import java.util.List;

// File class
class File {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }

    // Print file name
    public void print() {
        System.out.println("File: " + fileName);
    }
}

// Folder class, which contains subfolders and files
class Folder {
    private final String folderName;
    private final List<Folder> subFolders;
    private final List<File> files;

    public Folder(String folderName) {
        this.folderName = folderName;
        this.subFolders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    // Add subfolder
    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    // Add file
    public void addFile(File file) {
        files.add(file);
    }

    // Print the folder contents recursively
    public void print() {
        System.out.println("Folder: " + folderName);
        for (File file : files) {
            file.print();
        }
        for (Folder folder : subFolders) {
            folder.print();
        }
    }

    // Simulate deletion of folder and its contents
    public void deleteFolder(Folder folder) {
        subFolders.remove(folder);
    }
}
