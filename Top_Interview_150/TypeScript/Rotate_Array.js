function rotate(nums, k) {
    // Solution: Using Three-Step Reversal method
    /* Step 1: Adjusting k incase k is larger than the array length
    * When rotating an array, if k (number of rotations) is greater than or equal to n (length of the array), it means that rotating the array n times brings it back to its original position.
    * So, any rotation beyond n would essentially just be the remainder of dividing k by n.
    */
    var n = nums.length;
    k = k % n;
    // Step 2: Reverse the entire array
    reverse(nums, 0, n - 1);
    // Step 3: Reverse the first k elements
    reverse(nums, 0, k - 1);
    // Step 4: Reverse the remaining elements
    reverse(nums, k, n - 1);
    var str = nums.toString();
    console.log(str);
}
function reverse(nums, start, end) {
    while (start < end) {
        var temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}

/* --- To test the code ---
let nums1: Array<number>;
nums1 = [1,2,3,4,5,6,7];
let nums2: Array<number>;
nums2 = [-1,-100,3,99];

rotate(nums1, 3);
*/

/* --- Notes ---
Time Complexity: O(n), where n is the length of the array.
    - Time to complete step 2, to swap the entire array of n elements: O(n)
    - Time to complete step 3, to swap the first k elements: O(k)
    - Time to complete step 4: to swap the remaining: O(n-k)
    - Accumulation of time: O(n) + O(n) = O(n)

Space Complexity: O(1), since we’re performing in-place modifications without additional storage. Even if the length of the array increases, we wouldn't need extra/additional space to run this algo as same 'n', 'start', 'end', 'temp' vars are used.
*/ 
