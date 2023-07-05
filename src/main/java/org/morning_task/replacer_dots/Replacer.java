package org.morning_task.replacer_dots;

public class Replacer {
    public static String replaceDots(final String str) {
        return str.replaceAll("\\.", "-");
    }
}
