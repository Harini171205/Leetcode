class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for(int val : nums1){
            set1.add(val);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int val : nums2){
            set2.add(val);
        }
        set1.retainAll(set2);
        int result[] = new int[set1.size()];
        int i =0;
        for(int val : set1){
            result[i++]=val;
        }
        return result;
    }
}