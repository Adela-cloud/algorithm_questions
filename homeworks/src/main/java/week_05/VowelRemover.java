package week_05;


/**
 * Remove Vowels and Spaces from a String
 * Given a string str, write a method that removes the vowels 'a', 'e', 'i', 'o', 'u' and spaces from it, and returns the new string.
 <p></p>
 * Example 1:
 * Input: "write once run anywhere"
 * Output: "wrtncrnnywhr"
 <p></p>
 * Example 2:
 * Input: "everything is an object"
 * Output: "vrythngsnbjct"
 <p></p>
 * Example 3:
 * Input: "ae iou"
 * Output: ""
 <p></p>
 * Note:
 * str consists of lowercase English letters or space only.
 * 1 <= S.length <= 1000
 */

public class VowelRemover {

    //solution 1 : With StringBuilder
    //time Complexity : O(n)
    //space complexity: O(n)
    public static String removeVowelsAndSpaces(String text){
       StringBuilder   result = new StringBuilder();
       for (char ch: text.toCharArray()){
           if (ch != 'a' && ch != 'e'&& ch != 'u' && ch != 'i' && ch != 'o' && ch != ' '){
               result.append(ch);
           }
        }
       return result.toString();
    }


    // solution 2 : with regex
    public static String removeVowelsWithRegex(String text){
       return text.replaceAll("[aeiou\\s]", "");
    }


    public static void main(String[] args) {
        System.out.println(removeVowelsAndSpaces("everything is an object"));
        System.out.println(removeVowelsAndSpaces("ae iou"));

        System.out.println(removeVowelsWithRegex("everything is an object"));
        System.out.println(removeVowelsWithRegex("ae iou"));
    }
}
