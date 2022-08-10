public class book {

    private final String name;
    private int year;
    private final author author;

    public book(String name, int year, author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
