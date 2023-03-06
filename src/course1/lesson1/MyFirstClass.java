package course1.lesson1;

public class MyFirstClass {
    public static void main(String[] args) {
        Author levTolstoi = new Author("Лев", "Толстой");
        Author gogol = new Author("Николай", "Гоголь");
        Book book1 = new Book("Война и Мир", levTolstoi, 1863);
        Book book2 = new Book("Мертвые души", gogol, 1835);
        book1.setPublicationYear(2455);
        System.out.println(book1.getBookTitle() + " " + book1.getPublicationYear() + " год, (not real)");
        System.out.println(book2.getBookTitle() + " " + book2.getPublicationYear() + " год");
    }
}
