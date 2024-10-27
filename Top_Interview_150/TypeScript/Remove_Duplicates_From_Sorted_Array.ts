function removeDuplicates(nums: number[]): number {
    let k:number = 1;
    for(let i:number = 1; i<nums.length; i++){
        if(nums[i] != nums[i-1]){
            nums[k] = nums[i];
            k++;
        }
    }
    // var str = nums.toString();
    // console.log(str);
    // console.log(k);
    return k;
};

/* --- To test the code ---
let nums1: Array<number>;
nums1 = [1,1,2];
let nums2: Array<number>;
nums2 = [0,0,1,1,1,2,2,3,3,4];

removeDuplicates(nums1);
*/