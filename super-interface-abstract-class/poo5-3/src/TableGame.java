package src;

public class TableGame extends Product {
    private int minimumAge;

    public TableGame(String name, float price, int minimumAge){
        super(name, price);
        this.minimumAge = minimumAge;
    }

    public String toString(){
        return String.format("Name: %s (Minimum age: %d) | Price: %.2f", this.getName(), this.minimumAge, this.getPrice());
    }
}