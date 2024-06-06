package string_array;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.
 * The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */

public class RemoveDuplicates {

    //the array is sorted
    public static int removeDuplicate(int[] nums){
        if (nums.length == 0){
            return 0;// if there is no element, there is also no unique element
        }
        int k = 1;// counter  -> starts from 1, cuz 1st element of array is always unique
        for (int i= 1; i< nums.length; i++){// if we start from 0,when we compare the nums[0] with previous index,
                                            // throws index out of bound exception
            if (nums[i] != nums[i-1]){ //compare the index i with the previous index
                nums[k] = nums[i]; // if it is unique, paste it to kth index of nums
                k++; // move the index & increase the counter
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[]  nums1 = {1, 1, 2};
        System.out.println(removeDuplicate(nums1));

        int[] nums2= {0, 0, 1, 1, 1 , 2, 2, 3,3 ,4};
        System.out.println(removeDuplicate(nums2));
    }
}
