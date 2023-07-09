package org.morning_task.weights_team;

public class RowWeights {
  public static int[] getTotalWeight(int[] weights) {
    // write code here
    int[] teamsWeights = new int[2];
    for (int i = 0; i < weights.length; i++) {
      if (i % 2 == 0) {
        teamsWeights[0] += weights[i];
        continue;
      }
      teamsWeights[1] += weights[i];
    }
    return teamsWeights;
  }
}
