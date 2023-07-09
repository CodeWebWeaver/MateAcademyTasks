package mate_academy.clonning;

public class User extends Person implements Cloneable {
    int inn;

    @Override
    public User clone(){
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t clone", e);
        }
    }

    public User(int age, int inn, String name) {
        this.inn = inn;
        super.name = name;
        super.age = age;
    }

    @Override
    public String toString() {
        return super.name
                + super.age;
    }
}
