class Solution {
    public int subtractProductAndSum(int n) {
        int pro = 1;
        int sum = 0;
        while(n!=0)
        {
            int num= n%10;
            pro*=num;
            sum+=num;
            n/=10;
        }
        return pro -sum;
    }
}