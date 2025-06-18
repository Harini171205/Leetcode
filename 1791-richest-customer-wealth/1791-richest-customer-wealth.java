class Solution {
    public int maximumWealth(int[][] a) {
        int sum = 0,temp=0;
        for(int i =0;i<a.length;i++)
        {
            sum=0;
            for(int val:a[i])
            {
                sum+=val;
            }
            temp = Math.max(temp,sum);
        }
        return temp;
    }
}