package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Testing {

    // Test 1: Performance testing
    public static void testEncryptionPerformance(String inputFile, String outputFile) throws IOException {
        //to test how much time it takes to encrypt a file
        long startTime = System.currentTimeMillis();
        Encryption.EncryptonFill(inputFile, outputFile);
        long endTime = System.currentTimeMillis();

        long duration = endTime - startTime;
        System.out.println("Encryption took: " + duration + " milliseconds");

        assert duration < 900;

    }
    public static void testDecryptionPerformance(String inputFile, String outputFile) throws IOException {
//to test how much time it takes to decrypt a file
        long startTime = System.currentTimeMillis();
        Decryption.DecryptonFill(inputFile, outputFile);
        long endTime = System.currentTimeMillis();

        long duration = endTime - startTime;
        System.out.println("Decryption took: " + duration + " milliseconds");

        assert duration < 900;

    }

    // Test 2: Function testing
    //to test if the cipher encrypts then decrypts it back to the original input
    public static void testAtbashFunctionality(String inputFile, String outputFile) throws IOException {
        String inputData = fileHandle.readFile(inputFile);
        Encryption.EncryptonFill(inputFile, outputFile);
        String temp_file = "temp.txt";
        Decryption.DecryptonFill(outputFile, temp_file);
        String decryptedData = fileHandle.readFile(temp_file);

        if (inputData.equals(decryptedData)) {
            System.out.println("Functionality Test Passed");

        } else {
            System.out.println("Oh!!! Functionality Test Failed");
        }
        //to delete the contents of the temp file in order to resue it with other tests
        new FileWriter(temp_file, false).close();
    }

    // Test 3: Integration Test
    public static void testAtbashIntegration(String inputFile, String outputFile) throws IOException {
        // this is an integration test to make sure all components work well and to make
        // sure it can handle large data
        String inputData = fileHandle.readFile(inputFile);
        Encryption.EncryptonFill(inputFile, outputFile);
        String temp_file = "temp.txt";
        Decryption.DecryptonFill(outputFile, temp_file);
        String decryptedData = fileHandle.readFile(temp_file);

        if (inputData.equals(decryptedData)) {
            System.out.println("Integration Test Passed");

        } else {
            System.out.println("Oh!!! Integration Test Failed");
        }
        //to delete the contents of the temp file in order to resue it with other tests
        new FileWriter(temp_file, false).close();
    }

    // Test 4: Unit Test
    //to make sure the code can handle variations in capitalization and symbols
    public static void unitTest(String inputFile, String outputFile) throws IOException {
        String inputData = fileHandle.readFile(inputFile);
        Encryption.EncryptonFill(inputFile, outputFile);
        String temp_file = "temp.txt";
        Decryption.DecryptonFill(outputFile, temp_file);
        String decryptedData = fileHandle.readFile(temp_file);

        if (inputData.equals(decryptedData)) {
            System.out.println("Unit Test Passed");

        } else {
            System.out.println("Oh!!! Unit Test Failed");
        }
        //to delete the contents of the temp file in order to resue it with other tests
        new FileWriter(temp_file, false).close();
    }
}
