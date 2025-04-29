package products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;
    private static int productCount = 0;

    public Product(String title ,Double price ) {
        this.title = title;
        this.price = price;
        this.id = generateId();
        ++productCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public static int getProductCount() {
        return productCount;
    }

    public String toString() {
        return String.format("ID : %s, Title : %s, Price : %f" ,id , title ,price );
    }

    protected abstract String generateId();
}
