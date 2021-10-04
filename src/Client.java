import java.util.Scanner;

public class Client {
    public ISortMethod[] sortingMethods;
    public InventoryModule inventoryModule;

    public Client() {
        this.inventoryModule = new BasicInventory();
        this.sortingMethods = new ISortMethod[]{new BubbleSort(), new QuickSort(), new MergeSort()};
    }

    public static void main(String[] args) {
        Client client = new Client();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Braeden Hunt's Inventory Manager!");
        while (true) {
            System.out.println("-------------------------------------------------");
            System.out.println("You have a " + client.inventoryModule.inventoryName + ".");
            System.out.println("You have " + client.sortingMethods.length + " way(s) to sort it.");
            System.out.println("0) Currently Set Method");
            for (int i = 0; i < client.sortingMethods.length; i++) {
                System.out.println(i + 1 + ") " + client.sortingMethods[i].getClass().getCanonicalName());
            }
            System.out.print("Selection: ");
            int selection = in.nextInt();
            if (selection < 0 || selection > client.sortingMethods.length) {
                System.out.print("Invalid selection: performing currently selected method by default.1");
            }
            if (selection != 0) {
                client.inventoryModule.setSortMethod(client.sortingMethods[selection - 1]);
            }
            client.inventoryModule.performSort();
        }
    }
}
