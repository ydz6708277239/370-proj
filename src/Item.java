public class Item implements Comparable {
    private int itemno;
    private String description;

    public Item(int itemno, String description) {
        this.itemno = itemno; 
        this.description = description;
    }

    @Override
    public int compareTo(Object o) {
        return this.itemno < ((Item)o).itemno ? -1 : 1;
    }
    
}
