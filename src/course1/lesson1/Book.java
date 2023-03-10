package course1.lesson1;

import java.util.Objects;

public class Book {
    private final String bookTitle;
    private final Author author;
    private int publicationYear;

    public Book(String bookTitle, Author author, int publicationYear){
        this.bookTitle = bookTitle;
        this. author = author;
        this.publicationYear = publicationYear;
    }

    public String getBookTitle(){
        return this.bookTitle;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getPublicationYear(){
        return this.publicationYear;
    }
    public void setPublicationYear(int year){
        this.publicationYear = year;
    }

    @Override
    public String toString() {
        return "Книга: " +
                "\'"+ bookTitle + '\'' +
                ", " + author +
                ", год публикации: " + publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && bookTitle.equals(book.bookTitle) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author, publicationYear);
    }
}
