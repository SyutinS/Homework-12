package pro.sky.java.course1.lesson1;

import jdk.dynalink.beans.StaticClass;

public class Author {
    private final String authorFirstName;
    private final String authorSurName;
    public static String authorName;

    public Author(String authorFirstName, String authorSurName) {
        this.authorFirstName = authorFirstName;
        this.authorSurName = authorSurName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorSurName() {
        return authorSurName;
    }

    public String getAuthor() {
        return authorName;
    }

    @Override
    public String toString() {
        return authorFirstName + authorSurName;
    }
}
