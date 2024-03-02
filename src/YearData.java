public class YearData {
    private int month;
    private int amount;
    private Boolean isExpense;
    public YearData(int month, int amount, Boolean isExpense) {
        this.month = month;
        this.amount = amount;
        this.isExpense = isExpense;
    }
    public int getMonth() {
        return month;
    }
    public int getAmount() {
        return amount;
    }
    public Boolean getIsExpense() {
        return isExpense;
    }

    // вот тут тоже лучше переопределить метод toString()
    // public String toString()...
}
