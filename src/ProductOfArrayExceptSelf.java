import java.util.Arrays;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all
 * the elements of nums except nums[i].<br>
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.<br>
 * You must write an algorithm that runs in O(n) time and without using the division operation.<br><br>
 * Example 1:<br>
 * Input: nums = [1,2,3,4]<br>
 * Output: [24,12,8,6]<br><br>
 * Example 2:<br>
 * Input: nums = [-1,1,0,-3,3]<br>
 * Output: [0,0,9,0,0]
 */
public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int... nums) {
        int[] output = new int[nums.length];
        Arrays.fill(output, 1);

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] = prefix;
            prefix *= nums[i];
        }

        int postfix = 1;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            output[i] *= postfix;
            postfix *= nums[i];
        }

        return output;
    }
}
