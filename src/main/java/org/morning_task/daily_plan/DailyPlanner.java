package org.morning_task.daily_plan;

public class DailyPlanner {
    public static void main(String[] args) {
        String[] plans = {"wake up", "have breakfast", "go to work", "solve 5 tasks from codewars"};
        System.out.println(createDailyPlan(plans));
    }
    public static String createDailyPlan(String[] plans) {
        //Write code below this line
        StringBuilder sb = new StringBuilder();
        sb.append("My plans:");
        for (int i = 0; i < plans.length; i++) {
            if (i == 0) {
                sb.append("\n");
            }
            sb.append(i + 1).append(".) ").append(plans[i]).append(";");
            if (i + 1 != plans.length) {
                sb.append("\n");
            }
        }

        return sb.toString();
        //Write code above this line
    }
}
