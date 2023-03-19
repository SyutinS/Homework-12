package pro.sky.java.course1.lesson1;

public class Author {
    private final String firstName;
    private final String listName;

    public Author(String authorFirstName, String authorSurName) {
        this.firstName = authorFirstName;
        this.listName = authorSurName;
    }

    public String getAuthorFirstName() {
        return firstName;
    }

    public String getAuthorSurName() {
        return listName;
    }

    @Override
    public String toString() {
        return firstName + " " + listName;
    }
}
