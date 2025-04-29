package inventory;

import products.Product;

import java.util.ArrayList;

public class Inventory<T extends Product> {
    private ArrayList<T> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(T product) {
        items.add(product);
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public void removeItemById(String id) {
        for(int i = 0 ; i < items.size() ; ++i) {
            if(items.get(i).getId().equals(id)) {
                items.remove(i);
                break;
            }
        }
    }

    public T findItemById(String id) {
        for(T item : items) {
            if(item.getId().equals(id))
                return item;
        }
        System.out.println("error : product with id " + id + " not found!");
        return null;
    }

    public void applyDiscount(String productName, int discount) {
        for(T item : items) {
            if(item.getTitle().equals(productName)) {
                double newPrice = item.getPrice() * (100 - discount) / 100;
                item.setPrice(newPrice);
            }
        }
    }

    public void displayAll() {
        for (T item : items)
            System.out.println(item);
    }
}
