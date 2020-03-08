class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new LinkedList();
        
        for(int i = 0; i < nums.length - 2; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                // with this value, problem becomes 2sum
                int sum = 0 - nums[i];
                int front = i+1;
                int back = nums.length-1;
                while(front < back){
                    // check if 2sum is equal to sum
                    if(nums[front] + nums[back] == sum){
                        output.add(Arrays.asList(nums[i], nums[front], nums[back]));
                        while(front < back && nums[front] == nums[front+1]) front++;
                        while(front < back && nums[back] == nums[back-1]) back--;
                        front++;
                        back--;
                    }
                    else if(nums[front] + nums[back] > sum){
                        back--;
                    }
                    else{
                        front++;
                    }
                }
            }
        }
        return output;
    }
}