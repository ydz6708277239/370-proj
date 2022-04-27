public class SingletonDemo {
    public static void print(String msg) {
        System.out.println(msg);
    }
    public static void main(String[] args) {
        ObjectRepo obj_repo = new ObjectRepo();
        print("object created");

        Customer new_customer = new Customer("JOHN", "DOE");
        obj_repo.addCustomer(new_customer);
    }
}
