function merge(nums1: number[], m: number, nums2: number[], n: number): void {
    let i:number = m - 1;
    let j:number = n - 1;
    let k:number = m + n - 1;

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

    var str = nums1.toString();
    console.log(str);
};

/* --- To test the code ---
let nums1: Array<number>;
nums1 = [2,3,4,7,9,0,0,0,0];
let nums2: Array<number>;
nums2 = [1,2,5,6];

merge(nums1,5,nums2,4);
*/