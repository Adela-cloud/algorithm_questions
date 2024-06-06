package string_array;
import java.util.Arrays;

/**You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 representing the number of elements in nums1 and nums2 respectively.
 Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 The final sorted array should not be returned by the function, but instead be stored inside the array nums1.To accommodate this, nums1 has a length of m + n,
 where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class MergeSortedArrays {


    //solution 1
    //time: O(m+n)log(m+n)
    //space: O(m+n)
    public static int[] mergeArrays(int[] nums1, int m, int[] nums2, int n){
        int[] newArr= new int[m+n];
        System.arraycopy(nums1, 0, newArr, 0 , m);//we will copy m element from index 0 of nums1 to newArr
        System.arraycopy(nums2, 0, newArr, m, n);//paste n elements to newArr from index m of newArr.
        Arrays.sort(newArr);
        nums1= newArr;

        return nums1;
    }

    //solution2
    //time : O(m+n)
    //space: O(1)
    public static void mergeArrays1(int[] nums1, int m,  int[] nums2,int n ) {
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);//if nums1 is empty, paste the elements from nums2
            return;
        }
        if (n == 0) {//it just returns nums1[], and it is already sorted
            return;
        }

        int i = m - 1;//last index of nums1;
        int j = n - 1;
        int k = (n + m) - 1; //last index of new array;
        while (i >= 0 && j >= 0) {//iterate till the index 0
            if (nums1[i] > nums2[j]){ //add the bigger one to the end of nums[1]
                nums1[k--] = nums1[i--]; //move to the previous index
            }else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j > 0){//if there is still elements left in nums2
            nums1[k--] = nums2[j--];
        }
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        System.out.println("solution1: "+ Arrays.toString(mergeArrays(nums1, m, nums2, n)));
        mergeArrays1(nums1, m, nums2, n);
        System.out.println("solution2: " + Arrays.toString(nums1));


        int[] nums3 = {0};
        int[] nums4 = {1};
        int m1 = 0;
        int n1 = 1;
        System.out.println("solution1: "+Arrays.toString(mergeArrays(nums3, m1, nums4, n1)));
        mergeArrays1(nums3, m1, nums4, n1);
        System.out.println("solution2: " + Arrays.toString(nums3));

      /* this one is not working for solution2
        int[]  nums5= {2,0};
        int[]  nums6= {1};
        int m2=1;
        int n2=1;
        System.out.println(Arrays.toString(mergeArrays(nums5, m2, nums6, n2)));
        mergeArrays1(nums5, m, nums6, n);
        System.out.println("solution2: "+ Arrays.toString( nums6));
    */
    }
}
