package streamApi.examples.four;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        List<Float> priceList = productsList.stream()
                .filter(p -> p.getPrice()>28000f)
                .map(p -> p.getPrice())
                .collect(Collectors.toList());

        Optional<Product> productOptional = productsList.stream()
                .filter(p -> p.getPrice()>28000f)
                .findFirst();
        Product p= productOptional.orElse(new Product(10,"Test",3000));
        System.out.println(p);
        if(productOptional.isPresent()){
            System.out.println(productOptional.get().getPrice());
            System.out.println("Present");
        }else{
            System.out.println("not present");
        }

        System.out.println(priceList);
        Product resultProduct =
        productsList
                .stream()
                .max(Comparator.comparing(Product::getPrice)).get();
        System.out.println("resultProduct : "+resultProduct);
        // This is more compact approach for filtering data
        /*Float totalPrice = productsList.stream()
                .map(product->product.getPrice())
                .reduce(0.0f,(sum, price)-> sum+price);   // accumulating price
        System.out.println(totalPrice);
        */
        // More precise code
        /*
        float totalPrice2 = productsList.stream()
                .map(product->product.getPrice())
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class
        System.out.println(totalPrice2);
        */
        /*
        double totalPrice3 = productsList.stream()
                .collect(Collectors.summingDouble(p->p.getPrice()));
        System.out.println(totalPrice3);
        */
        // max() method to get max Product price
        /*
        Product productA = productsList
                .stream()
                .max((product1, product2)->
                        product1.getPrice() > product2.getPrice() ? 1: -1)
                .get();
        System.out.println(productA.getPrice());
        // min() method to get min Product price
        Product productB = productsList.stream()
                .min((product1, product2)->
                        product1.getPrice() > product2.getPrice() ? 1: -1)
                .get();
        System.out.println(productB.getPrice());

        /*
        // Converting Product List into a Map
        Map<Integer,String> productPriceMap =
                productsList.stream()
                        .collect(Collectors.toMap(p->p.getId(), p->p.getName()));
        System.out.println(productPriceMap);
        */
        /*List<Float> productPriceList =
                productsList.stream()
                        .filter(p -> p.getPrice() > 28000f) // filtering data
                        .map(Product::getPrice)         // fetching price by referring getPrice method
                        .collect(Collectors.toList());  // collecting as list
        System.out.println(productPriceList);
        */

    }
}
