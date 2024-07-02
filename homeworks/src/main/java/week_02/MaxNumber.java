package week_02;

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
}
