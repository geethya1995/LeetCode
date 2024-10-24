function merge(nums1, m, nums2, n) {
    var i = m - 1;
    var j = n - 1;
    var k = m + n - 1;
    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k--] = nums1[i--];
        }
        else if (nums1[i] < nums2[j]) {
            nums1[k--] = nums2[j--];
        }
        else {
            nums1[k--] = nums1[i--];
        }
    }
    while (i >= 0) {
        nums1[k--] = nums1[i--];
    }
    while (j >= 0) {
        nums1[k--] = nums2[j--];
    }
    var str = nums1.toString();
    console.log(str);
};

/*
var nums1;
nums1 = [2, 3, 4, 7, 9, 0, 0, 0, 0];
var nums2;
nums2 = [1, 2, 5, 6];
merge(nums1, 5, nums2, 4);
*/
