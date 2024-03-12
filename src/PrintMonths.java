import java.util.ArrayList;
import java.util.HashMap;

public class PrintMonths {

    void printMonthStatistic (HashMap<Integer, ArrayList<MonthData>> monthReport) {
        // проверяем то, что отчет был считан ранее
        if (monthReport.isEmpty()) {
            System.out.println("Считайте месячные отчеты перед выводом статистики.");
            return;
        }
        for (int i = 0; i < monthReport.size(); i++) {
            ArrayList<MonthData> month = monthReport.get(i + 1);
            // выводим название месяца
            printMonthName(i);
            // выводим самую большую трату
            printExpenseMax(month);
            // выводим наиболее прибыльный товар
            printIncomeMax(month);
        }
    }

    private String monthName(int number) {
        String[] nameList = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        return nameList[number];
    }

    private void printMonthName(int number) {
        System.out.println(monthName(number));
    }

    public void printExpenseMax(ArrayList<MonthData> month) {
        int expense = 0;
        MonthData expenseMax = null;
        for (MonthData transaction : month) {
            int transactionSum = transaction.getUnitPrice() * transaction.getQuantity();
            if (transaction.getExpense() && transactionSum > expense) {
                expense = transactionSum;
                expenseMax = transaction;
            }
        }
        System.out.println("Самая большая трата:");
        System.out.println(expenseMax.getItemName() + " - " + expenseMax.getUnitPrice() * expenseMax.getQuantity());
        System.out.println();

    }
    public void printIncomeMax (ArrayList<MonthData> month) {
        int income = 0;
        MonthData incomeMax = null;
        for (MonthData transaction : month) {
            int transactionSum = transaction.getUnitPrice() * transaction.getQuantity();
            if (!transaction.getExpense() && transactionSum > income) {
                income = transactionSum;
                incomeMax = transaction;
            }
        }
        System.out.println("Самаый прибыльный товар:");
        System.out.println(incomeMax.getItemName() + " - " + incomeMax.getUnitPrice() * incomeMax.getQuantity());
        System.out.println();
    }
}