class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] rgt = new int[n];
        int[] lft = new int[n];

        Arrays.fill(rgt,1);
        Arrays.fill(lft,1);

        for (int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]) lft[i] = lft[i-1]+1;
        }

        for (int i=n-2 ; i>=0;i--) if(ratings[i]>ratings[i+1]) rgt[i] = rgt[i+1]+1; 
        int s=0;
        for (int i=0;i<n;i++) s+=Math.max(lft[i] , rgt[i]);  
        return s;
    }
}