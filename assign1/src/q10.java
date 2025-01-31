import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String author;
    private String title;
    private String publisher;
    private double cost;
    private int stock;

    public Book(String author, String title, String publisher, double cost, int stock) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.cost = cost;
        this.stock = stock;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getCost() {
        return cost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Cost: $" + cost);
        System.out.println("Stock: " + stock);
    }
}

class Bookshop {
    private ArrayList<Book> inventory;

    public Bookshop() {
        inventory = new ArrayList<>();
    }

    public void addBook(Book book) {
        inventory.add(book);
    }

    public void searchBook(String title, String author) {
        for (Book book : inventory) {
            if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author)) {
                book.displayDetails();
                processOrder(book);
                return;
            }
        }
        System.out.println("Book not found in inventory.");
    }

    private void processOrder(Book book) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of copies required: ");
        int requiredCopies = scanner.nextInt();

        if (requiredCopies <= book.getStock()) {
            double totalCost = requiredCopies * book.getCost();
            System.out.printf("Total cost for %d copies: $%.2f\n", requiredCopies, totalCost);
            book.setStock(book.getStock() - requiredCopies);
        } else {
            System.out.println("Required copies not in stock.");
        }

    }
}

public class q10 {
    public static void main(String[] args) {
        Bookshop shop = new Bookshop();

        shop.addBook(new Book("Lewis Hamilton", "Speed of Light", "Mercedes Publishing", 29.99, 10));
        shop.addBook(new Book("Max Verstappen", "The Art of Overtaking", "Red Bull Press", 24.99, 15));
        shop.addBook(new Book("Charles Leclerc", "Monégasque Dreams", "Ferrari Books", 19.99, 8));
        shop.addBook(new Book("Lando Norris", "Twitch to Podium", "McLaren Media", 22.99, 12));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter book title (or 'quit' to exit): ");
            String title = scanner.nextLine();
            if (title.equalsIgnoreCase("quit"))
                break;

            System.out.print("Enter author name: ");
            String author = scanner.nextLine();

            shop.searchBook(title, author);
            System.out.println();
        }

        scanner.close();
    }
}
