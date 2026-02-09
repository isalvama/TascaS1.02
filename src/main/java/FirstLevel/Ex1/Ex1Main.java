package FirstLevel.Ex1;

public class Ex1Main {
    public static void main (String[] args){
        Product water = new Product("1a", "water", 0.50);
        Product salt = new Product("2a","salt", 0.90);
        Product milk = new Product("3a","milk", 1);

        Sale inesShoppingCart = new Sale("Inés");
        inesShoppingCart.addProducts(water);
        inesShoppingCart.addProducts(salt);
        inesShoppingCart.addProducts(milk);
        System.out.println(inesShoppingCart.toString());
        try{inesShoppingCart.calculateTotal();} catch (EmptySaleException e) {
            throw new RuntimeException(e);
        }
        System.out.println(inesShoppingCart.toString());

        try{inesShoppingCart.removeProducts(salt);} catch (EmptySaleException e) {
            throw new RuntimeException(e);
        }
        System.out.println(inesShoppingCart.toString());

        try{inesShoppingCart.removeProducts(milk);} catch (EmptySaleException e) {
            throw new RuntimeException(e);
        }
        System.out.println(inesShoppingCart.toString());
        try{inesShoppingCart.calculateTotal();} catch (EmptySaleException e) {
            throw new RuntimeException(e);
        }
        System.out.println(inesShoppingCart.getTotalPrice());

        try{inesShoppingCart.removeProducts(water);} catch (EmptySaleException e) {
            throw new RuntimeException(e);
        }
        System.out.println(inesShoppingCart.toString());

        try{inesShoppingCart.calculateTotal();} catch (EmptySaleException e) {
            throw new RuntimeException(e);
        }
        System.out.println(inesShoppingCart.getTotalPrice());
    }


}
