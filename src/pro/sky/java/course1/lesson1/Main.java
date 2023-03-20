package pro.sky.java.course1.lesson1;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Имя1 ", "Фамиля1 ");
        Author author2 = new Author("Имя2 ", "Фамиля2 ");
        Book book1 = new Book("Название1: ", author1, 1111);
        Book book2 = new Book("Название2: ", author2, 2222);
        System.out.println("Книга1- " + book1.getName() + "Автор: " + author1 + " " + "год: " + book1.getPublishingYear());
        System.out.println("Книга2- " + book2.getName() + "Автор: " + author2 + " " + "год: " + book2.getPublishingYear());
        book2.setPublishingYear(3333);
        System.out.println("Исправлене года второй книги");
        System.out.println("Книга2- " + book2.getName() + "Автор: " + author2 + " "
                + "год: " + book2.getPublishingYear());
    }
}