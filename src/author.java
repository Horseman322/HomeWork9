import java.util.Objects;

public class author {
    private String name;

    private String surname;

    public author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void  setSurname(String surname) {
        this.surname = surname;
    }
    public String getFullName (){
        return name+" "+surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        author author = (author) o;
        return name.equals(author.name) && surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public String toString() {
        return name + " " + surname;
    }

}
