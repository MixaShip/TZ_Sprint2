import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MonthlyReport monthlyReport = new MonthlyReport();
        YearlyReport yearlyReport = new YearlyReport();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                // Тут можно проверить, а есть ли в отчетах какие-либо данные
                monthlyReport.getMonthReport();
                // А здесь вывести сообщение пользователю, что отчеты успешно считаны
            } else if (command == 2) {
                // То же самое как и для 1 пункта
                yearlyReport.getYearReport();
                // То же самое как и для 1 пункта
            } /*else if (command == 3) {

            // Что бы не писать тут много логики лучшим решением будет создать отдельный класс, который будет обрабатывать
            // информацию и выводить отчеты. (А лучше разделить на 3 класса: проверка отчетов, печать месячного отчета и печать годового отчета).
            // А тут будет только вызов метода.
            // Пример: helpClass.checkReport(monthlyReport.months, yearlyReport.years)

            } else if (command == 4) {

            // Вот тут потом можно будет использовать данные из месячных отчетов
            // Пример: helpClass.printReport(monthlyReport.months)

            } */else {
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