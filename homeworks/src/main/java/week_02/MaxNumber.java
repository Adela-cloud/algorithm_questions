package week_02;

import java.util.Collections;
import java.util.List;

/**
 * find the maximum number
 */

public class MaxNumber {
    public static int maxNum(int[] nums){
        int max=0;
        for (int i=0; i< nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }


    //max and min

    //with iteration
    public static int[] getMinMax(List<Integer> list ){
        if (list == null|| list.isEmpty()) {
            throw new IllegalArgumentException("list cannot be null or empty");
        }
        int max = list.get(0);
        int min = list.get(0);
        for (int num:list) {
            if (num > max)
                max= num;
            if(num < min)
                min= num;
        }
        return new int[]{min, max};
    }



    //with collection
    //time Complexity: O(n)
    //space com: O(1)  -> even there is an array, but it uses constant amount of space for storing min and max values
    //                    so, it does not use any additional data structure that grows with the input size

    public static int[]  getMinMaxWithCollection(List<Integer>  list){
        if (list == null|| list.isEmpty()){
            throw new IllegalArgumentException("list cannot be null or empty");
        }
      return new int[]{Collections.min(list), Collections.max(list)};
    }



}
