package pro.sky.java.course1.lesson1;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String authorFirstName, String authorSurName) {
        this.firstName = authorFirstName;
        this.lastName = authorSurName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
