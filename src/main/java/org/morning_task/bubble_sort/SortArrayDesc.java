package org.morning_task.bubble_sort;

public class SortArrayDesc {
    public static long getMaxNumber(long num) {
        // write code here
        if (num == 0) {
            return 0;
        }
        int[] digits = convertToDigitArray(num);
        bubbleSort(digits);
        return combineDigits(digits);
    }

    private static int[] convertToDigitArray(long num) {
        String numberString = String.valueOf(Math.abs(num));
        int[] digits = new int[numberString.length()];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = Character.getNumericValue(numberString.charAt(i));
        }
        return digits;
    }

    private static void bubbleSort(int[] arr) {
        boolean swapped;

        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    private static long combineDigits(int[] digits) {
        long result = 0;
        for (int digit : digits) {
            result = result * 10 + digit;
        }
        return result;
    }
}
