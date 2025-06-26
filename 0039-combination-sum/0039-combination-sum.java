class Solution {
    public List<List<Integer>> combinationSum(int[] c, int t) {
        List<List<Integer>>mainlist = new ArrayList<>();
       List<Integer> sublist = new ArrayList<>();
       backtrack(c,t,0,mainlist,sublist);
       return mainlist;
    }
    static void backtrack(int c[],int t,int ind,List<List<Integer>> ml,List<Integer>sl){
        if(t==0){
            ml.add(new ArrayList<>(sl));
            return;
        }
        if(t<0) return;
        for(int i = ind;i<c.length;i++){
            sl.add(c[i]);
            backtrack(c,t-c[i],i,ml,sl);
            sl.remove(sl.size()-1);
        }
    }
}