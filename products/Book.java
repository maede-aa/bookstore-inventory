package products;

public class Book extends Product{
    private String author;
    private String publication;
    private String genre;

    public Book(String title, Double price, String author ,String publication ,String genre) {
        super(title, price);
        this.author = author;
        this.genre = genre;
        this.publication = publication;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublication() {
        return publication;
    }

    @Override
    protected String generateId() {
        return "1" + String.format("%03d" ,getProductCount());
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", author : %s, Publication : %s, Genre : %s" ,author ,publication ,genre );
    }
}
