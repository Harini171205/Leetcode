class Solution {
    public double findMaxAverage(int[] arr, int k) {
    double max = Integer.MIN_VALUE;
     int sum = 0;
     if(arr.length==1)return arr[0];
     for(int i=0;i<=arr.length-k;i++)
     {
        sum =0;
        for(int j = i ;j<i+k;j++)
        {
            sum = sum+arr[j];
        }
         max = Math.max(max, (double)sum/k);
     }   
     return max;
    }
}