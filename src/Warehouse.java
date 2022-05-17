import java.util.*;


public class Warehouse {

    private final int warehouseNumber;
    private ArrayList<InventoryItem> items;

    public Warehouse(int location) {
        warehouseNumber = location;
        items = new ArrayList<>();
//        for (InventoryItem item : args) {
//            items.add(item);
//        }
    }

    public Warehouse(int location, InventoryItem args) {
        warehouseNumber = location;
        items.add(args);
//        for (InventoryItem item : args) {
//            items.add(item);
//        }
    }

    public void viewInventory() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getItemName() + " " + items.get(i).getStock());
        }
    }

    public void addInventory(InventoryItem item) {
        items.add(item);
    }

    public void addInventoryList(InventoryItem[] args) {
        items.addAll(Arrays.asList(args));
    }

    public void addInventory(String name, int quantity) {
        InventoryItem item = new InventoryItem(name, quantity);
        items.add(item);
    }

    public void deleteItem(InventoryItem item) {
        int numberDeleted;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                items.remove(i);
                break;
            }
        }
    }

    public void editItemStock(InventoryItem item, int change) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                items.get(i).setStock(change);
                break;
            }
        }
    }

    public void addItemStock(InventoryItem item, int added) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                items.get(i).setStock(items.get(i).getStock() + added);
                break;
            }
        }
    }

    public void removeItemStock(InventoryItem item, int deleted) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                items.get(i).setStock(items.get(i).getStock() - deleted);
                break;
            }
        }
    }

}
