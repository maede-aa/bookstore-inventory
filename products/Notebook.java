package products;

public class Notebook extends Product{
    private int pageCount;
    private boolean isHardCover;

    public Notebook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    public int getPageCount() {
        return pageCount;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Page : %d, Hard Cover : %b" ,pageCount ,isHardCover );
    }

    @Override
    protected String generateId() {
        return "2" + String.format("%03d" ,getProductCount());
    }
}
