import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ObjectRepoTest {
	// make sure we cannot create more than one instance
	// fill ObjectRepo with test data (items/customers/orders/users)
	@Test
	public void addInvoiceTest() {
		ObjectRepo tester1 = new ObjectRepo();
		List<Item> order = new ArrayList<>(List.of(new Item(23, "Hair dryer")));
		Customer c = new Customer("JOHN", "WAYNE");
		tester1.addInvoice(1, new Order(58, order, c));
		assertTrue(tester1.getInvoices().size() == 1);
	}

	@Test
	public void addCustomerTest() {
		ObjectRepo tester1 = new ObjectRepo();
		tester1.addCustomer("CAROL BECKETT", new Customer("CAROL", "BECKETT"));
		assertTrue(tester1.getCustomers().size() == 1);
	} 
}