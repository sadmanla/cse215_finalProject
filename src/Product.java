abstract class Product {

    private String name;
    private int productId;
    private double price;
    private String genre;
    private int yearPublished;
    private double discount;

    public Product() {
        this.name = "johnappleseed";
        this.discount = 0;
        this.yearPublished = 2000;
        this.genre = "Generic";
        this.price = 0;
        this.productId = 12345;
    }

    public Product(String name,
                   double discount,
                   int yearPublished,
                   String genre,
                   double price,
                   int productid) {
        this.name = name;
        this.discount = discount;
        this.yearPublished = yearPublished;
        this.genre = genre;
        this.price = price;
        this.productId = productid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductid() {
        return productId;
    }

    public void setProductid(int productid) {
        this.productId = productid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    abstract public String getInfo ();

    abstract public String toString ();

}

