public class MonthData {
    private final String itemName;
    private final Boolean isExpense;
    private final int quantity;
    private final int unitPrice;
    public MonthData (String itemName, Boolean isExpense, int quantity, int unitPrice) {
        this.itemName = itemName;
        this.isExpense = isExpense;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public String getItemName(){
        return itemName;
    }
    public Boolean getExpense() {
        return isExpense;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getUnitPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {
        return this.itemName + ";" + this.isExpense + ";" + this.quantity + ";" + this.unitPrice;
    }
}
