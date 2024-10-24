function removeElement(nums, val) {
    var k = 0;
    var i = 0;
    while (i < nums.length) {
        if (nums[i] != val) {
            nums[k++] = nums[i++];
        }
        else {
            i++;
        }
    }
    return k;
};

/* --- To test the code ---
var num;
num = [0, 1, 2, 2, 3, 0, 4, 2];
console.log(removeElement(num, 2));
*/
