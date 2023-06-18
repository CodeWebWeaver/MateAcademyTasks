package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FootballBets {
    public static void main(String[] args) {
        int[][] bets = {
                {1, 2}, {1, 1}, {3, 1}, {2, 3}, {2, 6}, {3, 8}, {2, 2}, {4, 6}, {3, 3},
        };
        int[][] results = {
                {1, 1}, {2, 2}, {3, 5}, {5, 2}, {2, 4}, {6, 2}, {3, 3}, {4, 6}, {3, 3},
        };

        for (int i = 0; i < bets.length; i++) {
            System.out.println("Match " + i + ": " + matchResult(results[i][0], results[i][1], bets[i][0], bets[i][1]));
        }
    }

    public static int matchResult(int result1, int result2, int bet1, int bet2) {
        //Write code below this line
        int result = (result1 == bet1 && result2 == bet2)  ? 2 :
                        (result1 == result2 && bet1 == bet2)
                                || (result1 == result2 && bet1 == bet2)
                                || (result1 < result2 && bet1 < bet2)
                                || (result1 > result2 && bet1 > bet2) ? 1 : 0;
        return result;
        //Write code above this line
    }
}