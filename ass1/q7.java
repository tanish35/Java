package ass1;

import java.util.ArrayList;

abstract class Publication {
    private int noOfPages;
    private int price;
    private String publisherName;

    public Publication(int noOfPages, int price, String publisherName) {
        this.noOfPages = noOfPages;
        this.price = price;
        this.publisherName = publisherName;
    }

    void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    String getPublisherName() {
        return publisherName;
    }

    int getNoOfPages() {
        return noOfPages;
    }

    int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

}

class Book extends Publication {
    private String authorName;

    public Book(int noOfPages, int price, String publisherName, String authorName) {
        super(noOfPages, price, publisherName);
        this.authorName = authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "publisherName='" + getPublisherName() + '\'' +
                "price=" + getPrice() +
                "noOfPages=" + getNoOfPages() +
                "authorName='" + authorName + '\'' +
                '}' + '\n';
    }
}

class Journal extends Publication {
    private String journalName;

    public Journal(int noOfPages, int price, String publisherName, String journalName) {
        super(noOfPages, price, publisherName);
        this.journalName = journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public String getJournalName() {
        return journalName;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "publisherName='" + getPublisherName() + '\'' +
                "price=" + getPrice() +
                "noOfPages=" + getNoOfPages() +
                "journalName='" + journalName + '\'' +
                '}' + '\n';
    }
}

class Library {
    ArrayList<Publication> publications = new ArrayList<>();

    public void addPublication(Publication publication) {
        publications.add(publication);
    }

    @Override
    public String toString() {
        return "Library{" +
                "publications=" + publications +
                '}';
    }
}

public class q7 {
    public static void main(String[] args) {

        Book book1 = new Book(100, 200, "Penguin", "J.K. Rowling");
        Book book2 = new Book(200, 300, "Penguin", "J.R.R. Tolkien");
        Book book3 = new Book(300, 400, "Penguin", "George R.R. Martin");
        Journal journal1 = new Journal(50, 100, "Nature", "Nature Journal");
        Journal journal2 = new Journal(60, 150, "Science", "Science Journal");
        Library library = new Library();
        library.addPublication(book1);
        library.addPublication(book2);
        library.addPublication(book3);
        library.addPublication(journal1);
        library.addPublication(journal2);
        System.out.println(library);

    }
}
