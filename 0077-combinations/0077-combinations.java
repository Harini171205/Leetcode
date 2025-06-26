class Solution {
    public List<List<Integer>> combine(int n, int r) {
       List<List<Integer>>mainlist = new ArrayList<>();
       List<Integer> sublist = new ArrayList<>();
       backtrack(n,r,1,mainlist,sublist);
       return mainlist;
    }
    static void backtrack(int n,int r,int ind,List<List<Integer>> ml,List<Integer>sl){
        if(sl.size()==r){
            ml.add(new ArrayList<>(sl));
            return;
        }
        for(int i = ind;i<=n;i++){
            sl.add(i);
            backtrack(n,r,i+1,ml,sl);
            sl.remove(sl.size()-1);
        }
    }
}