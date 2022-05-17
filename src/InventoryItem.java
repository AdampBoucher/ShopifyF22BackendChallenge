public class InventoryItem {

    private final int itemNumber;
    private String itemName;
    private int stock;

    public InventoryItem(String name, int quantity) {
        itemNumber = (int)Math.floor(Math.random() * 100000000); //creates random 8-digit number
        itemName = name;
        stock = quantity;
    }

    public boolean equals(InventoryItem item) {
        boolean isSame;
        if (this.itemNumber == item.itemNumber && this.itemName.equals(item.itemName)) {
            isSame = true;
        }
        else {
            isSame = false;
        }
        return isSame;
    }



    public int getItemNumber() {
        return itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}
