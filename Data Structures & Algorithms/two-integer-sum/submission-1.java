class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> pair = new HashMap<>();
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++){
            if (pair.containsKey(nums[i])){
                arr[0] = pair.get(nums[i]);
                arr[1] = i;
                break;
            }
            pair.put((target - nums[i]), i);
        }
        return arr;
    }
}
