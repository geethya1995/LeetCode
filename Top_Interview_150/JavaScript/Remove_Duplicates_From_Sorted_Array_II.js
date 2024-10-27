function removeDuplicates(nums) {
    if (nums.length <= 2)
        return nums.length;
    var k = 2;
    for (var i = 2; i < nums.length; i++) {
        if (nums[i] != nums[k - 2]) {
            nums[k] = nums[i];
            k++;
        }
    }
    var str = nums.toString();
    console.log(str);
    console.log(k);
    return k;
}
;
/* --- To test the code ---
let nums1: Array<number>;
nums1 = [1,1,1,2,2,3];
let nums2: Array<number>;
nums2 = [0,0,1,1,1,1,2,3,3];

removeDuplicates(nums1);
*/
var nums2;
nums2 = [0, 0, 1, 1, 1, 1, 2, 3, 3];
removeDuplicates(nums2);
