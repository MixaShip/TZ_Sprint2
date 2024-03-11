public class YearData {
    private final int month;
    private final int amount;
    private Boolean isExpense;
    private String year;
    public YearData(int month, int amount, Boolean isExpense, String year) {
        this.month = month;
        this.amount = amount;
        this.isExpense = isExpense;
        this.year = year;
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
    public String getYear() {return year; }

    @Override
    public String toString() {
        return this.month + ";" + this.amount + ";" + this.isExpense;
    }
}
