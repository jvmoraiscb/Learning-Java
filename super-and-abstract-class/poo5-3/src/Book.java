package src;

public class Book extends Product {
    private String author;

    public Book(String name, float price, String author){
        super(name, price);
        this.author = author;
    }

    @Override
    public String toString(){
        return String.format("Name: %s (by %s) | Price: %.2f", this.getName(), this.author, this.getPrice());
    }
}
