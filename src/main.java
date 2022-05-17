public class main {

    public static void main (String[] args) {

        Warehouse warehouse1 = new Warehouse(234234);
        InventoryItem[] items = new InventoryItem[4];
        items[0] = new InventoryItem("Soap", 12);
        items[1] = new InventoryItem("Shampoo", 3);
        items[2] = new InventoryItem("Conditioner", 8);
        items[3] = new InventoryItem("Moisturizer", 28);

        warehouse1.addInventoryList(items);

        warehouse1.viewInventory();

        warehouse1.editItemStock(items[1], 9);
        warehouse1.viewInventory();

        warehouse1.addItemStock(items[0], 9);
        warehouse1.viewInventory();

        warehouse1.removeItemStock(items[0], 1);
        warehouse1.viewInventory();

    }

}
