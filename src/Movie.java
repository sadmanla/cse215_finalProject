class Movie extends StockableProduct {

    private String director;

    public Movie() {
    }

    public Movie(String director) {
        this.director = director;
    }

    public Movie(String name,
                 double discount,
                 int yearPublished,
                 String genre,
                 double price,
                 int productId,
                 int numberOfItemsStocked,
                 String director) {
        super(name, discount, yearPublished, genre, price, productId, numberOfItemsStocked);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
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
