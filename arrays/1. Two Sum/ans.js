const twoSum = function(nums, target) {
    let output=[];
    for(let i=0;i<nums.length;i++){
        for(let j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                output.push(i,j)
                return output
            }
        }
        return null // should handle this
    }
}

console.log(twoSum([2,7,11,15],9));