class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for(int val : nums1){
            set1.add(val);
        }
        for(int val : nums2){
            if(set1.contains(val)) res.add(val);
        }
        int result[] = new int[res.size()];
        int i =0;
        for(int val : res){
            result[i++]=val;
        }
        return result;
    }
}