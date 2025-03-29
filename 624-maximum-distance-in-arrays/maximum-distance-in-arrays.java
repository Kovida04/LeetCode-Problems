class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int l = arrays.get(0).size();
        int lar = arrays.get(0).get(l-1);
        int sml = arrays.get(0).get(0);

        int dif = 0;

        for (int i=1;i<arrays.size();i++){
            
            int p = arrays.get(i).get(arrays.get(i).size()-1);
            int q = arrays.get(i).get(0);
            int x = p - sml;
            int y = lar - q;
            dif = Math.max(dif, Math.max(x, y));
            lar = Math.max(lar, p);
            sml  = Math.min(sml, q);
        
        }
        return dif;
    }
}