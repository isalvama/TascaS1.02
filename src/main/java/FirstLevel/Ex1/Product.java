package FirstLevel.Ex1;

public class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice () {
        return price;
    }

    public String getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
