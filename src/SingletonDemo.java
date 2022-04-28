public class SingletonDemo {
    public static void print(String msg) {
        System.out.println(msg);
    }
    public static void printMap(String msg) {
        // for () {
        //     System.out.println(msg);
        // }
    }

    public static void main(String[] args) {
        ObjectRepo obj_repo = new ObjectRepo();
        print("object created");

        Customer new_customer1 = new Customer("JOHN", "DOE");
        Customer new_customer2 = new Customer("ALICE", "DOE");
        obj_repo.addCustomer("JOHN DOE", new_customer1);
        obj_repo.addCustomer("ALICE DOE", new_customer2);

    }
}
