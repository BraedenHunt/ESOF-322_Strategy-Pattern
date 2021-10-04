// A simple implementation of the InventoryModule class.
public class BasicInventory extends InventoryModule {

    public BasicInventory() {
        this.inventoryName = "Basic Inventory";
        this.inventory = new Object[10];
        this.sortMethod = new BubbleSort(); // Use BubbleSort by default
    }

}
