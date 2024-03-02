public class MonthData {
    private String itemName;
    private Boolean isExpense;
    private int quantity;
    private int unitPrice;
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
}
