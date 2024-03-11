
import java.util.HashMap;

public class PrintYears {
    void printYearStatistic (HashMap<Integer, YearData> yearReport) {
        // проверяем то, что отчет был считан ранее
        if (yearReport.isEmpty()) {
            System.out.println("Считайте годовой отчет перед выводом статистики.");
            return;
        }
        // выводим рассматриваемый год
        System.out.println(yearReport.get(1).getYear());
        // выводим прибыль по каждому месяцу
        printMonthResult(yearReport);
        // выводим средний расход за все имеющиеся операции в году
        //printAverageYearExpense(yearReport);
        // выводим средний доход за все имеющиеся операции в году
        //printAverageYearIncome(yearReport);
    }

    private void printMonthResult(HashMap<Integer, YearData> yearReport) {
        int doxod = 0;
        int rasxod = 0;
        for (int i = 1; i <= yearReport.size() / 2; i++) {
            YearData monthIncomePart = yearReport.get(i);
            YearData monthExpensePart = yearReport.get(-i);
            int profit;
            int expense = 0;
            int income = 0;
            if (monthIncomePart.getIsExpense()) {
                expense = monthIncomePart.getAmount();
            } else {
                income = monthIncomePart.getAmount();
            }
            if (monthExpensePart.getIsExpense()) {
                expense = monthExpensePart.getAmount();
            } else {
                income = monthExpensePart.getAmount();
            }
            // считаем прибыль
            profit = income - expense;
            String profitName = "прибыль";
            if (profit < 0) {
                profitName = "убыток";
            }
            System.out.println("В " + i + " месяце " + profitName + ": " + profit);
            doxod += income;
            rasxod += expense;
        }
        System.out.println("Средний доход за все месяцы в году:" + (doxod / (yearReport.size() / 2)));
        System.out.println("Средний расход за все месяцы в году:" + (rasxod / (yearReport.size() / 2)));
        System.out.println(yearReport.size());
    }
}


