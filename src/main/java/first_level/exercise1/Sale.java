package first_level.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private final String clientName;
    private List<Product> addedProducts;
    private double totalPrice;

    public Sale(String clientName){
        this.clientName = clientName;
        this.addedProducts = new ArrayList<>();
        this.totalPrice = 0;

    }

    public double getTotalPrice () {
        return totalPrice;
    }

    public void addProduct (Product newProduct) {
        if (newProduct != null) {
            addedProducts.add(newProduct);
        }
    }

    public void removeProduct (Product productToRemove) {
        if (addedProducts.isEmpty()){
            throw new EmptySaleException("The shopping cart is empty.");
        }
       addedProducts.remove(productToRemove);
    }

    public double calculateTotalPrice() {
        if (addedProducts.isEmpty()){
            this.totalPrice = 0;
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
