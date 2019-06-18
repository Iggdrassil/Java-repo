package ru.Gelvanovsky.task21;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Shop implements Basket {
    static Map<String, Integer> products = new TreeMap<String,Integer>();
    public void addProduct(String product, int quantity) {
        products.put(product,quantity);
    }

    public void removeProduct(String product) {
        if (products.containsKey(product)){
            products.remove(product);
            System.out.println("Товар удален");
        }else {
            System.out.println("Нет такого товара");
        }
    }

    public void updateProductQuantity(String product, int quantity) {
        if (products.containsKey(product)){
            int replaceQuantity = products.get(product);
            products.replace(product,replaceQuantity,quantity);
            System.out.println("Количество товара изменено с ["+replaceQuantity+"] на ["+quantity+"]");
        }else {
            System.out.println("Нет такого товара");
        }
    }

    public void clear() {
        products.clear();
    }

    public List<String> getProducts() {
        System.out.println(products);
        return null;
    }

    public int getProductQuantity(String product) {
        int quantity = 0;
        if (products.containsKey(product)){
            quantity = products.get(product);
            System.out.println(quantity);
        }else {
            System.out.println("Нет такого товара");
        }
        return quantity;
    }
}
