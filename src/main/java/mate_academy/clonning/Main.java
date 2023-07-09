package mate_academy.clonning;

public class Main {
    public static void main(String[] args) {
        User bob = new User(14516, 22, "Bob");
        System.out.println(bob);
        System.out.println("hashCode 1 :" + bob.hashCode());
        User clonedBob = bob.clone();
        System.out.println(clonedBob);
        System.out.println("hashCode 2:" + clonedBob.hashCode());
    }
}
