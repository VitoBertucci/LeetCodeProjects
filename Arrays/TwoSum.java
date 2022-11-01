package Arrays;
//TwoSum
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                if(nums[j] == target - nums[i] && i != j && nums != null) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
