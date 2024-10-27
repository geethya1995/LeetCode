package Top_Interview_150.Java;

import java.util.Arrays;

public class Remove_Duplicates_From_Sorted_Array_II {
    // Solution 1
    public int removeDuplicates(int[] nums) {
        int k = 2;
        if(nums.length <= 2){
            return nums.length;
        }
        for(int i = 2; i<nums.length; i++){
            if((nums[i] == nums[k-1]) && (nums[i] == nums[k-2])){
                continue;
            }else{
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    // Solution 2
    public int removeDuplicatesOptimized(int[] nums) {
        if (nums.length <= 2) return nums.length;
        
        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

/* --- Notes --- 
 * Both Solution 1 and 2 has the same time and space complexity, which is O(n) and O(1) respectively.
 * Both solutions modify the input array in place, using only a few additional integer variables (k and i). Thus, the space complexity is constant.
 * Solution 1 has a slightly more complex condition in the loop, which may introduce slight overhead compared to Solution 2, especially for larger arrays. This overhead arises from checking two conditions instead of just one.
*/

