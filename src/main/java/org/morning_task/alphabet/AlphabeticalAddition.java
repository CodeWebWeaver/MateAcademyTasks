package org.morning_task.alphabet;

public class AlphabeticalAddition {
    public static String addLetters(String... letters) {
        int sumIndex = 0;

        for (String letter : letters) {
            sumIndex += letter.charAt(0) - 'a' + 1;
        }

        if (sumIndex > 26) {
            sumIndex %= 26;
        }

        if (sumIndex == 0) {
            return "z";
        } else {
            return String.valueOf((char) ('a' + sumIndex - 1));
        }
    }
}
