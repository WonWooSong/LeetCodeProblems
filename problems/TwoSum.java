class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0 ; i < nums.length; i++){
            int number = target - nums[i];
            if(hashMap.containsKey(number)){
                return new int[] {hashMap.get(number), i};
            }
            else{
                hashMap.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No solution");
    }
}