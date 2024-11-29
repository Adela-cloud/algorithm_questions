package kyu6_kyu5;

import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;
import java.util.List;
/**Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

 It should remove all values from list a, which are present in list b keeping their order.

 Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
 If a value is present in b, all of its occurrences must be removed from the other:

 Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */

public class SubtractArrays {

    //solution 1: with ArrayUtils class
    //time: O(mn)
    //ArrayUtils.removeAllOccurrences returns a new array with potentially fewer elements than the original
    //so the space com is O(n)
    public static int[] subtractArray(int[] a, int[]  b){
        for (int i = 0; i < b.length ; i++) {
            a = ArrayUtils.removeAllOccurrences(a, b[i]);
        }
        return a;
    }


    //solution 2: with list and stream
    //time: O(mn)  arr a -> m    arr b-> n
    //space: O(o)
    public static int[] subtractArray1(int[] a, int[] b){
        List<Integer>  listA= new java.util.ArrayList<>(Arrays.stream(a)//creates an int stream
                .boxed() //convert int stream to stream <Integer>
                .toList());// convert stream into list
        List<Integer>  listB= Arrays.stream(b).boxed().toList();

       listA.removeAll(listB);

     return listA.stream().mapToInt(e -> e )//take each object and return it in its primitive type
                .toArray();
    }


    // Solution 3: with streams
    //time complexity : O(m+n)
    //space complexity : O(1)
    public static int[] subtractArray2(int[] a, int[] b) {
        return Arrays.stream(a)
                .filter(x -> Arrays.stream(b)
                        .noneMatch(y -> y == x)) // returns boolean-> if there is no matching element y(in arr b) to x element(in arr a ), returns TRUE, then x will be included in the result stream.
                                                 //-> if there is matching element y(in arr b) to x element(in arr a ), returns FALSE, then x will be excluded from the result stream.
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(subtractArray(new int[]{2, 3, 3, 2, 1, 2, 4}, new int[]{2, 1})));
       System.out.println(Arrays.toString(subtractArray1(new int[]{2, 3, 3, 2, 1, 2, 4}, new int[]{2, 1})));
        System.out.println(Arrays.toString(subtractArray2(new int[]{2, 3, 3, 2, 1, 2, 4}, new int[]{2, 1})));
    }
}
