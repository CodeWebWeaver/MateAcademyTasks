package org.morning_task.minValue;

import java.util.Arrays;

public class MinimumValue {
    public static int getMinValue(int[] nums) {
        boolean isUnique;
        int[] uniqueNums = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            isUnique = true;
            for (int j = 0; j < count; j++) {
                if (nums[i] == uniqueNums[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueNums[count] = nums[i];
                count++;
            }
        }
        int[] result = new int[count];
        System.arraycopy(uniqueNums, 0, result, 0, count);
        Arrays.sort(result);

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            sb.append(num);
        }
        String concatenatedString = sb.toString();
        return Integer.parseInt(concatenatedString);
    }
}
