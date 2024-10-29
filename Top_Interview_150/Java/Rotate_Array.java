package Top_Interview_150.Java;

import java.util.Arrays;

class Rotate_Array {
    // Solution: Using Three-Step Reversal method
    public void rotate(int[] nums, int k) {
        /* Step 1: Adjusting k incase k is larger than the array length
         * When rotating an array, if k (number of rotations) is greater than or equal to n (length of the array), it means that rotating the array n times brings it back to its original position. 
         * So, any rotation beyond n would essentially just be the remainder of dividing k by n.
         */
        int n = nums.length - 1;
        k = k % nums.length;

        // Step 2: Reverse the entire array
        reverse(nums, 0, n);

        // Step 3: Reverse the first k elements
        reverse(nums, 0, k-1);

        // Step 4: Reverse the remaining elements
        reverse(nums, k, n);

        System.out.println(Arrays.toString(nums));
    }

    public void reverse(int nums[], int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
            start++;
        }
    }
}

/* --- Notes ---
Time Complexity: O(n), where n is the length of the array.
    - Time to complete step 2, to swap the entire array of n elements: O(n)
    - Time to complete step 3, to swap the first k elements: O(k)
    - Time to complete step 4: to swap the remaining: O(n-k)
    - Accumulation of time: O(n) + O(n) = O(n)

Space Complexity: O(1), since we’re performing in-place modifications without additional storage. Even if the length of the array increases, we wouldn't need extra/additional space to run this algo as same 'n', 'start', 'end', 'temp' vars are used.
*/