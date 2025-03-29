class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int res=0;
        int max=0;
        int i=0;
        int j = tokens.length-1;

        while(i<=j) {
            if(power>=tokens[i]) {
                power-=tokens[i++];
                res++;
                //i++;
                max=Math.max(res,max);
            }
            else if (power<tokens[i] && res>0){
                power+=tokens[j--];
                res--;
                max = Math.max(res,max);
            }
            else return max;
        }
        return max;
    }
}