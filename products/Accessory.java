package products;

public class Accessory extends Product {
    private String color;

    public Accessory(String title, Double price, String color ) {
        super(title, price);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    protected String generateId() {
        return "3" + String.format("%03d" ,getProductCount());
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", color : %s" ,color );
    }
}
