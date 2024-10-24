package Top_Interview_150.Java;

import java.util.Arrays;

public class Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        int i = m-1;
        int j = n-1;

        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else if(nums1[i] < nums2[j]){
                nums1[k--] = nums2[j--];
            }else{
                nums1[k--] = nums1[i--];
            }
        }

        while(i>=0){
            nums1[k--] = nums1[i--];
        }

        while(j>=0){
            nums1[k--] = nums2[j--];
        }

        System.out.println(Arrays.toString(nums1));     //Testing purposes
    }
}


/* ---- Notes ----
 * 1. Time complexity - O(N+M)
 * 2. Space complexity - O(1)
 */