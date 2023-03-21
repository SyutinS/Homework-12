package pro.sky.java.course1.lesson1;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Имя1", "Фамилия1");
        Author author2 = new Author("Имя2", "Фамилия2");
        Author author3 = new Author("Имя1", "Фамилия1");
        Book book1 = new Book("Название1", author1, 1111);
        Book book2 = new Book("Название2", author2, 2222);
        Book book3 = new Book("Название1", author3, 1111);
        System.out.println("Книга1- " + book1.getName() + " Автор: " + book1.getAuthor() + " " + "год: " + book1.getPublishingYear());
        System.out.println("Книга2- " + book2.getName() + " Автор: " + book2.getAuthor() + " " + "год: " + book2.getPublishingYear());
        System.out.println("Книга3- " + book3.getName() + " Автор: " + book3.getAuthor() + " " + "год: " + book3.getPublishingYear());
        book2.setPublishingYear(3333);
        System.out.println("Исправлене года второй книги");
        System.out.println("Книга2- " + book2.getName() + " Автор: " + book2.getAuthor() + " " + "год: " + book2.getPublishingYear());
        System.out.println(book1);
        System.out.println(book3);
        System.out.println("Сравниваем книги");
        System.out.println(book1.equals(book1));
        System.out.println(book2.equals(book1));
        System.out.println(book3.equals(book1));
        System.out.println("hashCode");
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
    }
}