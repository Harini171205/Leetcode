class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c = 0;
        char arr[] = jewels.toCharArray();
        for(char ch:arr)
        {
            for(char ch1:stones.toCharArray())
            {
                if(ch==ch1)
                {
                    c++;
                }
            }
        }
        return c;
    }
}