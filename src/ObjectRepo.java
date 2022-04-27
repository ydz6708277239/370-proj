import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class ObjectRepo {

	private Map<Integer, Item> item_repo = new TreeMap<Integer, Item>();
	private Map<String, Customer> customer_repo = new TreeMap<String, Customer>();
	private Map<Integer, Order> order_repo = new TreeMap<Integer, Order>();
	private Map<String, User> user_repo = new TreeMap<String, User>();

	private static ObjectRepo instance = null;
	protected ObjectRepo() {}
	public static void setTestingInstance(ObjectRepo dbi) {
		instance = dbi;
	}

	public static ObjectRepo getInstance() {
		if (instance == null) {
			instance = new ObjectRepo();
		}
		return instance;
	}

	public void addItem(int itemno, Item item) {
		item_repo.put(itemno, item);
	}

	public void addCustomer(String cname, Customer cst) {
		customer_repo.put(cname, cst);
	}

	public void addUser(String username, User usr) {
		user_repo.put(username, usr);
	}

	public void addInvoice(int invnum, Order invoice) {
		order_repo.put(invnum, invoice);
	}

	public Item getItem(int itemno) {
		return item_repo.get(itemno);
	}

	public Customer getCustomer(String custmr) {
		return customer_repo.get(custmr);
	}

	public User getUser(String username) {
		if (user_repo.contains(o)) {
			return user_repo.get(username);
		}
	}

	public Order getInvoice(int invno) {
		return order_repo.get(invno);
	}

}
