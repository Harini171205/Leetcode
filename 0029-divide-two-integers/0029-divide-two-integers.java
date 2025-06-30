class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
    return Integer.MAX_VALUE;
}
        double answer = dividend/divisor;
        int ans = (int)answer;
        return ans;
    }
}