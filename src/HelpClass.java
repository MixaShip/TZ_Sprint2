import java.util.ArrayList;
import java.util.HashMap;

public class HelpClass {
    boolean checkReport (HashMap<Integer, ArrayList<MonthData>> monthsReport,
                             HashMap<Integer, YearData> yearsReport) {
        // проверка отчетов на считывание из файлов
        if (monthsReport.isEmpty() || yearsReport.isEmpty()){
            System.out.println("Считайте отчеты перед началом сверки.");
            return false;
        }
        return true;
    }
    public void getSumMonths (HashMap<Integer,Integer> sumMonths,
                                 HashMap<Integer, YearData> yearReport) {
        System.out.println(sumMonths);
        System.out.println(yearReport);
        if ((sumMonths.get(-1) == yearReport.get(-1).getAmount()) || (sumMonths.get(1) == yearReport.get(1).getAmount())) {
            System.out.println("Январь проверку прошел");
        } else {
            System.out.println("В январе ошибка");
        }
        if ((sumMonths.get(-2) == yearReport.get(-2).getAmount()) || (sumMonths.get(2) == yearReport.get(2).getAmount())) {
            System.out.println("Февраль проверку прошел");
        } else {
            System.out.println("В феврале ошибка");
        }
        if ((sumMonths.get(-3) == yearReport.get(-3).getAmount()) || (sumMonths.get(3) == yearReport.get(3).getAmount())) {
            System.out.println("Март проверку прошел");
        } else {
            System.out.println("В феврале ошибка");
        }
    }
}