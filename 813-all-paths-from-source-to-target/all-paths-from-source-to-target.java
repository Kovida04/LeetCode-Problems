class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
       int target=graph.length-1;
       List<List<Integer>> res = new ArrayList<>();
       List<Integer> path = new ArrayList<>();
       path.add(0);
       dfs (0,res,path,graph,target);
       return res; 
    }
    public void dfs(int cur , List<List<Integer>> res, List<Integer> path , int[][]g , int tar){
        if (cur==tar) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int nbr : g[cur]){
            path.add(nbr);
            dfs(nbr , res , path , g , tar);
            path.remove(path.size()-1);
        }
    }
}