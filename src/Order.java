import java.util.List;

public class Order {
    private int orderno;
    private Customer customer;
    private List<Item> purchase;
    public Order(int orderno, List<Item> purchase, Customer customer) {
        this.orderno = orderno; 
        this.purchase = purchase;
        this.customer = customer;
    }    
}
