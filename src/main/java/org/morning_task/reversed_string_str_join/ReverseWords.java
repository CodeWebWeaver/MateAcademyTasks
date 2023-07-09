package org.morning_task.reversed_string_str_join;

public class ReverseWords {
    public static String reverseWords(final String string) {
        String[] splitStr = string.split(" ");
        if (splitStr.length == 0) {
            return string;
        }

        StringBuilder wordBuilder;
        StringBuilder reversedStrBuilder = new StringBuilder();

        for (int i = 0; i < splitStr.length; i++) {
            wordBuilder = new StringBuilder(splitStr[i]);
            reversedStrBuilder.append(wordBuilder.reverse());
            if (i != splitStr.length - 1) {
                reversedStrBuilder.append(" ");
            }
        }
        return reversedStrBuilder.toString();
    }
}


