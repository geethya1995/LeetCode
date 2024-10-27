function removeDuplicates(nums) {
    var k = 1;
    for (var i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i - 1]) {
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
var nums1;
nums1 = [1,1,2];
var nums2;
nums2 = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4];

removeDuplicates(nums2);
*/

