import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MonthlyReport monthlyReport = new MonthlyReport();
        YearlyReport yearlyReport = new YearlyReport();
        HelpClass helpClass = new HelpClass();
        PrintMonths printMonths =new PrintMonths();
        PrintYears printYears = new PrintYears();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            printMenu();

            int command = scanner.nextInt();

            if (command == 1) {
                monthlyReport.getMonthReport();
                System.out.println("Месячные отчеты успешно считаны");
            } else if (command == 2) {
                yearlyReport.getYearReport();
                System.out.println("Годовой отчет успешно считан");
            } else if (command == 3) {
                helpClass.checkReport (monthlyReport.months, yearlyReport.years);
                helpClass.getSumMonths (monthlyReport.sumMonths, yearlyReport.years);
            }else if (command == 4) {
                printMonths.printMonthStatistic(monthlyReport.months);
            } else if (command == 5) {
                printYears.printYearStatistic(yearlyReport.years);
            } else {
                System.out.println("Извините, такой команды пока нет.");

            }
        }
    }

    public static void printMenu(){
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Считать все месячные отчёты"); //прочитать данные из файлов месячных отчётов, сохранить их в память программы.
        System.out.println("2 - Считать годовой отчёт"); //прочитать данные из файла годового отчёта, сохранить их в память программы.
        System.out.println("3 - Сверить отчёты"); //по сохранённым данным проверить, сходятся ли отчёты за месяцы и за год.
        System.out.println("4 - Вывести информацию обо всех месячных отчётах"); //по сохранённым данным вывести в консоль имеющуюся информацию.
        System.out.println("5 - Вывести информацию о годовом отчёте"); //по сохранённым данным вывести в консоль имеющуюся информацию.
        System.out.println("0 - Выход");
    }

}