class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> vis = new HashSet<>();
        for (int num : nums) {
            if (vis.contains(num)) return true;
            vis.add(num);
        }
        return false;
    }
}