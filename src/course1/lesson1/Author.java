package course1.lesson1;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Автор [ " +
                "имя: '" + this.name + '\'' +
                ", фамилия: '" + this.surname + '\'' + " ]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
