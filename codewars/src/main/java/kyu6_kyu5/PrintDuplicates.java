package kyu6_kyu5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Count the number of Duplicates
 * Write a function that will return the count of distinct case-insensitive
 * alphabetic characters and numeric digits that occur more than once in the input string.
 * The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

 * Example
 * "abcde" -> 0  # no characters repeats more than once
 * "aabbcde" -> 2  # 'a' and 'b'
 * "aabBcde" -> 2  # 'a' occurs twice and 'b' twice (`b` and `B`)
 * "indivisibility" -> 1  # 'i' occurs six times
 * "Indivisibilities" -> 2  # 'i' occurs seven times and 's' occurs twice
 * "aA11" -> 2  # 'a' and '1'
 * "ABBA" -> 2  # 'A' and 'B' each occur twice
 */

public class PrintDuplicates {


    //solution1 : with map
    //time : O(n)
    //space: O(n)
    public static Map<Character, Integer>  countDuplicatesWithMap(String  text) {
        if (text == null || text.isEmpty()) {
            System.out.println(" there is no duplicated character");
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : text.toLowerCase().toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> newMap = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                newMap.put(entry.getKey(), entry.getValue());
            }
        }
        return newMap;
    }


    //solution 2 : with stream
    //time : O(n)
    //space: O(n)
    public static Map<Character, Long>  countDuplicatesWithStream(String text){
        return text.toLowerCase().chars()//converts stream into intStream that represents each character-> a-97, b-98
                .mapToObj(c-> (char) c) //  convert each int into char
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))//use the char itself as the key for grouping, count its occurrence
                .entrySet().stream()//convert the map entries for further filtering
                .filter(entry-> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        //or we can also write this in lambda: Collectors.toMap(entry-> entry.get key, entry-> entry. get value)
    }




    public static void main(String[] args) {
        System.out.println(countDuplicatesWithMap("aabbcde"));
        System.out.println(countDuplicatesWithStream("aabbcde"));
    }
}
