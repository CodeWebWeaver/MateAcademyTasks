package code.wars.findnullsinfactorial;

public class FindNullsFactorial {
    public static void main(String[] args) {
        System.out.println(zeros((0)));
    }
    public static int zeros(int n) {
        // your beatiful code here
        int factorial = 1;
        for(int i = 2; i <= n; i++){
            factorial *= i;
        }
        System.out.println(factorial);
        int countZeros = 0;
        String strNum = String.valueOf(factorial);
        for (int i = strNum.length(); i > 0; i--){
            if(strNum.charAt(i - 1) == '0'){
                countZeros++;
            } else {
                break;
            }
        }
        return countZeros;
    }
}
