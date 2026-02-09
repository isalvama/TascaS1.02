package FirstLevel.Ex1;

import java.util.ArrayList;
import java.util.List;

import static java.util.List.copyOf;

public class Sale {
    private final String clientName;
    private ArrayList<Product> addedProducts;
    private double totalPrice;

    public Sale(String clientName){
        this.clientName = clientName;
        this.addedProducts = new ArrayList<>();
        this.totalPrice = 0;

    }

    public List<Product> getAddedProducts(){
        return copyOf(addedProducts);
    }

    public double getTotalPrice () {
        return totalPrice;
    }

    public void addProducts(Product newProduct){
        addedProducts.add(newProduct);
    }

    public void removeProducts(Product productToRemove)throws EmptySaleException{
        if (addedProducts.isEmpty()){
            throw new EmptySaleException("The shopping cart is empty.");
        }
       addedProducts.remove(productToRemove);
    }

    public double calculateTotalPrice() {
        if (addedProducts.isEmpty()){
            throw new EmptySaleException("The shopping cart is empty.");
        }
        double sum = 0;
        for (Product product : addedProducts){
           sum += product.getPrice();
        }
        totalPrice = sum;
        return sum;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "clientName='" + clientName + '\'' +
                ", addedProducts=" + addedProducts +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
