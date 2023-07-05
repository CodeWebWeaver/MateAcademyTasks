package org.morning_task.haystack;

public class Haystack {
    public static String findNeedle(Object[] haystack) {
        // write code here
        for (int i = 0; i < haystack.length; i++){
            if (haystack[i] != null){
                if (haystack[i].toString().equals("needle")){
                    return "found the needle at position " + i;
                }
            }
        }
        return "Nothing";
    }
}

