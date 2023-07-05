package org.morning_task.convertKPM;

public class Converter {

    private static final float MILETOKILOMETER = 1.609344f;
    private static final float GALLONTOLITER =  4.54609188f;

    public static float toKiloPerLiter(float mpg) {
        // write code here
        return (float) (Math.round(100 * mpg * MILETOKILOMETER / GALLONTOLITER)) / 100;
    }
}
