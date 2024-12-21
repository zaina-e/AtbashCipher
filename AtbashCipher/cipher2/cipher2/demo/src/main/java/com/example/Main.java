package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // initilaize paths for files
        String inputFile = "C:\\Users\\zaina\\Desktop\\AtbashCipher\\cipher2\\cipher2\\demo\\src\\input.txt";
        
        //enter your desired path in between the paranthesees 
        String outputFile = fileHandle.createOutputFile("C:\\Users\\zaina\\Desktop\\AtbashCipher\\cipher2\\cipher2\\demo\\src\\output");
        
        String IntegrationTest = "C:\\Users\\zaina\\Desktop\\AtbashCipher\\cipher2\\cipher2\\demo\\src\\IntegrationTest.txt";
        String UnitTest = "C:\\Users\\zaina\\Desktop\\AtbashCipher\\cipher2\\cipher2\\demo\\src\\UnitTest.txt";

        System.out.println("#################################################");
        System.out.println("#          Welcome to the Atbash Cipher!         #");
        System.out.println("#################################################");

        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║ ~> To encrypt a text file, please type 'e'.     ║");
        System.out.println("╚════════════════════════════════════════════════╝");

        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║ ~> To decrypt a text file, please type 'd'.     ║");
        System.out.println("╚════════════════════════════════════════════════╝");

        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║ ~> To test the functionality of the cipher,     ║");
        System.out.println("║     please type 't'.                           ║");
        System.out.println("╚════════════════════════════════════════════════╝");

        try (Scanner scan = new Scanner(System.in)) {
            String input = scan.nextLine();
            if (input.toLowerCase().equals("e")) {
                System.out.println("*************************************************");
                System.out.println("*      Enter the file path you want to encrypt:  *");
                System.out.println("*************************************************");
                String encrypt = scan.nextLine();
                Encryption.EncryptonFill(encrypt, outputFile);
                System.out
                        .println("\n[Success] The input has been encrypted successfully and written to: " + outputFile
                                + "\n");
                Testing.testEncryptionPerformance(encrypt, outputFile);
            } else if (input.toLowerCase().equals("d")) {
                System.out.println("*************************************************");
                System.out.println("*      Enter the file path you want to decrypt:  *");
                System.out.println("*************************************************");
                String decrypt = scan.nextLine();
                Decryption.DecryptonFill(decrypt, outputFile);
                System.out
                        .println("\n[Success] The input has been decrypted successfully and written to: " + outputFile);
                        Testing.testDecryptionPerformance(decrypt, outputFile);
            } else if (input.toLowerCase().equals("t")) {
                System.out.println("======================================");
                System.out.println("           Performance Test           ");
                System.out.println("  (Testing how quickly the cipher encrypts) ");
                System.out.println("======================================");
                Testing.testEncryptionPerformance(inputFile, outputFile);
                Testing.testDecryptionPerformance(inputFile, outputFile);

                System.out.println("\n======================================");
                System.out.println("          Functionality Test          ");
                System.out.println(" (Verifying the cipher produces correct output) ");
                System.out.println("======================================");
                Testing.testAtbashFunctionality(inputFile, outputFile);

                System.out.println("\n======================================");
                System.out.println("           Integration Test           ");
                System.out.println("  (Checking if the cipher can handle large data) ");
                System.out.println("======================================");
                Testing.testAtbashIntegration(IntegrationTest, outputFile);

                System.out.println("\n======================================");
                System.out.println("             Unit Test                ");
                System.out.println(" (Testing the cipher's handling of character variation) ");
                System.out.println("======================================");
                Testing.unitTest(UnitTest, outputFile);
            } else {
                System.out.println("Invalid input! Please try again and enter either 'e' or 'd' or 't'");
            }
        }
    }

}