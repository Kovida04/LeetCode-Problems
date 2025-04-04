class Solution {
    public int climbStairs(int n) {
        if (n <= 3) return n;
        int a = 0, b = 1;
        for (int i = 3; i <= n+2; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
}