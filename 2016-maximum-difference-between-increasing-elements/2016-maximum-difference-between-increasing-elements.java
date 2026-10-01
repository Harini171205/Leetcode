class Solution {
    public int maximumDifference(int[] nums) {
        int max = -1;
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]<nums[i+1]){
        //         int ans = nums[i+1]-nums[i];
        //         if(max<ans) max = ans; 
        //     }
        // }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    max = Math.max(max,nums[j]-nums[i]);
                }
            }
        }
        return max;
    }
}