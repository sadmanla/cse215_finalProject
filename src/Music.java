class Music extends StockableProduct {

    private String artistName;

    public Music() {
    }

    public Music(String artistName) {
        this.artistName = artistName;
    }

    public Music(String name, double discount,
                 int yearPublished,
                 String genre,
                 double price,
                 int productId,
                 int numberOfItemsStocked,
                 String artistName) {
        super(name, discount, yearPublished, genre, price, productId, numberOfItemsStocked);
        this.artistName = artistName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getInfo () {

        //I will keep this part blank till getInfo and toString difference
        //is clear
        return " ";
    }

    public String toString () {
        //I will keep this part blank till getInfo and toString difference
        //is clear
        return " ";
    }
}
