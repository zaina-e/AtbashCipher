package com.example;

import java.io.IOException;

public class Decryption {
    // method to decrpyt file
    public static void DecryptonFill(String FillA, String FillB) throws IOException {
        // FillA is for input file that contains encrypted data
        // FillB is output file to store decrypted data
        String encryptedData = fileHandle.readFile(FillA);
        // Load the content of the encrypted file
        String decryptedData = Mapping.applyAtbashCipher(encryptedData);
        // Decrypt the data using Atbash cipher (Atbash is symmetric, so we use the same
        // method)
        fileHandle.writeFile(decryptedData, FillB);
        // Save the decrypted data to FillB
    }
}
