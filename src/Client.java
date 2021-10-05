import java.util.Scanner;

public class Client {
    public ISortMethod[] sortingMethods;
    public InventoryModule inventoryModule;

    public Client() {
        this.inventoryModule = new BasicInventory();
        this.sortingMethods = new ISortMethod[]{new BubbleSort(), new QuickSort(), new MergeSort()};
    }

    // The client showcase
    public void run() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Braeden Hunt's Inventory Manager!");
        while (true) {
            // Display UI
            System.out.println("-------------------------------------------------");
            System.out.println("You have a " + this.inventoryModule.inventoryName + ".");
            System.out.println("You have " + this.sortingMethods.length + " way(s) to sort it.");
            System.out.println("0) Currently Set Method");

            // Display sorting methods
            for (int i = 0; i < this.sortingMethods.length; i++) {
                System.out.println(i + 1 + ") " + this.sortingMethods[i].getClass().getCanonicalName());
            }

            // Get selection
            System.out.print("Selection: ");
            int selection = in.nextInt();
            if (selection < 0 || selection > this.sortingMethods.length) {
                System.out.print("Invalid selection: performing currently selected method by default.1");
            }

            // Set the sorting method to the selection
            if (selection != 0) {
                this.inventoryModule.setSortMethod(this.sortingMethods[selection - 1]);
            }

            // Perform the sort
            this.inventoryModule.performSort();
        }
    }
}
