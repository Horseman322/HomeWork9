public class Main {
    public static void main(String[] args) {

            author author1 = new author(" Олег", "Вещий");
            author author2 = new author(" Семён", "Угловатый");

            book book1 = new book("Краса", 2021, author1);
            book book2 = new book("МЫШЬ", 2021, author2);

            System.out.println("Автор" + author1.getFullName());
            System.out.println();
            System.out.println("Автор" + author2.getFullName());
            System.out.println();
            System.out.println("Названия киниги " + book1.getName()+ " год издания книги " + book1.getYear()+ " автор книги " + author1.getFullName());
            System.out.println();
            System.out.println("Названия киниги " + book2.getName()+ " год издания книги " + book2.getYear()+ " автор книги " + author2.getFullName());
            System.out.println();
            System.out.println(book1);
            System.out.println();

            System.out.println(book2);
            System.out.println();
            System.out.println(book2.hashCode() == book2.hashCode());
            System.out.println(book2.equals(book2));

    }

}