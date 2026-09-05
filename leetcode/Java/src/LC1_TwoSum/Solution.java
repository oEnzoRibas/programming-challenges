package LC1_TwoSum;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIds = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (numIds.containsKey(nums[i])) {
                return new int[] { numIds.get(nums[i]), i };
            }else {
                numIds.put(target - nums[i], i);
            }
        }
        throw new IllegalArgumentException("No Solution");
    }
}