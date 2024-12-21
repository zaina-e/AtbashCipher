package com.example;

import java.io.IOException;

public class Encryption {
    // method to encrypt the file with letters
    public static void EncryptonFill(String FillA, String FillB) throws IOException {
        // contant method for encryption
        // FillA is for input fill come from user to encryption
        // FillB is output to decrption
        // use throws IOException
        // this method for handel read and write errors for encrypton and deycrption
        String data = fileHandle.readFile(FillA);
        // it is calld handler to data to read the contect
        String encryptedData = Mapping.applyAtbashCipher(data);
        // it will store the encrypted content ouyput
        fileHandle.writeFile(encryptedData, FillB);
        // it is calld Savefill from handler use for reuslt to fillb
    }
}
