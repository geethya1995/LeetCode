package Top_Interview_150.Java;

import java.util.Arrays;

public class Remove_Element {

    // Time complexit - O(2N) due to the while loop + sort func
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int k = 0;
        while(i<nums.length){
            if(nums[i] == val) {
                nums[i++] = 101;
                k++;
            }else{
                i++;
            }
        }
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        return (nums.length - k);
    }

    // Time complexit - O(N) 
    public int removeElementOptimized(int[] nums, int val) {
        int i = 0;
        int k = 0;
        while(i<nums.length){
            if(nums[i] != val) {
                nums[k++] = nums[i++];
            }else{
                i++;
            }
        }
        // System.out.println(Arrays.toString(nums));
        return k;
    }
}
