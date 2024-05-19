import java.util.ArrayList ;
import java.lang.Object;
import java.time.LocalDateTime;

public class Invoice {

    ArrayList <Product> items = new ArrayList <> ();
    LocalDateTime date;

    public Invoice() {

    }

    public Invoice(ArrayList<Product> items) {
        this.items = items;
    }

    public String getLocalDatetime() {

        return "";
    }

    public void addProduct (Product product) {

    }

    public void removeProduct (Product product) {

    }

    public double calculatePriceWithoutDiscount () {

        return 0;
    }

    public boolean isFullHouseDiscountAvailable() {

        return false;
    }

    public double calculateDiscountedPrice () {

        return 0;
    }

    public String getInvoice () {

        return "";
    }

}
