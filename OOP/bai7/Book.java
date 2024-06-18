package Files.OOP.bai7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Book {
    public String Name;
    public String Genre;
    public int Price;
    public Date PublicationDate;
    public String Author;

    public Book() throws ParseException {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Input book name: ");
        this.Name = inputReader.nextLine();
        System.out.print("Input book genre: ");
        this.Genre = inputReader.nextLine();
        System.out.print("Input book price: ");
        this.Price = inputReader.nextInt();
        inputReader.nextLine();
        System.out.print("Input publication date (dd/mm/yyyy): ");
        SimpleDateFormat datePattern = new SimpleDateFormat("dd/MM/yyyy");
        String pubDate = inputReader.nextLine();
        this.PublicationDate = datePattern.parse(pubDate);
        System.out.print("Input author: ");
        this.Author = inputReader.nextLine();
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setPublicationDate(String publicationDate) throws ParseException {
        SimpleDateFormat datePattern = new SimpleDateFormat("dd/MM");
        PublicationDate = datePattern.parse(publicationDate);
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getName() {
        return Name;
    }

    public String getGenre() {
        return Genre;
    }

    public int getPrice() {
        return Price;
    }

    public String getPublicationDate() {
        SimpleDateFormat datePattern = new SimpleDateFormat("dd/MM");
        return datePattern.format(PublicationDate);
    }

    public String getAuthor() {
        return Author;
    }

    public void PrintInfo() {
        SimpleDateFormat datePattern = new SimpleDateFormat("dd/MM");
        System.out.printf("%s is a %s book, worth $%d, published on %s by author %s\n",
                this.Name, this.Genre, this.Price, datePattern.format(this.PublicationDate), this.Author);
    }
}
