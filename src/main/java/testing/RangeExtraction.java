package testing;

public class RangeExtraction {
  public static String extractRange(int[] nums) {
    if (nums.length == 1) {
      return String.valueOf(nums[0]);
    }
    int counter = 0;
    int acceptableRange = 3;
    int currentNum = nums[0];
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 1; i < nums.length; i++) {
      if (currentNum + 1 == nums[i]) {
        counter++;
      } else {
        if (counter > acceptableRange) {
          int firstNum = nums[i - counter - 1];
          stringBuilder.append(firstNum).append("-").append(currentNum).append(",");
        } else {
          for (int j = 0; j <= counter; j++) {
            stringBuilder.append(nums[i - counter - 1 + j]).append(",");
          }
        }
        counter = 0;
      }
      currentNum = nums[i];
    }

    if (counter > acceptableRange) {
      int firstNum = nums[nums.length - counter - 1];
      stringBuilder.append(firstNum).append("-").append(currentNum);
    } else {
      for (int j = 0; j <= counter; j++) {
        stringBuilder.append(nums[nums.length - counter - 1 + j]);
        if (j != counter) {
          stringBuilder.append(",");
        }
      }
    }
    return stringBuilder.toString();
  }

  public static String extractRange2(int[] nums) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < nums.length; i++) {
      int rangeStart = nums[i];
      result.append(rangeStart);
      for (int j = i + 1; j <= nums.length; j++) {
        if (j == nums.length || nums[j] != rangeStart + (j - i)) {
          if (j - i >= 3) {
            result.append('-').append(nums[j - 1]);
            i = j - 1;
          }
          result.append(',');
          break;
        }
      }
    }
    return result.toString();
  }

  public static void main(String[] args) {
    int[] numRange = {-4,-3,5,6,7,8,9,10,13,14,15,17};
    System.out.println(extractRange2(numRange));
  }
}
