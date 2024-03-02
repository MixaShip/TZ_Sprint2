import java.util.ArrayList;
//Считывание месячных отчётов
public class MonthlyReport {
    private String fileName;
    // Все считанные месяцы лучше хранить здесь.
    // Структуру для хранения данных лучше изменить с ArrayList<MonthData> на HashMap<Integer, ArrayList<MonthData>>.
    // В HashMap можем четко указать в ключе номер месяца и потом по этому же ключу получить данные.
    // ArrayList лучше не использовать, т.к. он не гарантирует очередность записанных в него данных.
    // public HashMap<Integer, ArrayList<MonthData>> months = ...

    void getMonthReport() {
        FileReader fileReader = new FileReader();
        for (int i = 1; i <= 3; i++) {
            fileName = "m.20210" + i + ".csv";
            ArrayList<String> lines = fileReader.readFileContents(fileName);
            // переменную months лучше вынести из метода
            ArrayList<MonthData> months = new ArrayList<>();
            for (int k = 1; k < lines.size(); k++) {
                String[] lineContents = lines.get(k).split(",");
                MonthData data = new MonthData(lineContents[0],
                        Boolean.parseBoolean(lineContents[1]),
                        Integer.parseInt(lineContents[2]),
                        Integer.parseInt((lineContents[3])));
                // Записываем в список
                months.add(data);

            }
            System.out.println(months);
        }
    }
}
