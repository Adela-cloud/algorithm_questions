package week_30;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * Example 1: Example 2:
 * Input: nums = [2,2,1] Output: 1 Input: nums = [4,1,2,1,2] Output: 4
 * Example 3:
 * Input: nums = [1] Output: 1
 */

public class SingleNumber {


    //with set
    public static int singleNum(int[] nums){
        Set<Integer>  set= new HashSet<>();
        for (int num: nums) {
            if (!set.add(num)){
                set.remove(num);
            }
        }
        return set.iterator().next();
    }


    //with sort
    public static int singleNumWithSort(int[] nums){
        Arrays.sort(nums);
        for (int i=0; i < nums.length; i+=2){
            if (nums[i] != nums[i+1])
                return nums[i];
        }
        return nums[nums.length-1];
    }


    public static void main(String[] args) {


    int[]  arr= {4,1,2,1,2};
    int[]  arr1= {2,2,1};
    int[]  arr2= {1};

        System.out.println(singleNum(arr));
        System.out.println(singleNum(arr1));
        System.out.println(singleNum(arr2));

        System.out.println(singleNumWithSort(arr));
        System.out.println(singleNumWithSort(arr1));
        System.out.println(singleNumWithSort(arr2));


   }
}
