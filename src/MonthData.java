public class MonthData {
    // Если переменная потом не будет изменяться, то лучше ее финализировать
    // private final String ... и так далее
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

    // желательно переопределять метод toString(). При откадке через консоль это сильно поможет
    // было, например: [MonthData@6f539caf, MonthData@79fc0f2f, MonthData@50040f0c, MonthData@2dda6444, MonthData@5e9f23b4, MonthData@4783da3f]
    // стало: [Коньки;true;50;2000, Новогодняя ёлка;true;1;100000, Ларёк с кофе;true;3;50000, Аренда коньков;false;1000;180, Продажа билетов;false;3500;300, Продажа кофе;false;2421;150]
    @Override
    public String toString() {
        return this.itemName + ";" + this.isExpense + ";" + this.quantity + ";" + this.unitPrice;
    }
}
