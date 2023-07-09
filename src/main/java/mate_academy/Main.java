package mate_academy;

import mate_academy.overrde_hash_equal_clone.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20,56, "Red");
        System.out.println(rectangle.hashCode());
        Rectangle rectangle1 = rectangle.clone();
        System.out.println(rectangle1.hashCode());

        System.out.println(rectangle.equals(rectangle1));
        rectangle1.setColor("Blue");
        System.out.println(rectangle.equals(rectangle1));

        Integer i = 5;
    }
}
