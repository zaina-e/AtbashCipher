package com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandle {
    //method to create a new and unique output file
    public static String createOutputFile(String filePath) {
        String fileName = filePath + ".txt";
        File file = new File(fileName);
    
        // If the file already exists, add a number to the file name (e.g., _1, _2, etc.)
        int count = 1;
        while (file.exists()) {
            fileName = filePath + "_" + count + ".txt";
            file = new File(fileName);
            count++;
        }
    
        return fileName;
    }
    // file handling
    // applying countermeasures: input validation
    public static boolean isPathValid(String filePath) {
        return filePath != null && filePath.matches("^[a-zA-Z0-9._\\\\/:]+$");
        // check if the file has vaild charecters using a regular exp. to check
    }

    // access control
    public static boolean hasAccess(String filePath) {
        // checking if the file exists and if the user has access to read and write to it
       
        File file = new File(filePath);
        return file.exists() && file.canRead() && file.canWrite();
    }

    // method to read file
    public static String readFile(String filePath) throws IOException {
        if (!isPathValid(filePath)) {
            System.out.println("Error! Invalid file path! please check the path and try again.");

        }
        if (!hasAccess(filePath)) {
            System.out.println("Error! You do not have access to this file!");
        }

        StringBuffer content = new StringBuffer();
        FileReader file = new FileReader(filePath);
        BufferedReader br = new BufferedReader(file);
        try {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error! Couldn't read the file. Please try again.");
        }
        return content.toString();

    }

    // method to write to file
    public static void writeFile(String content, String filePath) throws IOException {
        if (!isPathValid(filePath)) {
            System.out.println("Error! Invalid file path! please check the path and try again.");

        }
        if (!hasAccess(filePath)) {
            System.out.println("Error! You do not have access to this file!");
        }
        FileWriter file = new FileWriter(filePath);
        BufferedWriter bw = new BufferedWriter(file);
        try {
            bw.write(content);
            bw.close();

        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}
