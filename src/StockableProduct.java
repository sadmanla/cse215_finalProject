class StockableProduct extends
        Product implements Stockable {

    private int numberOfItemsStocked;

    public void addStock (int num) {
        this.numberOfItemsStocked += num;
    }

    public void removeStock (int num) {
        this.numberOfItemsStocked -= num;
    }

    public void editStock (int num) {
        this.numberOfItemsStocked = num;
    }

    public StockableProduct(String name,
                            double discount,
                            int yearPublished,
                            String genre,
                            double price,
                            int productId,
                            int numberOfItemsStocked) {
        super(name, discount, yearPublished, genre, price, productId);
        this.numberOfItemsStocked = numberOfItemsStocked;
    }

    public StockableProduct(int numberOfItemsStocked) {
        this.numberOfItemsStocked = numberOfItemsStocked;
    }

    public StockableProduct() {
    }

    @Override
    public String getInfo() {
        return "";
    }

    public int getNumberOfItemsStocked() {
        return numberOfItemsStocked;
    }

    public void setNumberOfItemsStocked(int numberOfItemsStocked) {
        this.numberOfItemsStocked = numberOfItemsStocked;
    }

    public String toString () {
        return "";
    }
}
