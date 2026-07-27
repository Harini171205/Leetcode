class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            gain[i]=sum;
            if(ans<gain[i]){
                ans = gain[i];
            }
        }
        if(ans<0) ans =0;
        return ans;
    }
}