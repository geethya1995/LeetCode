function removeElement(nums: number[], val: number): number {
    let k:number = 0;
    let i:number = 0;
    while(i<nums.length){
        if(nums[i] != val) {
            nums[k++] = nums[i++];
        }else{
            i++;
        }
    }
    return k;
};

/* --- To test the code ---
let num:Array<number>;
num = [0,1,2,2,3,0,4,2];
console.log(removeElement(num, 2));
*/