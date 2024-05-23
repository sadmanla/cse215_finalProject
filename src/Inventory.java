import java.util.ArrayList ;
class Inventory implements Iterable {

    ArrayList <StockableProduct> items = new ArrayList <> ();

    public Inventory() {
    }

    public Inventory(ArrayList<StockableProduct> items) {
        this.items = items;
    }

    public void addItem (StockableProduct product) {

    }
    public void removeItem(int productId) {

    }
    public StockableProduct getItem (int productId) {

        return new StockableProduct();
    }
    public void addProductStock (int productId, int numberOfNewStock) {

    }

    public void sortByPrice() {

    }

    public void sortByAvailableStock() {

    }
}
