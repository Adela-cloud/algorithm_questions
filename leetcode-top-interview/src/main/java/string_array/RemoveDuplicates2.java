package string_array;

/**
 Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that
 each unique element appears at most twice. The relative order of the elements should be kept the same.
 Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
 More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
 It does not matter what you leave beyond the first k elements.
 Return k after placing the final result in the first k slots of nums.
 Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 */

public class RemoveDuplicates2 {

    //sorted array
    //time: O(n)
    //space: O(1)
    public static int removeDuplicates(int[]  nums){
        if (nums.length == 0){
            return 0;
        }
        int k = 1; // unique element counter
        int count = 1;// each element counter
        for(int i = 1; i < nums.length ; i++){
            if (nums[i] == nums[i-1]){
                if (count<2){
                    nums[k]= nums[i];
                    count++;
                    k++;
                }
            }else {
                nums [k]= nums[i];//k start from 1, because index 0 is always unique
                k++;//this increase the number of unique elements, and the index number to insert that unique element
                count =1;
            }
        }
     return k;
    }

    public static void main(String[] args) {
        int[]   nums1= {1,1,1,2,2,3};
        int[]   nums2= {0,0,1,1,1,1,2,3,3};

        System.out.println(removeDuplicates(nums1));
        System.out.println(removeDuplicates(nums2));

    }
}
