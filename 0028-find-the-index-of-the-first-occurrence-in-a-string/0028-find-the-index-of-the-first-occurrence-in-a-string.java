class Solution {
    public int strStr(String h, String n) {
        int l1 = h.length(), l2 = n.length();
        if (l2 == 0) return 0; 
        for (int i = 0; i <= l1 - l2; i++) {
            if (h.substring(i, i + l2).equals(n)) {
                return i;
            }
        }
        return -1;
    }
}
