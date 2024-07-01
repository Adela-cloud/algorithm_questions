package string_array;

import java.util.Arrays;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 * Example 1:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4
 */

public class RotateArray {

    public static void rotate1(int[] nums, int k) {
         k = k % nums.length;
         int[]  temp= new int[nums.length];
         System.arraycopy(nums, nums.length-k, temp,0,k);
         System.arraycopy(nums, 0, temp, k, nums.length-k);
         System.arraycopy(temp, 0, nums, 0, nums.length);


    }



    public static void main(String[] args) {

       int[] nums1 = {1,2,3,4,5,6,7};
       rotate1(nums1, 4);
        System.out.println(Arrays.toString(nums1));
    }
}
