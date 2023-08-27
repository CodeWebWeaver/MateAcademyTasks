package testing;

public class NumberArray {
  public static int getMaxSubarraySum(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int maxSum = nums[0];
    int currentSum = nums[0];

    for (int i = 1; i < nums.length; i++) {
      currentSum = Math.max(nums[i], currentSum + nums[i]);
      maxSum = Math.max(maxSum, currentSum);
    }
    return Math.max(maxSum, 0);
  }

  public static int getMaxSubarraySum2(int[] nums) {
    int cur = 0;
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      cur = Math.max(0, cur + nums[i]);
      max = Math.max(cur, max);
    }
    return max;
  }

  public static void main(String[] args) {
    int[] array = {-25, 12, -32, 0, 15, 50, -14};
    System.out.println(getMaxSubarraySum(array));
  }
}
