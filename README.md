Atbash Cipher Program

Overview

The Atbash Cipher is a substitution cipher where each letter in the plaintext is replaced with its corresponding letter in the reversed alphabet. 
For example, 'A' becomes 'Z', 'B' becomes 'Y', and so on. This program implements the Atbash Cipher to encrypt and decrypt text.

Features

Encrypts plaintext using the Atbash Cipher.

Decrypts ciphertext using the Atbash Cipher (encryption and decryption are identical).

Handles both uppercase and lowercase letters.

Ignores non-alphabetic characters, preserving their position in the text.

Easy-to-use command-line interface.

Installation

Clone this repository:

git clone https://github.com/zaina-e/atbash-cipher.git

Navigate to the project directory:

cd atbash-cipher

Ensure you have Python installed (version 3.x recommended).

Usage

Run the script from the command line and follow the prompts to encrypt or decrypt text.

Example

python atbash_cipher.py

You will be prompted to enter text for encryption or decryption. For example:

Enter text to encrypt/decrypt: Hello, World!
Output: Svool, Dliow!

As a Module

You can also import the Atbash Cipher functions into your Python project:

from atbash_cipher import atbash_encrypt

# Encrypt text
result = atbash_encrypt("Hello, World!")
print(result)  # Outputs: Svool, Dliow!

How It Works

The Atbash Cipher works by reversing the alphabet and mapping each letter in the input text to its counterpart in the reversed alphabet. Non-alphabetic characters are not modified.

Example Transformation

Plaintext:  HELLO
Ciphertext: SVOOL

File Structure

atbash_cipher.py: Main program script.

README.md: Documentation for the program.

tests/: Directory containing test cases for the program.

Running Tests

To ensure the program functions correctly, run the provided test cases:

python -m unittest discover tests

Limitations

The program only supports English alphabets.

Non-alphabetic characters are ignored and preserved in their original positions.
