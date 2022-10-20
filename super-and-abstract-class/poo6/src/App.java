import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import products.Book;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Book> books = new HashMap<>();
        int id = 1;

        while(true){
            System.out.print("\033\143"); // clean terminal
            System.out.print("Default options:\n(1) - Insert new book.\n(2) - List all the books.\n(3) - Find a book by name.\n(4) - Remove a book by id.\n(5) - Exit program.\n\nSelect your option: ");
            int option;
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                option = -1;
            }

            switch (option) {
                case 1:
                    insertNewBook(scanner, books, id);
                    id++;
                    break;
                case 2:
                    for(Book b : books.values()){
                        System.out.println(b);
                    }
                    break;
                case 3:
                    System.out.println("Find the book!");
                    break;
                case 4:
                    System.out.println("Remove the Book!");
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
                    break;
            }
            if(option == 5)
                break;
            System.out.print("\nPress enter to continue...");
            System.in.read();
        }
        scanner.close();
    }

    private static void insertNewBook(Scanner scanner, Map<Integer,Book> books, int id){
        System.out.print("\033\143");
        
        System.out.print("Book's name: ");
        String name = scanner.nextLine();

        System.out.print("Book's author name: ");
        String author = scanner.nextLine();

        System.out.print("Book's price: ");
        float price = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Book's publication year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        try{
            books.put(id, new Book(name, price, author, year));
            System.out.println("Book registered successfully!");
        }
        catch (Exception e){
            System.out.println("Can't register the book. Sorry!");
        }
    }
    private static void listAllBooks(Map<Integer,Book> books){
        for(Book b : books.values()){
            System.out.println(b.toString());
        }
    }
}
