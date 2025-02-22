class Solution {
    public long countBadPairs(int[] nums) {
        long gp=0;
        long tp =(1L*nums.length*(nums.length-1))/2;

        HashMap<Integer,Integer> hp = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            int d=i-nums[i];
            if (hp.containsKey(d)) gp+=hp.get(d);
            hp.put(d,hp.getOrDefault(d,0)+1);
        }
        
        return tp-gp;
    }
}