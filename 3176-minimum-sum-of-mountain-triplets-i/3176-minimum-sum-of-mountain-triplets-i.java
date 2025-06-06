class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i =0 ;i<n-2;i++)
        {
            for(int j = i+1 ;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if((nums[i]<nums[j] )&& (nums[k]<nums[j]))
                    {
                        int min_sum = nums[i]+nums[j]+nums[k];
                        if(min_sum<min)
                        {
                           min = min_sum;
                        }
                    }
                }
            }
            
        }
        if(min!= Integer.MAX_VALUE)
        {
        return min;
        }
        else{
            return -1;
        }
    }
}