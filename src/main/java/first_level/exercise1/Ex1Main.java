package first_level.exercise1;

public class Ex1Main {
    public static void main (String[] args){
        Product water = new Product("1a", "water", 0.50);
        Product salt = new Product("2a","salt", 0.90);
        Product milk = new Product("3a","milk", 1);

        Sale inesShoppingCart = new Sale("Inés");
        inesShoppingCart.addProduct(water);
        inesShoppingCart.addProduct(salt);
        inesShoppingCart.addProduct(milk);
        System.out.println(inesShoppingCart);

        runCalculation(inesShoppingCart);
        System.out.println(inesShoppingCart);

        runElimination(inesShoppingCart, salt);
        System.out.println(inesShoppingCart);

        runElimination(inesShoppingCart, milk);
        System.out.println(inesShoppingCart);

        runCalculation(inesShoppingCart);
        System.out.println(inesShoppingCart.getTotalPrice());

        runElimination(inesShoppingCart, water);
        System.out.println(inesShoppingCart);

       runCalculation(inesShoppingCart);
        System.out.println(inesShoppingCart.getTotalPrice());
    }

    public static void runElimination (Sale sale, Product productToRemove) {
        try {
            sale.removeProduct(productToRemove);
            System.out.println("Product " + productToRemove + "removed from productList successfully");
        } catch (EmptySaleException ese) {
            System.err.println("Error: " + ese.getMessage());
        }
    }

    public static void runCalculation (Sale sale) {
        try {
            double totalPrice = sale.calculateTotalPrice();
            System.out.println("Total price of product List: " + totalPrice);
        } catch (EmptySaleException ese) {
            System.err.println("Error: " + ese.getMessage());
        }
    }


}
