public abstract class InventoryModule {
    public String inventoryName;
    protected Object[] inventory;
    protected ISortMethod sortMethod;

    public void setSortMethod(ISortMethod sortMethod) {
        this.sortMethod = sortMethod;
    }

    public void performSort() {
        this.sortMethod.sort();
    }
}
