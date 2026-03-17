class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=0,right=n-1;
        int lm=0,rm=0;
        int ans=0;
        while(left<right)
        {
            if(height[left]<height[right])
            {
                if(lm<height[left])
                {
                    lm=height[left];
                }
                else
                {
                    ans=ans+lm-height[left];
                    ++left;
                }
            }
            else
            {
                if(rm<height[right])
                {
                    rm=height[right];
                }
                else
                {
                    ans=ans+rm-height[right];
                    --right;
                }
            }
        }
        return ans;
        
    }
}
