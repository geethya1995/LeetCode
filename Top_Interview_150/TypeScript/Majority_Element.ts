function majorityElement(nums: number[]): number{
    let majorityElement:number = 0;
    let count:number = 0;

    for (let i:number = 0; i<nums.length; i++){
        if(count == 0){
            majorityElement = nums[i];
            count = 1;
        }else if(nums[i] == majorityElement){
            count++;
        }else{
            count--;
        }
    }
    
    // console.log(majorityElement);
    return majorityElement;
};

/* --- To test the code ---
let nums1: Array<number>;
nums1 = [3,3,3,4,2,2,3,4,3,6,3];
let nums2: Array<number>;
nums2 = [2,2,1,1,1,2,2];

majorityElement(nums1);
*/