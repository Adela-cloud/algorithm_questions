package kyu7_kyu8;

import java.util.Arrays;

/**
 * Create a function which accepts one arbitrary string as an argument, and return a string of length 26.
 * The objective is to set each of the 26 characters of the output string to either '1' or '0'
 * based on the fact whether the Nth letter of the alphabet is present in the input (independent of its case).
 * So if an 'a' or an 'A' appears anywhere in the input string (any number of times), set the first character of the output string to '1', otherwise to '0'.
 * if 'b' or 'B' appears in the string,set the second character to '1', and so on for the rest of the alphabet.
 * For instance:
 * "a   **&  cZ"  =>  "10100000000000000000000001"
 */


public class LetterSearchFromString {


    //solution 1 :
    //time: O(n)
    //space:O(1) -> fixed array size
    public static String searchLetter(String input){
        char[]   result= new char[26];
        Arrays.fill(result, '0');

        for (char  ch: input.toLowerCase().toCharArray()){
            if(ch >= 'a' && ch <= 'z' ){
                result[ch- 'a'] = '1';
            }
        }
         return Arrays.toString(result);
    }


    //solution 2 : with bitset
    /*Bit Set is a special Java class that implements a vector of bits that grows as needed
            Each bit can be true (1) or false (0)
    Uses approximately 1 bit per boolean value, much more efficient than using a boolean array
    Internal implementation uses an array of long primitives

BitSet.set(int index): Sets the bit at specified index to true
            BitSet.get(int index): Returns the value of the bit at specified index
    Step-by-Step Breakdown*/

    public String alphabetPresence(String input) {
        // Create a BitSet with 26 bits (one for each letter)
        java.util.BitSet bitSet = new java.util.BitSet(26);

        // Process each character in the input string
        for (char c : input.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                bitSet.set(c - 'a');
            }
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            result.append(bitSet.get(i) ? '1' : '0');
        }

        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(searchLetter("a   **&  cZ"));
    }
}
