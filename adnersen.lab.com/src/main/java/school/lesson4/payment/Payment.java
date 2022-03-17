package school.lesson4.payment;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private static int checkNumber;
    private int cost;
    private List<Product> products;

    private class Product {
        private String productName;
        private int productCost;

        public Product(String productName, int productCost) {
            this.productName = productName;
            this.productCost = productCost;
        }

        public String getProductName() {
            return productName;
        }

        public int getProductCost() {
            return productCost;
        }
    }

    public Payment() {
        checkNumber++;
        this.cost = 0;
        this.products = new ArrayList<>();
    }

    public void setProducts(String productName, int productCost) {
        products.add(new Product(productName, productCost));
    }

    public int getCost() {
        for (Product product : products) {
            this.cost += product.getProductCost();
        }
        return cost;
    }

    public void printCheck() {
        System.out.println("check number " + checkNumber);
        for (Product product : products) {
            System.out.println(product.getProductName() + " " + product.getProductCost());
        }
        System.out.println("cost " + getCost());
        System.out.println("-----------------------------------");
    }
}
