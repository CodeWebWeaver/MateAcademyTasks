package testing;

import testing.recursion.Factorial;
import testing.recursion.FibonacciSequence;
import testing.static_fabric.SongOrder;

public class Main {
    public static void main(String[] args) {
        SongOrder music = SongOrder.of("Rap Balgini");
        SongOrder music2 = SongOrder.of("Rap Balgini", "I want your home");
        System.out.println(music);
        System.out.println(music2);
    }
}
