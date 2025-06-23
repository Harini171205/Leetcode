class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";

        boolean isNegative = num < 0;
        num = Math.abs(num);
        String r = "";

        while (num != 0) {
            r = (num % 7) + r;
            num /= 7;
        }

        return isNegative ? "-" + r : r;
    }
}
