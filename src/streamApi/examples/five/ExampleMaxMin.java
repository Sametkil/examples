package streamApi.examples.five;

import streamApi.examples.four.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExampleMaxMin {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",15000f));
        productsList.add(new Product(2,"Dell Laptop",10000f));
        productsList.add(new Product(3,"Lenevo Laptop",45000f));
        productsList.add(new Product(4,"Sony Laptop",50000f));
        productsList.add(new Product(5,"Apple Laptop",9000f));

        Product maxProduct = productsList
                .stream()
                .max(Comparator.comparing(Product::getPrice)).get();
        System.out.println(maxProduct);
        Product minProduct = productsList
                .stream()
                .min(Comparator.comparing(p->p.getPrice())).get();
        System.out.println(minProduct);
        Product maxProduct2= productsList
                .stream()
                .max((p1,p2)-> p1.getPrice()>p2.getPrice()?1:-1).get();
        System.out.println(maxProduct2);
    }
}
