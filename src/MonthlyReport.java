import java.util.ArrayList;
//Считывание месячных отчётов
public class MonthlyReport {
    private String fileName;

    void getMonthReport() {
        FileReader fileReader = new FileReader();
        for (int i = 1; i <= 3; i++) {
            fileName = "m.20210" + i + ".csv";
            ArrayList<String> lines = fileReader.readFileContents(fileName);
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
