package kyu6_kyu5;

import java.util.*;

public class countDuplicatesString {
    public static int duplicateCount1(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        text = text.toLowerCase();
        // Create array to count each character's occurrence
        // characters a-z(0-25) may occur 0-9 times (26-35)
        int[] counts = new int[36];
        // Count occurrences of each character
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                counts[c - 'a']++;
            } else if (Character.isDigit(c)) {
                counts[c - '0' + 26]++;
            }
        }
        // Count characters that appear more than once
        int duplicates = 0;
        for (int count : counts) {
            if (count > 1) {
                duplicates++;
            }
        }

        return duplicates;
    }



    //solution2 : with map and stream
    //more efficient
    public static int duplicateCount2(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : text.toLowerCase().toCharArray()) {
            map.put(ch, map.containsKey(ch)? 1: 0);
        }

        return (int)map.values().stream().filter(e-> e>0).count();
    }


    //solution 3 -- with stream
    public static int duplicateCount3(String text){
        List<String> list= Arrays.asList(text.toLowerCase().split(""));
        return (int)list.stream().filter(ch-> Collections.frequency(list, ch)>1)
                .distinct().count();
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount1("aabbcde"));
        System.out.println(duplicateCount2("aabbcde"));
        System.out.println(duplicateCount3("aabbcde"));
    }

}
