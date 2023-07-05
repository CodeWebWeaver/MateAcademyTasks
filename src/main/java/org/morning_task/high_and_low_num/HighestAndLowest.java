package org.morning_task.high_and_low_num;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        if (numbers.isEmpty()) {
            return "";
        }
        if (!numbers.contains(" ")) {
            return numbers + " " + numbers;
        }
        String[] strNumberArr = numbers.split(" ");
        int[] numberArr = new int[strNumberArr.length];
        int max = Integer.parseInt(strNumberArr[0]);
        int min = Integer.parseInt(strNumberArr[0]);
        for (int i = 0; i < strNumberArr.length; i++) {
            numberArr[i] = Integer.parseInt(strNumberArr[i]);
            max = Math.max(max, numberArr[i]);
            min = Math.min(min, numberArr[i]);
        }
        return max + " " + min;
    }
}
