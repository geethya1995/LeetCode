package Top_Interview_150.Java;

import java.util.Arrays;

public class Remove_Duplicates_From_Sorted_Array {

    // Solution 1: Using while loop
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int k = 0;
        while(i<nums.length){
            if(nums.length == 1){
                nums[k++] = nums[i++];
            }else if((i == nums.length-1)){
                nums[k++] = nums[i++];
            }else if(nums[i] != nums[i+1]) {
                nums[k++] = nums[i++];
            }else{
                i++;
            }
        }
        return k;
    }

    // Solution 2: 2-Pointer method
    public int removeDuplicatesSolution2(int[] nums){
        if (nums.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        } 
        return k;
    }
}

/* --- Notes --- 
 * Both Solution 1 and 2 has the same time and space complexity, which is O(n) and O(1) respectively.
 * However, solution 1 has more conditional checks within each iteration, 
 * which adds slight overhead, but doesn’t increase the overall complexity.
 * Therefore, solution 2 is more efficient in practice due to its fewer condition checks, specially for larger arrays.
 * 
*/