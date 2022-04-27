class ObjectRepoTest {
	
	// make sure we cannot create more than one instance
	ObjectRepo tester = new ObjectRepo();
	// fill ObjectRepo with test data (items/customers/orders/users)
	ObjectRepo.setTestingInstance(tester);
	tester.addItem();
	tester.addCustomer();
	tester.addInvoice();
	tester.addUser();
}