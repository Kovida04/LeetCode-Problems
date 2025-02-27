class Solution {
    public int missingNumber(int[] nums) {
        //ArrayList<Integer> ls = new ArrayList<>();
        //for (int i:nums) ls.add(i);
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++) if (nums[i]!=i) return i;
        return nums.length;
    }
}