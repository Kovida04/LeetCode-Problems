class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int n :nums1) s1.add(n);
        for (int n : nums2) s2.add(n);

        List<Integer> d1 = new ArrayList<>(s1);
        d1.removeAll(s2);

        List<Integer> d2 = new ArrayList<>(s2);
        d2.removeAll(s1);

        res.add(d1);
        res.add(d2);
        return res;
    }
}