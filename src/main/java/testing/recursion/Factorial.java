package testing.recursion;

public class Factorial {
  private int sum = 1;

  public int getFactorialMy(int number) {
    if (number >= 1) {
      sum = number * getFactorialMy(number - 1);
    }
    return sum;
  }

  public static int getFactorialRight(int number) {
    return number == 0 ? 1
            : number * getFactorialRight(number - 1);
  }
}
