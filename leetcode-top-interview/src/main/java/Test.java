public class Test {
    /**
     * How do you remove all occurrences of a given character from an input string in Java?
     */

    public static String removingChars(String str, Character c) {
        String newStr = "";
        //     char[]  charArr= str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != c) {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "Java";
        System.out.println(removingChars(str, 'a'));
    }
}
