class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int l = flowerbed.length;
        if (n==0) return true;

        if(l==1 && flowerbed[l-1]==0) return true;

        if (flowerbed[0]==0 && flowerbed[1]==0) {
            n--;
            flowerbed[0]=1;
        }
        for (int i=1;i<l-1;i++){
            if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0 ) {
                n--;
                flowerbed[i]=1;
            }
        }
        if (l>1 && flowerbed[l-2]==0 && flowerbed[l-1]==0) n--;

        if(n<=0) return true;
        return false;
    }
}