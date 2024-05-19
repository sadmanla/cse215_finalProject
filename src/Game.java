class Game extends StockableProduct {

    private String developer;

    public Game() {
    }

    public Game(String developer) {
        this.developer = developer;
    }

    public Game(String name,
                double discount,
                int yearPublished,
                String genre,
                double price,
                int productId,
                int numberOfItemsStocked,
                String developer) {
        super(name, discount, yearPublished, genre, price, productId, numberOfItemsStocked);
        this.developer = developer;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;

    }

    public String getInfo () {
        //I will keep this part blank till getInfo and toString difference
        //is clear
        return "";
    }

    public String toString () {

        //I will keep this part blank till getInfo and toString difference
        //is clear
        return "";
    }
}
