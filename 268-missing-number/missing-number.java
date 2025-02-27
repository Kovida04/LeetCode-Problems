class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i:nums) ls.add(i);
        for (int i=0;i<nums.length;i++) if (!ls.contains(i)) return i;
        return nums.length;
    }
}