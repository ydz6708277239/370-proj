// Used to authenticate users of inventory management system
public class User implements Comparable {
    private String username;

    public User(String username) {
        this.username = username; 
    }

    @Override
    public int compareTo(Object o) {
        return this.username.compareTo(((User)o).username) < 0 ? -1 : 1;
    }
}
