package testing.recursion;

public class FibonacciSequence {
  public static int getFibonacciNumber(int n) {
//    if (n == 0) {
//      return 0;
//    }
//    if (n == 1) {
//      return 1;
//    }
//    if (n == 2) {
//      return 1;
//    }
//    if (n == 3) {
//      return 2;
//    }
//    if (n == 4) {
//      return 3;
//    }
    System.out.println("n is : " + n);
    if (n == 2 ) {
      return 1;
    }
    if (n == 1 ) {
      return 1;
    }
    if (n == 0 ) {
      return 0;
    }
    return getFibonacciNumber(n - 2) + getFibonacciNumber(n - 1);
  }
}
