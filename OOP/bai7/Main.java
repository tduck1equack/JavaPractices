package Files.OOP.bai7;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Book book1 = new Book();
        book1.PrintInfo();
        book1.setName("Mazerunner II");
        book1.setGenre("Science fiction");
        book1.setPrice(25);
        book1.setPublicationDate("21/04/2017");
        book1.setAuthor("Unknown");
        System.out.printf("%s\n%s\n%d\n%s\n%s\n", book1.getName(), book1.getGenre(), book1.getPrice(),
                book1.getPublicationDate(), book1.getAuthor());
    }
}
