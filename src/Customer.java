public class Customer implements Comparable {
    private String fname;
    private String lname;

    public Customer(String fname, String lname) {
        this.fname = fname; 
        this.lname = lname;
    }
    @Override
    public int compareTo(Object o) {
        return this.lname.compareTo(((Customer)o).lname) < 0 ? -1 : 1;
    }

}
