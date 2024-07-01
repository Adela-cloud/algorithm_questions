package string_array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3

 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */

public class MajorityElement {

    //solution 1
    //TC   O(n)
    //SC   O(n)
    public static int majorityElement(int[] nums ){
        Map<Integer, Integer>   countMap= new HashMap<>();//store the element as key, and its count as value
        for (int num: nums){
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
            //if the element exists, get the value then add 1,
            // if it is not exists, set the value to 0, then add 1
        }
        for (Map.Entry<Integer, Integer> entry: countMap.entrySet()){
           if (entry.getValue() > nums.length/2)
               return entry.getKey();
        }
       throw new RuntimeException("There is no majority element");
    }


    //solution2
    //TC
    //SC
    public static int majorityElement1(int[] nums){
        int count=0;
        int candidate= nums[0];
        for (int num: nums){
            if (count == 0){
                candidate = num;
            }
            if (num == candidate)
                count++;
            else count--;
        }
        return candidate;
    }


    public static void main(String[] args) {
        int[] nums1= {3,2,3};
        int[] nums2= {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums1));
        System.out.println(majorityElement(nums2));
        System.out.println(majorityElement1(nums1));
        System.out.println(majorityElement1(nums2));

    }

}
