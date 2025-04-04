class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int min = 0;
        int n = cost.length;
        if(n==0) return 0;
        if(n==1) return cost[0];
        int[] dp = new int[n+1];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i=2;i<n;i++){
            dp[i] = cost[i] + Math.min(dp[i-2] , dp[i-1]);
        }
        return Math.min(dp[n-1] , dp[n-2]);
    }
}