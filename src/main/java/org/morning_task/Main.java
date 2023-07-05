package org.morning_task;

import org.morning_task.alphabet.AlphabeticalAddition;
import org.morning_task.haystack.Haystack;
import org.morning_task.high_and_low_num.HighestAndLowest;

public class Main {
    public static void main(String[] args) {
        System.out.println(AlphabeticalAddition.addLetters("a","b","c"));
        Haystack hay = new Haystack();
        System.out.println(HighestAndLowest.highAndLow("-2"));

    }
}
