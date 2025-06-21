class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        int len = fb.length;
        for(int i =0;i<len;i++)
        {
            if(fb[i]==0 && (i==0||fb[i-1] == 0) && (i==len-1 || fb[i+1]==0) )
            {
                fb[i]=1;
                i++;
                n--;
                if(n==0) return true;
            }
        }
        return n<=0;
    }
}