public abstract class InventoryModule {
    public String inventoryName;
    protected Object[] inventory;
    protected ISortMethod sortMethod; // Store the sort method

    // Set the sorting method
    public void setSortMethod(ISortMethod sortMethod) {
        this.sortMethod = sortMethod;
    }

    // Run the stored sorting algorithm
    public void performSort() {
        this.sortMethod.sort();
    }
}
