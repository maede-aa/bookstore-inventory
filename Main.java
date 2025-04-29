import inventory.Inventory;
import products.*;

public class Main {
    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        double total = 0;
        for (Product item : inventory.getItems()) {
            total += item.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Notebook> notebookInventory = new Inventory<>();
        Inventory<Accessory> accessoryInventory = new Inventory<>();

        bookInventory.addItem(new Book("Java Programming", 100.0, "John Doe", "TechPub", "Educational"));
        bookInventory.addItem(new Book("Clean Code", 99.99, "Robert C. Martin", "Prentice Hall", "Programming"));

        notebookInventory.addItem(new Notebook("school Notebook", 31.45, 120, false));
        notebookInventory.addItem(new Notebook("patterned Notebook", 40.04, 100, true));

        accessoryInventory.addItem(new Accessory("mouse pad", 45.54, "black"));
        accessoryInventory.addItem(new Accessory("USB cable", 33.33, "white"));

        bookInventory.displayAll();
        notebookInventory.displayAll();
        accessoryInventory.displayAll();

        bookInventory.removeItemById("1001");
        notebookInventory.removeItemById("2001");

        System.out.printf("total books price : %.2f \n", calculateTotalPrice(bookInventory));
        System.out.printf("total notebooks price : %.2f \n", calculateTotalPrice(notebookInventory));
        System.out.printf("total accessories price : %.2f \n", calculateTotalPrice(accessoryInventory));

        System.out.println(bookInventory.findItemById("1002"));
        System.out.println(bookInventory.findItemById("9009"));

        bookInventory.applyDiscount("Clean Code", 10);
        accessoryInventory.applyDiscount("Mouse Pad", 20);

        System.out.println(" -- After Discount -- ");
        bookInventory.displayAll();
        accessoryInventory.displayAll();
        }
    }