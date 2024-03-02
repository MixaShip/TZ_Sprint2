import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MonthlyReport monthlyReport = new MonthlyReport();
        Scanner scanner = new Scanner(System.in);

        MonthData Month = new MonthData();

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                monthlyReport.getMonthReport();

                }

                /*ArrayList<String> lines = fileReader.readFileContents(fileName);
                System.out.println(lines);
                System.out.println(lines.get(0));
                String[] lineContents = lines.get(0).split(",");
                System.out.println(lineContents[0]);
                System.out.println(lineContents[1]);
                System.out.println(lineContents[2]);
                System.out.println(lineContents[3]);*/

            } else if (command == 2) {
                System.out.println("Введите название файла годового отчета");
                String fileName = scanner.nextLine();
                ArrayList<String> lines = fileReader.readFileContents(fileName);
            } /*else if (command == 3) {

            } else if (command == 4) {

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