import java.util.LinkedList;
import java.util.List;

import src.Book;
import src.Product;
import src.TableGame;

public class App {
    public static void main(String[] args) {
        List<Product> products = new LinkedList<>();

        Book 
            book1 = new Book("Harry Potter", 20f, "J.K. Rowling"),
            book2 = new Book("Harry Potter 2", 20f, "J.K. Rowling"),
            book3 = new Book("Harry Potter 3", 20f, "J.K. Rowling");

        TableGame
            tableGame1 = new TableGame("Twister", 50f, 10),
            tableGame2 = new TableGame("War", 40f, 10);

        Product
            product1 = new Product("Ping pong table", 100f),
            product2 = new Product("MTB Bike", 150f);

        
        products.add(book1);
        products.add(book2);
        products.add(book3);
        products.add(tableGame1);
        products.add(tableGame2);
        products.add(product1);
        products.add(product2);

        for(Product p : products){
            System.out.println(p);
        }
    }
}
