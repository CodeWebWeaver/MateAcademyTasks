package org.morning_task.swapObjects;

public class Swap {
    public Object[] arguments;

    public Swap(final Object[] args) {
        arguments = args;
    }

    public void swapValues() {
        Object temp = arguments[0];
        arguments[0] = arguments[1];
        arguments[1] = temp;
    }
}
