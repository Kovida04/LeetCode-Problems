class Solution {
    public boolean canJump(int[] nums) {
        int jp=nums[0];
        for (int i=1;i<nums.length;i++){
            if (jp==0) return false;
            else if (nums[i]>= jp) jp= nums[i];
            else jp--;
        }
        return true;
    }
}