class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pro = 1;
        int pre[] = new int[n];
        int suf[] = new int[n];
        pre[0] = 1;
        suf[n-1]=1;
        for(int i =1;i<n;i++)
        {
            pro*=nums[i-1];
            pre[i]=pro; 
        }
        pro = 1;
        for(int i = n-2; i>=0;i--)
        {
            pro*=nums[i+1];
            suf[i]=pro; 
        }
        for(int i =0;i<n;i++)
        {
            nums[i]= pre[i]*suf[i];
        }
        return nums;
    }
}