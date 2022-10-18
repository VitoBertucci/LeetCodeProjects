/*
store highest bound
store lowest bound
store product of all values between lowest and hightest
traverse array

max bound must either be:
    -the current bound
    -the highest between the current bound times the current value 
    -the current lowest bound times the current value 
this tests for a highest positive bound 

min bound must either be:
    -the current bound
    -the highest between the current bound times the current value 
    -the current lowest bound times the current value 
this tests for a lowest negative bound
*/

public class leet152 {
    public static int maxProdSubArray(int[] nums) {
        int p = nums[0], max = nums[0], min = nums[0]; 
        if (nums.length == 0) return 0;
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Integer.max(nums[i], Integer.max(nums[i]*max, nums[i]*min));
            min = Integer.min(nums[i], Integer.min(nums[i]*temp, nums[i]*min));
            p = Integer.max(p, max);
        }
        return p;
    }
}
