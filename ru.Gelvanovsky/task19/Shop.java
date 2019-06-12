package ru.Gelvanovsky.task19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Shop implements Basket {
    static  List<String> products = new ArrayList<>();
    static  List<Integer> quantitys = new ArrayList<>();
    public void addProduct(String product, int quantity) {
        products.add(product);
        quantitys.add(quantity);
    }
    public void removeProduct(String product) {
        products.remove(product);
    }
    public void updateProductQuantity(String product, int quantity){
    }
    public void clear() {
        products.removeAll(products);
        quantitys.removeAll(quantitys);
    }
    public List<String> getProducts() {
        List<String>product = products;
        iterateProducts(product);
        return product;
    }
    public int getProductQuantity(String product) {
        System.out.println("Введите номер товара");
        Scanner in = new Scanner(System.in);
        int productNumber = in.nextInt()-1;
        productNumber = quantitys.get(productNumber);
        System.out.println("Итоговое количество товара ["+productNumber+"]");
        return productNumber;
    }
    private static void iterateProducts(List<String>products){
        Iterator i = products.iterator();
        while (i.hasNext()) {
            System.out.print(i.next());
            System.out.print("; ");
        }
        System.out.println();
    }
}
