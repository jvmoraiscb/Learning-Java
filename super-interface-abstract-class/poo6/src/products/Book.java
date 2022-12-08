package products;

public class Book extends Product {
    private String author;
    private int year;

    public Book(String name, float price, String author, int year){
        super(name, price);
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString(){
        return String.format("Name: %s (by %s - %d) | Price: %.2f", this.getName(), this.author, this.getPrice(), this.year);
    }
}
