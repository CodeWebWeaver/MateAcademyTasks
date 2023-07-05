package org.morning_task.multiples;

public class MultiplesOfNumber {
    public static int[] getMultiples(int multiples, int number) {
        // write code here
        int[] multiplesMassive = new int[multiples];
        int temp = 0;
        for (int i = 0; i < multiples; i++) {
            temp += number;
            multiplesMassive[i] = temp;
        }
        return multiplesMassive;
    }
}