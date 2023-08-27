package testing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeightSort {
  public static String orderWeights(String weights) {
    return Arrays.stream(weights.trim().split(" "))
            .filter(string -> !string.isEmpty())
            .sorted(Comparator.comparingInt(number ->
                            Arrays.stream(number.toString().split(""))
                                    .mapToInt(Integer::parseInt)
                                    .sum())
                    .thenComparing(Object::toString))
            .collect(Collectors.joining(" "));
  }

  public static String orderWeights2(String weights) {
    return Stream.of(weights.trim().split(" +"))
            .sorted()
            .sorted(Comparator.comparingInt(o -> o
                    .chars()
                    .map(Character::getNumericValue)
                    .sum()))
            .collect(Collectors.joining(" "));
  }

  public static void main(String[] args) {
    System.out.println(orderWeights("23 3 23 45 45 100 11 19 953 6 47 264 682 49 6 27"));
  }
}