class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];

        boolean[] vis = new boolean[n];

        for (int i=0;i<n;i++){
            if(color[i]==0){
                if (!dfs(i,1,graph,color,vis))  return false;
            }
        }
        return true;
    }
    public boolean dfs (int node, int col, int[][] graph, int[] color , boolean[] visit){
        color[node] = col;
        visit[node] = true;
        boolean ans = true;

        for (int ele : graph[node]){
            if (color[ele]!= 0 && color[ele] == col) return false;
            if (!visit[ele]) {
                if(col==1) ans&= dfs(ele, 2, graph, color, visit);
                else ans&= dfs(ele, 1, graph, color, visit);
            }
        }
        return ans;
    }
}