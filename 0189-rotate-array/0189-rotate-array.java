class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int temp[] = new int[k];
        if(k>n)
        {
            k = k%n;
        }
        for(int i=0;i<k;i++)
        {
            temp[i]= nums[n-k+i];
        }
        for(int i=n-1;i>=k;i--)
        {
            nums[i]=nums[i-k];
        }
        for(int i=0;i<k;i++)
        {
            nums[i]=temp[i];
        }
    }
}