package com.example;

import java.util.HashMap;

public class Mapping {
   
    static HashMap<Character, Character> letter_mapping = new HashMap<Character, Character>() {
        {
            put('A', 'Z');
            put('B', 'Y');
            put('C', 'X');
            put('D', 'W');
            put('E', 'V');
            put('F', 'U');
            put('G', 'T');
            put('H', 'S');
            put('I', 'R');
            put('J', 'Q');
            put('K', 'P');
            put('L', 'O');
            put('M', 'N');
            put('N', 'M');
            put('O', 'L');
            put('P', 'K');
            put('Q', 'J');
            put('R', 'I');
            put('S', 'H');
            put('T', 'G');
            put('U', 'F');
            put('V', 'E');
            put('W', 'D');
            put('X', 'C');
            put('Y', 'B');
            put('Z', 'A');
            put('a', 'z');
            put('b', 'y');
            put('c', 'x');
            put('d', 'w');
            put('e', 'v');
            put('f', 'u');
            put('g', 't');
            put('h', 's');
            put('i', 'r');
            put('j', 'q');
            put('k', 'p');
            put('l', 'o');
            put('m', 'n');
            put('n', 'm');
            put('o', 'l');
            put('p', 'k');
            put('q', 'j');
            put('r', 'i');
            put('s', 'h');
            put('t', 'g');
            put('u', 'f');
            put('v', 'e');
            put('w', 'd');
            put('x', 'c');
            put('y', 'b');
            put('z', 'a');
        }
    };

     // convert method
    public static String applyAtbashCipher(String message) {
        StringBuilder result = new StringBuilder();

        for (char letter : message.toCharArray()) {
            //if the letter is in the mapping put the other lettter
            if (letter_mapping.containsKey(letter)) {
                result.append(letter_mapping.get(letter));
            } else {
                //// if the character is not letter , such as blnak space or punctutation marks,leave it as it is
                result.append(letter);
            }
        }
        return result.toString();
    }
}
